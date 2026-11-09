# Build và tạo lại kiểm kê

JDK 21, Gradle wrapper 9.2.1, Loom 1.14.10. Active projects chỉ gồm foundation/api/
example-addon. Source upstream, source JDK25, Forge/NeoForge và history không thuộc
sourceSets active.

```powershell
.\gradlew.bat :foundation:check :api:build :example-addon:build
py -3 tools\verify_release.py
```

Hoặc chạy `BUILD-WINDOWS.bat`. Script verify kiểm tra metadata, JDK bytecode, optional
dependencies, class overlap với Meteor/Mod Menu, nested JAR và mixin target remap,
rồi stage JAR/API/example/ModMenu trong `dist`.

`libs/maven` là mirror cục bộ của các binary Fabric API đã ghim; POM tối thiểu chỉ
giúp Gradle nhận module identity. Source và license gốc có trong source JAR/upstream.
Không gọi publish hoặc gửi dữ liệu đến tài khoản bên ngoài trong build.

Gói `MeteorAPI-src.zip` có thư mục gốc `MeteorAPI`. Trên Windows, chọn đích ngắn
như `C:\MC` rồi mở thư mục `C:\MC\MeteorAPI`. Mã nguồn Fabric tham chiếu nằm
trong bốn JAR `libs/fabric-*-sources.jar`. Script kiểm kê đọc trực tiếp các JAR
này và ghi đường dẫn gốc trong catalog.

Tạo lại catalog:

```powershell
py -3 -m pip install -r tools\requirements-analysis.txt
py -3 tools\audit_sources.py
py -3 tools\audit_dependencies.py
```

Class map đã nằm trong báo cáo. Muốn tạo lại, dùng official mappings 1.21.11 và Yarn
tiny 1.21.11+build.3 làm đầu vào cho `tools/build_class_map.py`; nguồn mappings chỉ
phục vụ phân tích, không cần tải Java25 hoặc source game26.3 để compile API.

Không sửa wrapper thành Gradle/Loom mới nhất một cách tự động: project nhắm một cặp
phiên bản đã build. Các source reference giữ nguyên số version gốc để đối chiếu.
