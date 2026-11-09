"""Read the original reference inputs from a checkout or a compact source ZIP."""

from io import BytesIO
from zipfile import ZipFile

FABRIC_SOURCE_DIR = "upstream/fabric-api-1.21.11"
FABRIC_MODULES = (
    "fabric-api-base",
    "fabric-lifecycle-events-v1",
    "fabric-networking-api-v1",
    "fabric-rendering-v1",
)


def fabric_sources(read_file):
    for module in FABRIC_MODULES:
        with ZipFile(BytesIO(read_file(f"libs/{module}-sources.jar"))) as jar:
            for entry in sorted(jar.namelist()):
                if not entry.endswith("/"):
                    yield f"{FABRIC_SOURCE_DIR}/{module}/{entry}", jar.read(entry)


def reference_inputs(root):
    for file in sorted((root / "upstream").rglob("*")):
        if file.is_file():
            yield file.relative_to(root).as_posix(), file.read_bytes()
    if not (root / FABRIC_SOURCE_DIR).is_dir():
        yield from fabric_sources(lambda path: (root / path).read_bytes())
