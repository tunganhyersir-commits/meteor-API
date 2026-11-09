#!/usr/bin/env python3
"""Join Mojang's 1.21.11 official class names with Yarn through the common obfuscated namespace."""
import argparse
import json
from pathlib import Path
import re
parser = argparse.ArgumentParser()
parser.add_argument('--mojang', type=Path, required=True)
parser.add_argument('--yarn-tiny', type=Path, required=True)
parser.add_argument('--output', type=Path, required=True)
args = parser.parse_args()
lines = args.yarn_tiny.read_text().splitlines()
header = lines[0].split('\t')
names = header[3:]
official, named = names.index('official') + 1, names.index('named') + 1
yarn = {}
for line in lines:
    if line.startswith('c\t'):
        columns = line.split('\t'); yarn[columns[official].replace('/', '.')] = columns[named].replace('/', '.')
result = {}
for line in args.mojang.read_text().splitlines():
    match = re.match(r'([^ #].+) -> (.+):$', line)
    if match and match[2] in yarn: result[match[1]] = yarn[match[2]]
args.output.parent.mkdir(parents=True, exist_ok=True)
args.output.write_text(json.dumps(result, indent=2) + '\n')
print(len(result))
