#!/usr/bin/env python3
"""Package verified API/install/source releases while preserving reference input bytes."""
import argparse
import hashlib
import json
from pathlib import Path
import shutil
import subprocess
import sys
import zipfile

from reference_inputs import FABRIC_SOURCE_DIR, fabric_sources

ROOT=Path(__file__).resolve().parents[1]

def sha(data):return hashlib.sha256(data).hexdigest()

def main():
    parser=argparse.ArgumentParser()
    parser.add_argument('--output',type=Path,default=ROOT.parent/'output-beta')
    args=parser.parse_args();out=args.output.resolve()
    if out.is_relative_to(ROOT):raise SystemExit('Output directory must be outside the source project')
    subprocess.run([sys.executable,str(ROOT/'tools/verify_release.py')],check=True)
    version=dict(line.split('=',1) for line in (ROOT/'gradle.properties').read_text().splitlines() if '=' in line)['mod_version']
    out.mkdir(parents=True,exist_ok=True)
    profiles=json.loads((ROOT/'docs/verification/metadata-profiles.json').read_text())
    assert len(profiles['profiles'])==6 and not profiles['gameLaunched']
    assert json.loads((ROOT/'docs/generated/meteor-api-parse-errors.json').read_text())==[]
    jar=out/f'meteor-api-{version}.jar';shutil.copyfile(ROOT/'dist'/jar.name,jar)
    install=out/f'Meteor-API-{version}-INSTALL.zip'
    instructions=f'''METEOR API {version}
Minecraft 1.21.11 / Fabric Loader 0.19.5 / Java 21
Open source: GPL-3.0-only; see LICENSE and NOTICE.md.

1. Close Minecraft and remove older meteor-api JARs and the old 0.1 runtime.
2. Put meteor-api-{version}.jar in this instance's mods folder.
3. Optional: select JARs in optional/. Keep only ONE original Meteor Client JAR.
4. F8 opens API; choose the registered-menu directory to discover menu factories.
5. Optional example: F9 opens its form; F10 toggles its HUD.

This requested beta label continues the 0.2.0 source baseline, but 0.1.2-beta is
lower than 0.2.0 under SemVer. Addons requiring >=0.2.0 need an intentional metadata
update/rebuild for this beta. The included example uses the beta dependency.
Do not install this API beside the previous API JAR under the same mod ID.

Read README.md, docs/BETA-0.1.2.md, docs/API-NAMES.md and docs/VERIFICATION.md.
167 automated Java checks and six metadata profiles passed. Live-game testing
remains pending; no complete 26.3 backport or universal client compatibility is claimed.
'''
    with zipfile.ZipFile(install,'w',zipfile.ZIP_DEFLATED,compresslevel=9) as z:
        z.write(jar,jar.name)
        for p in sorted((ROOT/'dist/optional').glob('*.jar')):z.write(p,'optional/'+p.name)
        for name in ['README.md','LICENSE','NOTICE.md','CHANGELOG.md','docs/BETA-0.1.2.md','docs/API-NAMES.md','docs/VERIFICATION.md']:
            z.write(ROOT/name,name)
        z.writestr('INSTALL.txt',instructions)
    source=out/'MeteorAPI-src.zip'
    prefix='MeteorAPI/';files=[]
    for p in sorted(ROOT.rglob('*')):
        if not p.is_file():continue
        rel=p.relative_to(ROOT);parts=rel.parts
        if rel.as_posix().startswith(FABRIC_SOURCE_DIR + '/'):
            continue
        if parts[0] in {'.gradle','.git','build','dist'}:continue
        if parts[0] in {'foundation','api','example-addon'} and len(parts)>1 and parts[1]=='build':continue
        if '__pycache__' in parts and parts[0] not in {'upstream','history'}:continue
        files.append((p,rel.as_posix()))
    with zipfile.ZipFile(source,'w',zipfile.ZIP_DEFLATED,compresslevel=9) as z:
        for p,rel in files:z.write(p,prefix+rel)
    with zipfile.ZipFile(source) as z:
        assert z.testzip() is None
        packed_fabric = dict(fabric_sources(lambda path: z.read(prefix + path)))
        for item in json.loads((ROOT/'docs/generated/all-input-files.json').read_text()):
            path = item['file']
            if path.startswith(FABRIC_SOURCE_DIR + '/'):
                data = packed_fabric[path]
                expanded = ROOT / path
                if expanded.is_file():
                    assert expanded.read_bytes() == data, path
            else:
                data = z.read(prefix + path)
            assert sha(data) == item['sha256'], path
        active=[name for name in z.namelist() if name.endswith('.java') and '/upstream/' not in name and '/history/' not in name]
        assert len(active)==80,len(active)
        assert z.read(prefix+'api/src/main/java/dev/meteorapi/ui/Menus.java')==(ROOT/'api/src/main/java/dev/meteorapi/ui/Menus.java').read_bytes()
    with zipfile.ZipFile(install) as z:
        assert z.testzip() is None
        assert z.read(jar.name)==jar.read_bytes()
    manifest={p.name:{'bytes':p.stat().st_size,'sha256':sha(p.read_bytes())} for p in [source,jar,install]}
    (out/'SHA256SUMS.json').write_text(json.dumps(manifest,indent=2)+'\n')
    print(json.dumps({'source_java_files':80,'reference_files_preserved':len(json.loads((ROOT/'docs/generated/all-input-files.json').read_text())),'artifacts':manifest},indent=2))

if __name__=='__main__':main()
