#!/usr/bin/env python3
"""Read every input file; parse Java declarations/comments and emit a reproducible import graph.

This is syntax analysis, not resolved Java calls, binary ABI analysis or human review of every line.
"""
import collections
import csv
import hashlib
import html
import json
from pathlib import Path
import re

import tree_sitter_java
from tree_sitter import Language, Parser

from reference_inputs import reference_inputs

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / 'docs/generated'
PARSER = Parser(Language(tree_sitter_java.language()))
TYPES = {'class_declaration', 'interface_declaration', 'enum_declaration', 'annotation_type_declaration', 'record_declaration'}
MEMBERS = {'method_declaration', 'constructor_declaration', 'compact_constructor_declaration', 'field_declaration', 'constant_declaration', 'annotation_type_element_declaration', 'enum_constant'}
ROOT_PACKAGE = 'meteordevelopment.meteorclient'


def digest(data):
    return hashlib.sha256(data).hexdigest()


def dump(name, data):
    (OUT / name).write_text(json.dumps(data, ensure_ascii=False, indent=2) + '\n', encoding='utf-8')


def component(path):
    s = str(path).replace('\\', '/')
    for module in ('foundation', 'api', 'example-addon'):
        if s.startswith(module + '/'):
            return 'meteor-api/' + module
    for upstream in ('ModMenu-1.21.11', 'PacketFixer-ver-1.21.11', 'common-networking-1.21.11', 'Networking-Projects-main', 'fabric-api-1.21.11'):
        if s.startswith('upstream/' + upstream + '/'):
            return upstream
    if '/src/launcher/' in s: return 'launcher'
    if '/src/main/java/meteordevelopment/meteorclient/' not in s: return 'build-resources-docs'
    suffix = s.split('/src/main/java/meteordevelopment/meteorclient/', 1)[1]
    parts = suffix.split('/')
    if parts[0] in ('systems', 'utils') and len(parts) > 2: return '/'.join(parts[:2])
    return parts[0] if len(parts) > 1 else 'bootstrap'


def source_text(data, node):
    return data[node.start_byte:node.end_byte].decode('utf-8') if node else ''


def walk(node):
    yield node
    for child in node.named_children:
        yield from walk(child)


def declaration_header(data, node):
    body = node.child_by_field_name('body')
    text = data[node.start_byte:(body.start_byte if body else node.end_byte)].decode('utf-8')
    return re.sub(r'\s+', ' ', text).strip().rstrip(';')


def parse_java(path, data):
    tree = PARSER.parse(data)
    package = next((source_text(data, n).removeprefix('package ').rstrip(';').strip()
        for n in tree.root_node.named_children if n.type == 'package_declaration'), '')
    imports = [source_text(data, n).removeprefix('import ').rstrip(';').strip()
        for n in tree.root_node.named_children if n.type == 'import_declaration']
    symbols, comments, errors = [], [], []
    for node in walk(tree.root_node):
        if node.type in ('line_comment', 'block_comment'):
            text = source_text(data, node)
            comments.append({'file': path, 'line': node.start_point.row + 1,
                'kind': node.type, 'text': text,
                'flags': re.findall(r'\b(?:TODO|FIXME|HACK|XXX|NOTE|WARNING)\b', text, re.I)})
        if node.type == 'ERROR' or node.is_missing:
            errors.append({'file': path, 'line': node.start_point.row + 1, 'type': node.type, 'excerpt': source_text(data, node)[:240]})
        if node.type not in TYPES | MEMBERS: continue
        parents, parent, accessible = [], node.parent, True
        while parent:
            if parent.type in TYPES:
                parents.append(source_text(data, parent.child_by_field_name('name')))
                mods = next((source_text(data, n) for n in parent.named_children if n.type == 'modifiers'), '')
                # Enclosing private and local classes are not exported API.
                if re.search(r'\bprivate\b', mods): accessible = False
            if parent.type in ('method_declaration', 'constructor_declaration', 'lambda_expression', 'object_creation_expression'):
                accessible = False
            parent = parent.parent
        parents.reverse()
        mods = next((source_text(data, n) for n in node.named_children if n.type == 'modifiers'), '')
        enclosing_interface = node.parent and node.parent.type in ('interface_body', 'annotation_type_body')
        exported = accessible and (bool(re.search(r'\b(public|protected)\b', mods)) or
            bool(enclosing_interface and not re.search(r'\bprivate\b', mods)))
        names = [source_text(data, node.child_by_field_name('name'))]
        if node.type in ('field_declaration', 'constant_declaration'):
            names = [source_text(data, n.child_by_field_name('name')) for n in node.named_children if n.type == 'variable_declarator']
        for name in names:
            qualified = '.'.join(filter(None, [package] + parents + [name]))
            entry = {'file': path, 'line': node.start_point.row + 1, 'end_line': node.end_point.row + 1,
                'kind': node.type, 'name': name, 'qualified': qualified, 'owner': '.'.join([package] + parents),
                'header': declaration_header(data, node), 'public_or_protected_syntax': exported,
                'component': component(path)}
            symbols.append(entry)
    return {'file': path, 'source': data.decode('utf-8'), 'package': package, 'imports': imports, 'symbols': symbols,
        'comments': comments, 'parse_errors': errors}


def inventory(entries):
    rows, java = [], []
    for relative, data in entries:
        row = {'file': relative, 'bytes': len(data), 'sha256': digest(data), 'component': component(relative)}
        try:
            text = data.decode('utf-8')
            if '\x00' in text: raise UnicodeDecodeError('utf-8', data, 0, 1, 'binary null')
            row.update(kind='text', lines=len(text.splitlines()))
        except UnicodeDecodeError:
            row.update(kind='binary', signature_hex=data[:16].hex())
        if relative.endswith('.java'): java.append(parse_java(relative, data))
        rows.append(row)
    return rows, java


def import_edges(java):
    by_type = {}
    packages = collections.defaultdict(list)
    for file in java:
        packages[file['package']].append(file['file'])
        for symbol in file['symbols']:
            if symbol['kind'] in TYPES: by_type[symbol['qualified']] = file['file']
    edges = set()
    for file in java:
        for imported in file['imports']:
            name = imported.removeprefix('static ')
            if name.endswith('.*'):
                targets = packages.get(name[:-2], [])
                # Static wildcard imports target a type, not a package.
                if not targets and name[:-2] in by_type: targets = [by_type[name[:-2]]]
            else:
                target = name
                while target not in by_type and '.' in target: target = target.rsplit('.', 1)[0]
                targets = [by_type[target]] if target in by_type else []
            for target in targets:
                if file['file'] != target: edges.add((file['file'], target, 'explicit-import'))
        # Same-package references are candidate dependencies only; resolve by matching identifiers.
        data = file['source']
        for target in packages[file['package']]:
            if target != file['file'] and re.search(r'\b' + re.escape(Path(target).stem) + r'\b', data):
                edges.add((file['file'], target, 'same-package-name-candidate'))
    return sorted(edges)


def catalog(label, rows, java):
    symbols = [symbol for file in java for symbol in file['symbols']]
    comments = [comment for file in java for comment in file['comments']]
    errors = [error for file in java for error in file['parse_errors']]
    edges = import_edges(java)
    dump(f'{label}-files.json', rows)
    dump(f'{label}-api.json', symbols)
    dump(f'{label}-comments.json', comments)
    dump(f'{label}-parse-errors.json', errors)
    dump(f'{label}-import-graph.json', {'kind': 'syntactic imports and same-package candidates; not resolved calls', 'edges': edges})
    with (OUT / f'{label}-files.csv').open('w', newline='', encoding='utf-8') as stream:
        writer = csv.DictWriter(stream, fieldnames=['file', 'kind', 'bytes', 'lines', 'component', 'sha256', 'signature_hex'])
        writer.writeheader(); writer.writerows(rows)
    grouped = collections.defaultdict(list)
    for symbol in symbols:
        if symbol['public_or_protected_syntax']: grouped[symbol['component']].append(symbol)
    doc_dir = OUT / label
    doc_dir.mkdir(exist_ok=True)
    links = []
    for name, entries in sorted(grouped.items()):
        slug = name.replace('/', '-')
        lines = [f'# {name}', '', 'Khai báo Java có cú pháp public/protected. Không bao gồm API kế thừa/tổng hợp bởi compiler; xem kiểm tra bytecode riêng.', '']
        for entry in entries:
            lines += [f"## {entry['qualified']}", '', f"Nguồn: `{entry['file']}:{entry['line']}`", '', '```java', entry['header'], '```', '']
        (doc_dir / f'{slug}.md').write_text('\n'.join(lines), encoding='utf-8')
        links.append(f'- [{name}]({label}/{slug}.md): {len(entries)} khai báo')
    (OUT / f'{label}-API-INDEX.md').write_text('# Danh mục API ' + label + '\n\n' + '\n'.join(links) + '\n', encoding='utf-8')
    comp_edges = collections.Counter((component(src), component(dst)) for src, dst, _ in edges if component(src) != component(dst))
    dump(f'{label}-components.json', [{'from': src, 'to': dst, 'edges': count} for (src, dst), count in sorted(comp_edges.items())])
    with (OUT / f'{label}-components.dot').open('w', encoding='utf-8') as stream:
        stream.write('digraph Imports {\nrankdir=LR;\n')
        for (src, dst), count in sorted(comp_edges.items()):
            stream.write(f'{json.dumps(src)} -> {json.dumps(dst)} [label="{count}"];\n')
        stream.write('}\n')
    return {'files': len(rows), 'text_files': sum(r['kind'] == 'text' for r in rows),
        'binary_files': sum(r['kind'] == 'binary' for r in rows), 'java_files': len(java),
        'java_lines': sum(r.get('lines', 0) for r in rows if r['file'].endswith('.java')),
        'declarations': len(symbols), 'public_or_protected_syntax': sum(s['public_or_protected_syntax'] for s in symbols),
        'comments': len(comments), 'parse_errors': len(errors), 'dependency_edges': len(edges),
        'components': dict(collections.Counter(component(f['file']) for f in java))}, symbols


def main():
    OUT.mkdir(parents=True, exist_ok=True)
    all_rows, all_java = inventory(reference_inputs(ROOT))
    all_rows.sort(key=lambda row: Path(row['file']))
    all_java.sort(key=lambda row: Path(row['file']))
    active = 'upstream/meteor-1.21.11/'
    reference = 'upstream/reference-26.3/'
    stats = {}
    stats['1.21.11'], old = catalog('1.21.11', [r for r in all_rows if r['file'].startswith(active)], [j for j in all_java if j['file'].startswith(active)])
    stats['26.3-reference'], new = catalog('26.3', [r for r in all_rows if r['file'].startswith(reference)], [j for j in all_java if j['file'].startswith(reference)])
    sdk_rows, sdk_java = [], []
    for module in ('foundation', 'api', 'example-addon'):
        directory = ROOT / module / 'src'
        entries = ((file.relative_to(ROOT).as_posix(), file.read_bytes())
                   for file in sorted(directory.rglob('*')) if file.is_file())
        rows, java = inventory(entries)
        sdk_rows.extend(rows); sdk_java.extend(java)
    stats['meteor-api'], _ = catalog('meteor-api', sdk_rows, sdk_java)
    for dependency in ('ModMenu-1.21.11', 'PacketFixer-ver-1.21.11', 'common-networking-1.21.11', 'Networking-Projects-main', 'fabric-api-1.21.11'):
        prefix = 'upstream/' + dependency + '/'
        stats[dependency], _ = catalog(dependency, [row for row in all_rows if row['file'].startswith(prefix)], [java for java in all_java if java['file'].startswith(prefix)])
    dump('all-input-files.json', all_rows)
    dump('all-input-comments.json', [c for j in all_java for c in j['comments']])
    dump('all-input-java-parse-errors.json', [e for j in all_java for e in j['parse_errors']])
    oldtypes = {s['qualified'] for s in old if s['kind'] in TYPES and s['public_or_protected_syntax']}
    newtypes = {s['qualified'] for s in new if s['kind'] in TYPES and s['public_or_protected_syntax']}
    oldmembers = {(s['qualified'], s['header']) for s in old if s['public_or_protected_syntax']}
    newmembers = {(s['qualified'], s['header']) for s in new if s['public_or_protected_syntax']}
    delta = {'scope': 'Syntactic comparison; renamed mappings make many signatures differ. Not semantic equivalence or a completed 26.3 backport.',
        '26.3_only_types': sorted(newtypes-oldtypes), '1.21.11_only_types': sorted(oldtypes-newtypes),
        '26.3_only_declarations': sorted(newmembers-oldmembers), '1.21.11_only_declarations': sorted(oldmembers-newmembers)}
    dump('26.3-vs-1.21.11.json', delta)
    stats['all_inputs'] = {'files_read': len(all_rows), 'java_files_parsed': len(all_java), 'bytes_read': sum(r['bytes'] for r in all_rows)}
    stats['graphify'] = {'available_workspaces': 0, 'indexed_analysis_performed': False,
        'fallback': 'Local tree-sitter Java syntax analysis; graph is import/candidate dependencies, not Graphify output.'}
    dump('summary.json', stats)
    # Offline HTML: no remote requests or dependencies. Each declaration has a searchable card.
    cards = []
    for symbol in old:
        if symbol['public_or_protected_syntax']:
            text = f"{symbol['qualified']} {symbol['header']} {symbol['component']}"
            cards.append('<details class="symbol" data-search="' + html.escape(text.lower(), quote=True) + '"><summary>' + html.escape(symbol['qualified']) + '</summary><p>' + html.escape(f"{symbol['file']}:{symbol['line']}") + '</p><pre>' + html.escape(symbol['header']) + '</pre></details>')
    page = '''<!doctype html><html lang="vi"><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title>MeteorLib API 1.21.11</title><style>body{max-width:1100px;margin:40px auto;padding:0 20px;background:#10202b;color:#e4edf3;font:16px system-ui}input{width:95%;padding:14px;background:#1a3342;color:white;border:1px solid #78a7bd;border-radius:6px}details{padding:12px 0;border-bottom:1px solid #345365}summary{cursor:pointer;overflow-wrap:anywhere}pre{white-space:pre-wrap;overflow-wrap:anywhere;color:#a8dfca}p{overflow-wrap:anywhere;color:#aec4d4}[hidden]{display:none}</style><h1>MeteorLib API · 1.21.11</h1><p>Fabric Loader 0.19.5 · Java 21 · Meteor build 86</p><p>Danh mục cú pháp public/protected; không thay thế Javadoc và kiểm thử trong game. Tất cả API gốc dùng trực tiếp bằng package meteordevelopment.*.</p><label for="q">Tìm tên lớp, phương thức, package hoặc thành phần</label><p><input id="q" type="search" placeholder="Ví dụ: Setting.Builder, Hud, BlockUtils"></p><p id="count"></p>''' + ''.join(cards) + '''<script>const q=document.getElementById('q'),cards=[...document.querySelectorAll('.symbol')];function filter(){let n=0;const s=q.value.toLowerCase();for(const c of cards){c.hidden=!c.dataset.search.includes(s);if(!c.hidden)n++}document.getElementById('count').textContent=n+' khai báo'}q.addEventListener('input',filter);filter();</script></html>'''
    (OUT / 'API-BROWSER.html').write_text(page, encoding='utf-8')
    print(json.dumps(stats, indent=2, ensure_ascii=False))


if __name__ == '__main__': main()
