#!/usr/bin/env python3
"""Compare declared public/protected API members, not runtime or semantic equivalence."""
import argparse
import io
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
import tempfile
import zipfile

def inspect(path, directory, javap):
    jars = [path]
    with zipfile.ZipFile(path) as z:
        metadata = json.loads(z.read('fabric.mod.json'))
        for nested in metadata.get('jars', []):
            data = z.read(nested['file'])
            with zipfile.ZipFile(io.BytesIO(data)) as child:
                if json.loads(child.read('fabric.mod.json'))['id'] == 'dev_meteorapi_foundation':
                    target = directory / 'foundation.jar'; target.write_bytes(data); jars.append(target)
    classes = []
    for jar in jars:
        with zipfile.ZipFile(jar) as z:
            classes.extend(name[:-6].replace('/', '.') for name in z.namelist()
                if name.endswith('.class') and name.startswith(('dev/meteorapi/', 'dev/meteorlib/foundation/')))
    result = subprocess.run([javap, '-protected', '-classpath', os.pathsep.join(str(x) for x in jars)] + sorted(classes),
        capture_output=True, text=True, check=True)
    api = {}; current = None
    for line in result.stdout.splitlines():
        text = line.strip()
        match = re.search(r'\b(?:class|interface) ([^ <{]+)', text)
        if match and text.endswith('{'):
            current = match.group(1) if re.search(r'\b(public|protected)\b', text) else None
            if current: api[current] = set()
        elif current and re.match(r'^(public|protected)\b', text):
            api[current].add(text)
        elif text == '}': current = None
    return metadata['version'], api

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('--baseline', type=Path, required=True)
    parser.add_argument('--candidate', type=Path, required=True)
    parser.add_argument('--output', type=Path, required=True)
    parser.add_argument('--javap', default=shutil.which('javap'))
    args = parser.parse_args()
    if not args.javap: parser.error('javap is required')
    with tempfile.TemporaryDirectory(prefix='meteor-api-abi-') as temp:
        root=Path(temp); old=root/'old'; new=root/'new'; old.mkdir(); new.mkdir()
        old_version, before=inspect(args.baseline, old, args.javap)
        new_version, after=inspect(args.candidate, new, args.javap)
    removed={name:sorted(members-after.get(name,set())) for name,members in before.items()
        if name not in after or members-after[name]}
    report={'baseline':old_version,'candidate':new_version,'baseline_exported_classes':len(before),
        'candidate_exported_classes':len(after),'baseline_declared_members':sum(map(len,before.values())),
        'removed_declared_members_or_types':removed,'passed':not removed,
        'scope':'Declared public/protected members in API and foundation bytecode. Does not prove behavioral compatibility, exhaustive record-pattern compatibility, or dependency version satisfaction.'}
    args.output.parent.mkdir(parents=True,exist_ok=True)
    args.output.write_text(json.dumps(report,indent=2)+'\n')
    print(json.dumps(report,indent=2))
    if removed: raise SystemExit(1)

if __name__=='__main__':main()
