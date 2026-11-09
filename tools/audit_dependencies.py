#!/usr/bin/env python3
"""Read every supplied dependency file; export Java/Python API indexes without running their code."""
import ast
import csv
import hashlib
import html
import json
from pathlib import Path
import re

from reference_inputs import reference_inputs

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / 'docs/generated'


def signature(node):
    if isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef)):
        return ('async ' if isinstance(node, ast.AsyncFunctionDef) else '') + 'def ' + node.name + '(' + ast.unparse(node.args) + ')'
    if isinstance(node, ast.ClassDef): return 'class ' + node.name + '(' + ', '.join(ast.unparse(base) for base in node.bases) + ')'
    return ''


def main():
    OUT.mkdir(exist_ok=True, parents=True)
    python_api, guides, notes = [], [], []
    for rel, data in sorted(reference_inputs(ROOT), key=lambda entry: Path(entry[0])):
        file = Path(rel)
        if file.suffix.lower() in ('.md', '.rst', '.txt') or file.name.startswith(('LICENSE', 'COPYING')):
            guides.append({'file': rel, 'bytes': len(data), 'sha256': hashlib.sha256(data).hexdigest()})
        if file.suffix != '.py': continue
        try:
            text = data.decode('utf-8-sig'); tree = ast.parse(text)
        except (UnicodeDecodeError, SyntaxError) as error:
            notes.append({'file': rel, 'issue': str(error)}); continue
        for node in ast.walk(tree):
            if isinstance(node, (ast.FunctionDef, ast.AsyncFunctionDef, ast.ClassDef)):
                python_api.append({'file': rel, 'line': node.lineno, 'name': node.name,
                    'signature': signature(node), 'docstring': ast.get_docstring(node), 'private_by_name': node.name.startswith('_')})
    (OUT / 'python-api.json').write_text(json.dumps(python_api, ensure_ascii=False, indent=2) + '\n')
    (OUT / 'guides-and-licenses.json').write_text(json.dumps(guides, ensure_ascii=False, indent=2) + '\n')
    (OUT / 'python-parse-notes.json').write_text(json.dumps(notes, ensure_ascii=False, indent=2) + '\n')
    comments = json.loads((OUT / 'all-input-comments.json').read_text())
    rows = ['# Ghi chú trong toàn bộ source đầu vào', '', 'Comment có TODO/FIXME/HACK/XXX/NOTE/WARNING được giữ dưới đây; danh sách đầy đủ ở `all-input-comments.json`.', '']
    for comment in comments:
        if comment['flags']:
            rows += ['## ' + comment['file'] + ':' + str(comment['line']), '', '```java', comment['text'], '```', '']
    (OUT / 'COMMENT-NOTES.md').write_text('\n'.join(rows), encoding='utf-8')
    # Explicit, inspectable status for every 26.3 export. Never count a name match as a proven backport.
    old = json.loads((OUT / '1.21.11-api.json').read_text())
    future = json.loads((OUT / '26.3-api.json').read_text())
    old_exact = {(item['qualified'], item['header']) for item in old if item['public_or_protected_syntax']}
    old_symbols = {item['qualified'] for item in old if item['public_or_protected_syntax']}
    class_map_path = OUT / 'mojang-to-yarn-class-map.json'
    class_map = json.loads(class_map_path.read_text()) if class_map_path.exists() else {}
    class_map.update({'net.minecraft.client.gui.GuiGraphicsExtractor': 'net.minecraft.client.gui.DrawContext'})
    import_cache = {}
    def normalized(item):
        file = item['file']
        if file not in import_cache:
            text = (ROOT / file).read_text()
            imports = re.findall(r'^import (?!static )([\w.]+);', text, re.M)
            import_cache[file] = {name.rsplit('.', 1)[-1]: name for name in imports}
        header = re.sub(r'@[\w.]+(?:\([^)]*\))?\s*', '', item['header'])
        if item['kind'] in ('field_declaration', 'constant_declaration'): header = header.split('=', 1)[0]
        def resolve(match):
            word = match[0]
            full = import_cache[file].get(word, word)
            return class_map.get(full, full)
        header = re.sub(r'(?<![\w.])[A-Z][A-Za-z_0-9]*(?![\w.])', resolve, header)
        return re.sub(r'\s+', '', header)
    normalized_old = {(item['qualified'], normalized(item)) for item in old if item['public_or_protected_syntax']}
    prefix = 'meteordevelopment.meteorclient.'
    ports = {
        'utils.render.MeshBuilderVertexConsumerProvider.MeshBuilderVertexConsumer': ('dev.meteorapi.compat26.render.VertexConsumerAdapter', 'adapted_vertex_interface'),
        'utils.render.IVertexConsumerProvider': ('dev.meteorapi.compat26.render.IVertexConsumerProvider', 'adapted_vertex_interface'),
        'utils.OutlineRenderCommandQueue': ('dev.meteorapi.compat26.render.OutlineRenderCommandQueue', 'adapted_render_queue'),
        'settings.PacketListSetting': ('dev.meteorapi.compat26.settings.PacketListSetting', 'ported_optional_meteor'),
        'gui.screens.settings.PacketBoolSettingScreen': ('dev.meteorapi.compat26.gui.PacketBoolSettingScreen', 'ported_optional_meteor'),
        'utils.network.PacketUtils': ('dev.meteorapi.network.PacketUtils', 'adapted_packet_catalog'),
        'settings.LongSetting': ('dev.meteorapi.compat26.settings.LongSetting', 'ported_optional_meteor'),
        'settings.FileSetting': ('dev.meteorapi.compat26.settings.FileSetting', 'ported_optional_meteor'),
        'gui.widgets.input.WLongEdit': ('dev.meteorapi.compat26.gui.WLongEdit', 'ported_optional_meteor'),
        'events.meteor.KeyInputEvent': ('dev.meteorapi.compat26.events.KeyInputEvent', 'ported_optional_meteor'),
        'systems.modules.render.WeatherChanger': ('dev.meteorapi.compat26.modules.WeatherChanger', 'ported_optional_meteor'),
        'systems.modules.render.Xray.FluidOpacity': ('dev.meteorapi.backport.FluidOpacity', 'adapted_policy_type'),
        'utils.misc.ListMode': ('dev.meteorapi.backport.ListMode', 'ported_independent'),
        'utils.misc.Keybind': ('dev.meteorapi.backport.Keybind', 'ported_independent'),
        'utils.misc.FileDialogs': ('dev.meteorapi.ui.FileDialogs', 'adapted_native_backend'),
        'utils.entity.EntityAgeTest': ('dev.meteorapi.backport.EntityAgeTest', 'ported_independent'),
        'utils.player.SwingMode': ('dev.meteorapi.backport.SwingMode', 'adapted_game_protocol'),
        'utils.render.DisplayItemUtils': ('dev.meteorapi.backport.DisplayItemUtils', 'adapted_game_registry'),
        'utils.render.MeteorMcGuiRenderer': ('dev.meteorapi.backport.MeteorMcGuiRenderer', 'adapted_constructor')
    }
    member_ports = {
        prefix + 'MeteorClient.shouldHideHud': 'dev.meteorapi.compat.client.MeteorClientApi.shouldHideHud',
        prefix + 'gui.GuiTheme.longEdit': 'dev.meteorapi.compat26.gui.ThemeApi.longEdit',
        prefix + 'gui.renderer.GuiRenderer.fill': 'dev.meteorapi.compat26.gui.RenderApi.fill',
        prefix + 'utils.misc.input.Input.modsMatch': 'dev.meteorapi.backport.Utils.modsMatch',
        **{prefix + 'utils.Utils.' + name: 'dev.meteorapi.backport.Utils.' + name for name in ('isFood', 'vec3', 'contains', 'fileNameFilter')}
    }
    catalog = []
    for item in future:
        if not item['public_or_protected_syntax']: continue
        name, target, status = item['qualified'], '', ''
        for source, (replacement, state) in ports.items():
            if name == prefix + source or name.startswith(prefix + source + '.'):
                suffix = name[len(prefix + source):]
                if suffix == '.' + source.rsplit('.', 1)[-1]: suffix = '.' + replacement.rsplit('.', 1)[-1]
                target = replacement + suffix; status = state; break
        if not status:
            if name in member_ports:
                status = 'adapted_additive_helper'; target = member_ports[name]
            elif (name, item['header']) in old_exact:
                status = 'unchanged_declaration_in_1.21.11'; target = name
            elif (name, normalized(item)) in normalized_old:
                status = 'mapping_normalized_signature_candidate'; target = name
            elif name in old_symbols:
                status = 'existing_symbol_needs_semantic_review'; target = name
            elif '.mixin.' in name or '.mixininterface.' in name:
                status = 'version_specific_game_hook_not_public_sdk'
            else:
                status = 'pending_backport_review'
        catalog.append({'source': name, 'source_header': item['header'], 'source_file': item['file'], 'source_line': item['line'],
            'target': target, 'status': status, 'proof': 'Source/compile evidence only unless separately documented; no blanket behavioral equivalence claim.'})
    (OUT / 'BACKPORT-26.3-LEDGER.json').write_text(json.dumps(catalog, ensure_ascii=False, indent=2) + '\n')
    with (OUT / 'BACKPORT-26.3-LEDGER.csv').open('w', newline='', encoding='utf-8') as stream:
        writer = csv.DictWriter(stream, fieldnames=list(catalog[0])); writer.writeheader(); writer.writerows(catalog)
    from collections import Counter
    counts = dict(Counter(row['status'] for row in catalog))
    (OUT / 'backport-summary.json').write_text(json.dumps(counts, indent=2) + '\n')
    api = json.loads((OUT / 'meteor-api-api.json').read_text())
    cards = []
    for item in api:
        if not item['public_or_protected_syntax']: continue
        search = html.escape((item['qualified'] + ' ' + item['header']).lower(), quote=True)
        cards.append('<details data-q="' + search + '"><summary>' + html.escape(item['qualified']) + '</summary><pre>' + html.escape(item['header']) + '</pre><p>' + html.escape(item['file'] + ':' + str(item['line'])) + '</p></details>')
    page = '''<!doctype html><html lang="vi"><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title>Meteor API 0.1.2-beta · SDK</title><style>body{max-width:1100px;margin:40px auto;padding:0 20px;background:#101010;color:#eeeeee;font:16px system-ui}input{width:95%;padding:12px;background:#202020;color:white;border:1px solid #777}details{padding:12px 0;border-bottom:1px solid #444}summary{cursor:pointer;overflow-wrap:anywhere}pre{white-space:pre-wrap;overflow-wrap:anywhere;color:#cccccc}p{overflow-wrap:anywhere}[hidden]{display:none}</style><h1>Meteor API 0.1.2-beta</h1><p>Fabric 1.21.11 · Loader 0.19.5 · API độc lập + bridge Meteor tùy chọn.</p><label for="q">Tra tên lớp, phương thức hoặc tham số</label><p><input id="q" type="search" placeholder="Packets, Panels, Payloads, Keybind, LongSetting"></p><p id="count"></p>''' + ''.join(cards) + '''<script>const q=document.getElementById('q'),items=[...document.querySelectorAll('details')];function f(){let n=0;for(const item of items){item.hidden=!item.dataset.q.includes(q.value.toLowerCase());if(!item.hidden)n++}document.getElementById('count').textContent=n+' khai báo'}q.addEventListener('input',f);f()</script></html>'''
    (OUT / 'METEOR-API-BROWSER.html').write_text(page, encoding='utf-8')
    print(json.dumps({'python_symbols': len(python_api), 'guides': len(guides), 'backport_statuses': counts}, indent=2))


if __name__ == '__main__': main()
