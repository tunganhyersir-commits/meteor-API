# Meteor API 0.1.2-beta

**Mã nguồn mở · GPL-3.0-only · Minecraft 1.21.11 · Fabric Loader 0.19.5 · Java 21**

Thư viện độc lập để viết client, mô-đun, menu, GUI, HUD, render và networking.
Giữ ba module `foundation`, `api`, `example-addon`, các package và điểm truy cập cũ.
Meteor Client là mod riêng; API không nhúng lại implementation của Meteor.

## Điểm mới của beta

- `Menus` / `MenuRegistry`: đăng ký menu theo namespace, factory nhận screen cha,
  token gỡ đăng ký và tự dọn menu thuộc client khi đóng client.
- `Panels.searchable(...)`: tìm kiếm không phân biệt hoa/thường hoặc dấu tiếng Việt;
  loại hàng bị ẩn trước khi phân trang, giữ phần văn bản đang nhập khi dựng lại trang.
- `Panels.choice(...)`: chọn giá trị enum bằng widget; nút có điều kiện bật/tắt.
- `Setting.label(...)`: tên hiển thị rõ ràng, tách khỏi ID và khóa cấu hình ổn định.
- `Client.findModule`, `categories`, `menu`: tra cứu và tích hợp menu có chủ sở hữu.
- Chặn đăng ký command/HUD/menu sau khi client đóng; khóa danh sách setting sau khi
  đăng ký module để không phát sinh setting bị bỏ quên trong cấu hình.
- Kết quả hộp chọn tệp đến sau khi screen bị thay, đóng hoặc resize không ghi vào
  setting của phiên screen cũ.

## Cài đặt và số phiên bản

Chỉ giữ **một** JAR `meteor-api` trong `mods`:

1. Thay JAR API cũ bằng `meteor-api-0.1.2-beta.jar`.
2. Dùng Minecraft 1.21.11, Fabric Loader 0.19.5, Java 21.
3. Tùy chọn: Meteor Client **1.21.11 build 86**, Mod Menu **17.0.0**, example beta.
4. F8 mở API → Danh sách menu. Example: F9 mở GUI, F10 bật/tắt HUD.

**Tên phiên bản được giữ đúng yêu cầu của tác giả.** Mã beta phát triển từ source
0.2.0, nhưng theo so sánh SemVer, `0.1.2-beta` thấp hơn `0.2.0`.
Addon có dependency `>=0.2.0` sẽ không tự chấp nhận beta này. Cập nhật dependency của
addon sang `0.1.2-beta` và build lại; bản example đi kèm đã dùng đúng dependency.
Không đổi giả quy tắc so sánh của Fabric để che vấn đề này.

## Viết menu

```java
var result = Menus.register(new NamespacedId("my-client", "tools"), "My Tools",
    parent -> Panels.create("My Tools")
        .searchable("Search tools...")
        .toggle("Enable overlay", enabled)
        .choice("Display mode", mode, DisplayMode.class)
        .button("World action", GameAccess::inWorld, () -> doWorldAction())
        .build(parent));
result.value().ifPresent(scope::own);
Menus.open(new NamespacedId("my-client", "tools"), MinecraftClient.getInstance().currentScreen);
```

Đoạn trên giả định đã có setting, enum, scope, import và hàm hành động của addon.
Ví dụ đầy đủ có thể build ở `example-addon/src/main/java`.

`client.start()` đăng ký menu `<owner>:main`. Dùng `client.menu("tools", ...)` cho
menu con; tên `main` được dành cho màn chính. Các factory chỉ tạo screen, không tự
gọi `setScreen`. Thao tác menu Minecraft chạy trên client thread.

## Tên rõ ràng, ID ổn định

```java
var x = Settings.longValue(new NamespacedId("my-client", "status/x"), 8, 0, 10000)
    .label("Horizontal position");
```

GUI dùng `label()`, config vẫn dùng `my-client:status/x`. Đổi ngôn ngữ của nhãn
không đổi ID, không tạo đăng ký thứ hai và không làm mất giá trị đã lưu.

## Mã nguồn và tài liệu

| Vị trí | Nội dung |
|---|---|
| `api/src/main/java` | API Minecraft, menu, client, GUI, packet, bridge tùy chọn |
| `foundation/src/main/java` | Model/registry/settings/events/lifecycle Java thuần |
| `example-addon/src/main/java` | Ví dụ menu, enum, nhãn, HUD và packet |
| `docs/BETA-0.1.2.md` | Hướng dẫn, hợp đồng API và khác biệt beta bằng tiếng Anh |
| `docs/API-NAMES.md` | Bảng tên và mục đích của các nhóm API |
| `docs/generated/METEOR-API-BROWSER.html` | Tra cứu source API beta offline |
| `docs/VERIFICATION.md` | Kiểm tra thực tế và phần chưa được thử trong game |
| `docs/generated/BACKPORT-26.3-LEDGER.csv` | Phần backport đã port/cần rà soát/còn chờ |

```powershell
.\gradlew.bat :foundation:check :api:build :example-addon:build
py -3 tools\verify_release.py
```

Không có tuyên bố mọi API 26.3 đã backport 100%. Beta này hoàn thiện hạ tầng SDK và
menu; không tự biến addon của mọi phiên bản Minecraft thành binary tương thích.
Nguồn gốc Meteor và giấy phép được ghi trong `NOTICE.md` và `LICENSE`.
