# Build và xuất artifact

Cài JDK 21 và dùng wrapper root Gradle 9.2.1. Không dùng wrapper của template nguồn
26.3 để build project đang hoạt động. Loader được ghim tại root và runtime là 0.19.5.

```powershell
.\gradlew.bat :foundation:check :adapter:build :example-addon:build
py -3 tools\package_runtime.py --adapter adapter\build\libs\meteor-lib-api-0.1.0.jar
```

Tác vụ `foundation:selfTest` thực thi assertion bằng JVM với `-ea`; không cần JUnit
và không tải dependency test ngoài. Artifact adapter/example được Loom remap sang
intermediary để cài vào Fabric. Foundation không tham chiếu mappings game.

Script đóng gói từ chối nếu SHA-256 Meteor gốc không khớp baseline. Nó so sánh lại
mọi class, mixin, access widener, tài nguyên và JAR lồng trước khi xuất báo cáo.
Khi build adapter-only, cần đúng bản Meteor đi kèm hoặc artifact có cùng checksum.
Không dùng snapshot tự thay đổi sau này như một baseline ngầm.

## Full source runtime

`runtime` là build Gradle riêng, đọc trực tiếp `upstream/meteor-1.21.11/src`.
Không copy một bản source rồi quên đồng bộ. Catalog runtime thay Loader 0.18.2 của
upstream bằng 0.19.5 và ghim Loom 1.14.10. Source Java vẫn giữ nguyên.

```powershell
.\gradlew.bat -p runtime build
```

Build này cần thêm Fabric API submodules, compat artifacts Sodium/Lithium/Iris/
ViaFabricPlus/Baritone/ModMenu và các thư viện upstream. Các dependency compile-only
không biến thành yêu cầu cài mọi mod tùy chọn vào game. Xem nguyên build script.

Để compose runtime do chính bạn build, trước tiên lấy checksum core bằng
`Get-FileHash -Algorithm SHA256 runtime\build\libs\meteor-lib-runtime-core-1.21.11-86.jar`,
rồi truyền checksum đó một cách rõ ràng:

```powershell
py -3 tools\compose_source_runtime.py --core runtime\build\libs\meteor-lib-runtime-core-1.21.11-86.jar --expected-core-sha256 <SHA256> --adapter adapter\build\libs\meteor-lib-api-0.1.0.jar
```

Đầu ra ở `dist/source-built` và có baseline riêng. Nó không ghi đè kết quả đối chiếu
với official binary. Build lại source có thể thay đổi bytes dù API tương đương, do
compiler, dependency và timestamp khác nhau; không được gắn nhãn byte-identical với
official artifact khi chưa kiểm tra.

## Kết quả và giới hạn môi trường build

Xem `VERIFICATION.md` cho trạng thái thực tế. Bản build adapter/example đã kiểm tra
compile, remap và tạo sources/Javadoc. Các cảnh báo Javadoc thiếu mô tả không bị che
thành kiểm chứng runtime.

Môi trường kiểm tra hiện tại hạn chế Unix-domain socket mà Loom dùng để thăm dò nền
tảng. Build tại đây dùng bản điều chỉnh cục bộ của Loom chỉ để báo socket không được
hỗ trợ, không thay source mod hay runtime. Project phát hành vẫn dùng Loom chính thức
1.14.10; máy Windows thông thường không cần điều chỉnh này.
