#!/usr/bin/env python3
"""Compose an independently installable compatibility runtime; never rewrite upstream classes."""
import argparse
import hashlib
import io
import json
from pathlib import Path
import zipfile

ROOT = Path(__file__).resolve().parents[1]
UPSTREAM = ROOT / 'libs/meteor-client-1.21.11-86.jar'
EXPECTED_SHA256 = '93390cfdb1030e47f116357ba421c90a9b1ca4832b6551c2dec1ade5eeb42e71'
VERSION = '0.1.0'


def sha(data):
    return hashlib.sha256(data).hexdigest()


def validate_adapter(data):
    with zipfile.ZipFile(io.BytesIO(data)) as jar:
        meta = json.loads(jar.read('fabric.mod.json'))
        assert meta['id'] == 'meteor-lib-api' and meta['version'] == VERSION
        assert meta['depends']['minecraft'] == '1.21.11'
        assert meta['depends']['fabricloader'] == '>=0.19.5'
        assert meta['depends']['meteor-client'] == '1.21.11-86'
        assert 'dev/meteorlib/api/MeteorLib.class' in jar.namelist()
        assert not any(n.startswith('meteordevelopment/meteorclient/') and n.endswith('.class') for n in jar.namelist())
        nested = [x['file'] for x in meta.get('jars', [])]
        assert len(nested) == 1, nested
        with zipfile.ZipFile(io.BytesIO(jar.read(nested[0]))) as foundation:
            assert 'dev/meteorlib/foundation/ResourceScope.class' in foundation.namelist()


def build(adapter, output):
    original = UPSTREAM.read_bytes()
    if sha(original) != EXPECTED_SHA256:
        raise SystemExit('Upstream checksum mismatch: refusing to package')
    adapter_data = adapter.read_bytes()
    validate_adapter(adapter_data)
    output.parent.mkdir(parents=True, exist_ok=True)
    with zipfile.ZipFile(io.BytesIO(original)) as source, zipfile.ZipFile(output, 'w', zipfile.ZIP_DEFLATED) as target:
        names = source.namelist()
        assert len(names) == len(set(names)), 'Duplicate upstream ZIP entries'
        meta = json.loads(source.read('fabric.mod.json'))
        assert meta['custom']['meteor-client:commit'] == '48030717dc0d4898a195a713fb048bf597fc5b54'
        meta['name'] = 'MeteorLib API Runtime (Meteor based)'
        meta['description'] = 'Complete Meteor 1.21.11 build 86 compatibility runtime plus MeteorLib API. Uses Meteor Client source.'
        # Keep the upstream id/version: addons and MeteorClient.MOD_META depend on them.
        meta['depends']['fabricloader'] = '>=0.19.5'
        meta['provides'] = list(dict.fromkeys(meta.get('provides', []) + ['meteor-lib-runtime']))
        adapter_path = f'META-INF/jars/meteor-lib-api-{VERSION}.jar'
        meta.setdefault('jars', []).append({'file': adapter_path})
        meta['custom']['meteor-lib-api:version'] = VERSION
        for name in names:
            if name.upper().endswith(('.SF', '.RSA', '.DSA')):
                raise SystemExit('Signed upstream artifact needs a dedicated signing workflow')
            data = json.dumps(meta, indent=2, ensure_ascii=False).encode() if name == 'fabric.mod.json' else source.read(name)
            write(target, name, data)
        write(target, adapter_path, adapter_data)
        write(target, 'META-INF/METEORLIB-NOTICE.md', (ROOT / 'NOTICE.md').read_bytes())
        write(target, 'META-INF/LICENSE_meteorlib', (ROOT / 'LICENSE').read_bytes())
    report = verify(output)
    report['adapter_sha256'] = sha(adapter_data)
    report_path = ROOT / 'docs/verification/runtime-integrity.json'
    report_path.parent.mkdir(parents=True, exist_ok=True)
    report_path.write_text(json.dumps(report, indent=2) + '\n', encoding='utf-8')
    print(json.dumps(report, indent=2))


def write(jar, name, data):
    info = zipfile.ZipInfo(name, date_time=(2026, 11, 8, 0, 0, 0))
    info.compress_type = zipfile.ZIP_DEFLATED
    info.external_attr = 0o644 << 16
    jar.writestr(info, data)


def verify(output):
    with zipfile.ZipFile(UPSTREAM) as source, zipfile.ZipFile(output) as target:
        assert len(target.namelist()) == len(set(target.namelist()))
        original_classes = [n for n in source.namelist() if n.endswith('.class')]
        unchanged = [n for n in original_classes if source.read(n) == target.read(n)]
        original_other = [n for n in source.namelist() if n != 'fabric.mod.json' and not n.endswith('.class')]
        assert len(unchanged) == len(original_classes)
        assert all(source.read(n) == target.read(n) for n in original_other)
        meta = json.loads(target.read('fabric.mod.json'))
        for item in meta['jars']:
            assert item['file'] in target.namelist()
        for mixin in meta['mixins']:
            name = mixin if isinstance(mixin, str) else mixin['config']
            assert source.read(name) == target.read(name)
        assert source.read(meta['accessWidener']) == target.read(meta['accessWidener'])
        validate_adapter(target.read(f'META-INF/jars/meteor-lib-api-{VERSION}.jar'))
        return {
            'upstream_sha256': sha(UPSTREAM.read_bytes()),
            'runtime_sha256': sha(output.read_bytes()),
            'upstream_classes': len(original_classes),
            'byte_identical_classes': len(unchanged),
            'preserved_api_class_bytes_percent': 100.0,
            'preserved_other_entries': len(original_other),
            'retained_mod_id': meta['id'],
            'retained_upstream_version': meta['version'],
            'loader_requirement': meta['depends']['fabricloader'],
            'minecraft': meta['depends']['minecraft'],
            'game_runtime_tested': False,
            'scope': 'Byte-for-byte preservation of all upstream classes and all original non-metadata entries; not proof of every API behavior in game.'
        }


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('--adapter', type=Path)
    parser.add_argument('--verify', type=Path)
    args = parser.parse_args()
    if args.verify:
        print(json.dumps(verify(args.verify), indent=2))
    elif args.adapter:
        adapter = args.adapter if args.adapter.is_absolute() else ROOT / args.adapter
        build(adapter, ROOT / f'dist/meteor-lib-runtime-{VERSION}-mc1.21.11.jar')
    else:
        parser.error('--adapter or --verify required')
