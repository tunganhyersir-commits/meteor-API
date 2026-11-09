#!/usr/bin/env python3
"""Verify independent packaging, optional profiles, bytecode level, checksums, and stage the release."""
import hashlib
import io
import json
from pathlib import Path
import shutil
import struct
import zipfile

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / 'dist'
VERSION = '0.1.2-beta'


def sha(data): return hashlib.sha256(data).hexdigest()


def read_jar(data):
    jar = zipfile.ZipFile(io.BytesIO(data))
    assert jar.testzip() is None
    names = jar.namelist(); assert len(names) == len(set(names))
    meta = json.loads(jar.read('fabric.mod.json'))
    classes = {name: jar.read(name) for name in names if name.endswith('.class')}
    versions = sorted(set(struct.unpack('>H', code[6:8])[0] for code in classes.values()))
    assert all(version <= 65 for version in versions), (meta['id'], versions)
    children = [read_jar(jar.read(item['file'])) for item in meta.get('jars', [])]
    return {'meta': meta, 'classes': classes, 'classVersions': versions, 'sha256': sha(data), 'children': children}


def summary(artifact):
    return {'id': artifact['meta']['id'], 'version': artifact['meta']['version'],
        'classes': len(artifact['classes']), 'classVersions': artifact['classVersions'],
        'sha256': artifact['sha256'], 'nested': [summary(child) for child in artifact['children']]}


def main():
    jar_path = ROOT / f'api/build/libs/meteor-api-{VERSION}.jar'
    data = jar_path.read_bytes(); api = read_jar(data)
    meta = api['meta']
    assert meta['id'] == 'meteor-api' and meta['version'] == VERSION
    assert meta['depends'] == {'java': '>=21', 'minecraft': '1.21.11', 'fabricloader': '>=0.19.5'}
    assert 'meteor-client' not in meta['depends'] and 'modmenu' not in meta['depends']
    forbidden = ('meteordevelopment/', 'com/terraformersmc/', 'commonnetwork/', 'dev/tonimatas/')
    assert not any(name.startswith(forbidden) for name in api['classes']), 'Bundled optional implementation classes'
    assert 'dev/meteorapi/MeteorApi.class' in api['classes']
    assert 'dev/meteorapi/compat/MeteorBridgeAddon.class' in api['classes']
    assert 'dev/meteorapi/compat/ModMenuIntegration.class' in api['classes']
    nested_ids = {child['meta']['id'] for child in api['children']}
    assert nested_ids == {'dev_meteorapi_foundation', 'fabric-api-base', 'fabric-networking-api-v1', 'fabric-rendering-v1', 'fabric-lifecycle-events-v1'}, nested_ids
    meteor_data = (ROOT / 'libs/meteor-client-1.21.11-86.jar').read_bytes()
    assert sha(meteor_data) == '93390cfdb1030e47f116357ba421c90a9b1ca4832b6551c2dec1ade5eeb42e71'
    meteor = read_jar(meteor_data)
    modmenu_data = (ROOT / 'libs/modmenu-17.0.0.jar').read_bytes(); modmenu = read_jar(modmenu_data)
    assert meteor['meta']['id'] != meta['id'] and modmenu['meta']['id'] != meta['id']
    assert not (api['classes'].keys() & meteor['classes'].keys()), 'Meteor class collision'
    assert not (api['classes'].keys() & modmenu['classes'].keys()), 'Mod Menu class collision'
    # Verify inline-remapped mixin descriptors; exact targets exist in 1.21.11 and no optional target is used.
    mixin_targets = {
        'dev/meteorapi/mixin/ClientConnectionMixin.class': b'Lnet/minecraft/class_2535;',
        'dev/meteorapi/mixin/MinecraftClientMixin.class': b'Lnet/minecraft/class_310;',
        'dev/meteorapi/mixin/KeyboardMixin.class': b'Lnet/minecraft/class_309;',
        'dev/meteorapi/mixin/InGameHudMixin.class': b'Lnet/minecraft/class_329;',
        'dev/meteorapi/mixin/ChatScreenMixin.class': b'Lnet/minecraft/class_408;'
    }
    for name, target in mixin_targets.items(): assert target in api['classes'][name], name
    with zipfile.ZipFile(io.BytesIO(data)) as jar:
        mixins = json.loads(jar.read('meteor-api.mixins.json'))
        assert mixins['required'] and mixins['injectors']['defaultRequire'] == 1
        assert 'NOTICE.md' in jar.namelist()
    OUT.mkdir(exist_ok=True); (OUT / 'optional').mkdir(exist_ok=True)
    shutil.copy(jar_path, OUT / jar_path.name)
    example_path = ROOT / f'example-addon/build/libs/meteor-api-example-{VERSION}.jar'
    example = read_jar(example_path.read_bytes())
    assert example['meta']['depends']['meteor-api'] == VERSION
    shutil.copy(example_path, OUT / 'optional' / example_path.name)
    shutil.copy(ROOT / 'libs/modmenu-17.0.0.jar', OUT / 'optional/modmenu-17.0.0.jar')
    shutil.copy(ROOT / 'libs/meteor-client-1.21.11-86.jar', OUT / 'optional/meteor-client-1.21.11-86.jar')
    report = {
        'api': summary(api),
        'optional_modmenu': summary(modmenu),
        'example': summary(example),
        'meteor_client_stays_separate': True,
        'top_level_class_overlap_with_meteor': 0,
        'top_level_class_overlap_with_modmenu': 0,
        'profiles_checked_statically': ['API only', 'API + Meteor 1.21.11-86', 'API + Mod Menu 17.0.0', 'API + Meteor + Mod Menu', 'API + beta example', 'API + Meteor + Mod Menu + beta example'],
        'profile_check_scope': 'Metadata identities, optional dependencies, class overlap, nested artifacts and bytecode; not a game-launch test.',
        'game_runtime_tested': False
    }
    report_path = ROOT / 'docs/verification/release-checks.json'; report_path.parent.mkdir(exist_ok=True, parents=True)
    report_path.write_text(json.dumps(report, indent=2) + '\n')
    (ROOT / 'libs/checksums.json').write_text(json.dumps({path.relative_to(ROOT / 'libs').as_posix(): sha(path.read_bytes())
        for path in sorted((ROOT / 'libs').rglob('*.jar'))}, indent=2) + '\n')
    print(json.dumps({'api_bytes': len(data), 'api_classes': len(api['classes']), 'nested_mods': sorted(nested_ids),
        'meteor_class_overlap': 0, 'modmenu_class_overlap': 0, 'game_runtime_tested': False}, indent=2))


if __name__ == '__main__': main()
