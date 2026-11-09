# MeteorLib API 0.1.0

Thư viện Java dành cho **Minecraft Fabric 1.21.11, Loader 0.19.5, Java 21**.
Dựa trên Meteor Client **1.21.11 build 86** và giữ toàn bộ lớp API gốc.
Đây là bản phái sinh độc lập, có dùng mã nguồn Meteor Client; xem `NOTICE.md` và `LICENSE`.

## Cài đặt

1. Cài Minecraft **1.21.11**, Fabric Loader **0.19.5**, Java **21**.
2. Chép **chỉ** `meteor-lib-runtime-0.1.0-mc1.21.11.jar` trong `dist` vào `mods`.
3. Bản runtime đã chứa API mới và toàn bộ runtime Meteor tương ứng. Không cài thêm
   JAR Meteor Client hoặc JAR `meteor-lib-api` bên ngoài khi dùng lựa chọn này.
4. Muốn thử ví dụ, thêm `meteor-lib-example-0.1.0.jar` từ `dist/optional`.

Nếu đã dùng **đúng** Meteor 1.21.11 build 86: có thể giữ JAR Meteor và chỉ thêm
`dist/bridge/meteor-lib-api-0.1.0.jar`. Đây là lựa chọn thay thế cho runtime độc lập.
Phiên bản adapter được ghim chính xác để tránh tình trạng nạp API sai snapshot.

## Tình trạng tương thích

- Runtime độc lập giữ **100% byte của các lớp gốc**; script đối chiếu từng `.class`.
- Giữ nguyên API `meteordevelopment.meteorclient.*`, không buộc đổi import của addon cũ
  vốn đã tương thích với đúng bản Meteor 1.21.11 build 86.
- Giữ nguyên mixin, access widener, tài nguyên, thư viện lồng và trình tự khởi tạo.
- “Giữ 100% byte lớp API” **không** có nghĩa mọi hành vi trong game đã được thử nghiệm.
  Xem `docs/VERIFICATION.md` và `docs/verification/runtime-integrity.json`.
- Bản nguồn 26.3 dùng Java 25/Mojang mappings. Nó được đối chiếu riêng, không được
  tuyên bố tương thích nhị phân với 1.21.11. Xem `docs/MIGRATION-26.3.md`.

## Đăng ký mới, tránh ghi đè và crash do trùng

Dùng `AddonRegistry` thay cho việc gọi thẳng `Modules.add`, `Commands.add`, `Hud.register`.
Tên được tạo thành `owner.local-name`, tránh việc hai addon vô tình dùng cùng `status`.
API trả `RegistrationResult` khi xung đột; nó ghi chẩn đoán và bỏ qua lần thêm đó,
không ném lỗi trùng ra chuỗi khởi tạo addon. Luôn đọc kết quả trước khi dùng thành phần.

```java
private final AddonRegistry registry = new AddonRegistry("my-addon");

@Override
public void onRegisterCategories() {
    registry.category("tools").value().ifPresent(value -> category = value);
}

@Override
public void onInitialize() {
    if (category == null) return; // Category bị xung đột: bỏ qua phần phụ thuộc.
    var result = registry.module("status", name -> new StatusModule(category, name));
    result.value().ifPresent(module -> { /* dùng module đã đăng ký thành công */ });
}
```

`StatusModule` là lớp riêng kế thừa `Module` hoặc `ManagedModule`; constructor phải
dùng đúng `name` được truyền. Alias cũng dùng `registry.name("alias")`. Một lớp module
chỉ có một instance trong registry Meteor; đổi tên không cho phép tái sử dụng cùng lớp
cho nhiều module. Dùng lớp con riêng cho từng loại module.

`Registry` là API strict dành cho lập trình viên muốn tự xử lý ngoại lệ. API gốc vẫn
được giữ để tương thích; các addon gọi trực tiếp API gốc không tự nhận lớp bảo vệ mới.

## Cấu trúc

| Thư mục | Nội dung |
|---|---|
| `foundation` | Java thuần: scope, hủy đăng ký, tên, kết quả, dịch vụ, tick scheduler |
| `adapter` | Tích hợp Meteor: registry có namespace, façade, vòng đời, chẩn đoán |
| `example-addon` | Ví dụ module + settings + command + HUD |
| `runtime` | Build độc lập từ toàn bộ source Meteor 1.21.11 với Loader 0.19.5 |
| `upstream/meteor-1.21.11` | Toàn bộ source đúng commit của runtime build 86 |
| `upstream/reference-26.3` | Bản bạn gửi, dùng đối chiếu API, không tham gia build |
| `upstream/addon-template-1.21.11` | Addon template bạn gửi, giữ làm nguồn đối chiếu |
| `upstream/user-template` | Thư mục template Fabric bạn gửi, giữ nguyên làm bản gốc |
| `docs` | Phân tích, ghi chú kỹ thuật, danh mục từng file và API |
| `tools` | Phân tích Java, đóng gói, kiểm tra toàn vẹn |
| `libs` | Meteor build 86 và Orbit đã ghim bằng checksum |

`docs/generated/API-BROWSER.html` mở trực tiếp trong trình duyệt để tra cứu offline.
`docs/generated/1.21.11-API-INDEX.md` chia API theo từng phần.
`docs/ENGINEERING-NOTES.md` là ghi chú để tiếp tục phát triển, không phụ thuộc trí nhớ hội thoại.

## Build trên Windows

Cần JDK 21; đặt `JAVA_HOME` đến JDK 21. Chạy:

```powershell
.\gradlew.bat :foundation:check :adapter:build :example-addon:build
py -3 tools\package_runtime.py --adapter adapter\build\libs\meteor-lib-api-0.1.0.jar
```

Linux/macOS: thay `.\gradlew.bat` bằng `./gradlew`, và `py -3` bằng `python3`.
Wrapper đã ghim Gradle 9.2.1, Loom 1.14.10. Build bình thường không cần Python
hoặc thư viện phân tích; Python chỉ dùng để đóng gói runtime và tạo lại báo cáo.

Để tạo lại danh mục:

```powershell
py -3 -m pip install -r tools\requirements-analysis.txt
py -3 tools\audit_sources.py
```

Để build toàn bộ phần Meteor từ source thay vì dùng binary đã ghim:

```powershell
.\gradlew.bat -p runtime build
```

Build source runtime cần tải thêm các phụ thuộc tùy chọn của upstream.
Build này xuất phần runtime lõi; để ghép các lớp cải tiến vào runtime tự build,
dùng `tools/compose_source_runtime.py` như mô tả trong `docs/BUILD.md`.
