#!/usr/bin/env python3
"""Explicit composition against a developer-supplied, checksum-pinned source build."""
import argparse
import json
from pathlib import Path
import package_runtime as composition

parser = argparse.ArgumentParser()
parser.add_argument('--core', type=Path, required=True)
parser.add_argument('--expected-core-sha256', required=True)
parser.add_argument('--adapter', type=Path, required=True)
args = parser.parse_args()
composition.UPSTREAM = args.core.resolve()
composition.EXPECTED_SHA256 = args.expected_core_sha256.lower()
output = composition.ROOT / 'dist/source-built/meteor-lib-runtime-0.1.0-mc1.21.11.jar'
# This is an intentional, separate source-built baseline, not the official byte-identity report.
old_report = composition.ROOT / 'docs/verification/runtime-integrity.json'
saved = old_report.read_bytes() if old_report.exists() else None
try:
    composition.build(args.adapter.resolve(), output)
    report = json.loads(old_report.read_text())
    report['baseline'] = 'User-supplied source-built core, not the official upstream binary'
    (old_report.parent / 'source-built-runtime-integrity.json').write_text(json.dumps(report, indent=2) + '\n')
finally:
    if saved is not None: old_report.write_bytes(saved)
    else: old_report.unlink(missing_ok=True)
