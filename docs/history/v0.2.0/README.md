# Meteor API 0.2.0

**Minecraft Fabric 1.21.11 · Fabric Loader 0.19.5 · Java 21**

Thư viện độc lập cho giao diện, settings, sự kiện, lịch tác vụ, quan sát packet và
custom payload. Có lớp tích hợp Meteor Client tùy chọn. Dự án dùng một phần source
Meteor Client, phát hành cùng mã nguồn và thông báo GPL; xem `NOTICE.md`.

## Cài đặt

Chép `dist/meteor-api-0.2.0.jar` vào `mods` của Fabric 1.21.11 / Loader 0.19.5.
API có thể chạy **cùng Meteor Client gốc**: hai bên có mod ID và package khác nhau.

| Thành phần | Mod ID | Cách truy cập |
|---|---|---|
| Meteor API | `meteor-api` | `dev.meteorapi.MeteorApi` |
| Meteor Client | `meteor-client` | API gốc `meteordevelopment.meteorclient.*` |
| Bridge tùy chọn nằm trong Meteor API | Không tạo mod ID Meteor thứ hai | `dev.meteorapi.compat.client.MeteorClientApi` |

Nhấn **F8** để mở bảng Meteor API. Nếu cài Mod Menu, bật hiển thị Library để tìm
Meteor API và mở nút cấu hình. Nhấn **F9** để thử GUI khi cài thêm example tùy chọn.
Trong GUI API có thể đổi phím mở; giá trị `-1` tắt phím tắt.

Các cách cài:

1. **API độc lập:** chỉ cần `meteor-api-0.2.0.jar`. Các Fabric API submodule cần thiết
   và foundation đã được lồng sẵn, không cần cài toàn bộ Fabric API chỉ để chạy API này.
2. **API + Meteor Client:** thêm Meteor **1.21.11 build 86** từ `dist/optional` nếu chưa có. Bridge cho custom
   settings và key events được bật khi đúng baseline; không tự nhúng hoặc đổi tên Meteor. Chỉ giữ một JAR Meteor Client.
3. **Có Mod Menu:** thêm `dist/optional/modmenu-17.0.0.jar`. Mod Menu vẫn là mod riêng.

Đổi bản v0.1.0 cũ sang JAR API mới. Bản `meteor-lib-runtime-0.1.0` trước đây vẫn chứa
Meteor Client; nó không phải API độc lập mới. Không giữ runtime cũ cùng Meteor gốc.

## Viết giao diện

```java
var enabled = Settings.bool(new NamespacedId("my-addon", "enabled"), true);
Screen screen = Panels.create("Công cụ của tôi")
    .label("Giao diện chạy độc lập với Meteor Client")
    .toggle("Bật tính năng", enabled)
    .button("Thực hiện", () -> doWork())
    .build(parent);
MinecraftClient.getInstance().setScreen(screen);
```

`Panels` có label, button, toggle, field, chọn tệp, scroll, focus và callback đóng màn
hình. `Canvas` rút gọn thao tác vẽ; `Canvas.context()` trả nguyên `DrawContext` để dùng
đầy đủ API render gốc. Có thể kế thừa `Screen`/`PanelScreen` và dùng widget Minecraft
trực tiếp. Xem `docs/GUI.md` và example.

## Nghe packet

```java
Packets.onClient(new NamespacedId("my-addon", "traffic"), snapshot -> {
    LOGGER.info("{} {}", snapshot.phase(), snapshot.packetClass());
}).value().ifPresent(resources::own);
```

`onClient` chuyển metadata bất biến về client thread. `listen` và `typed` cung cấp
packet thật trên thread phát sinh sự kiện, có lọc theo phase/loại. ID trùng bị từ chối
bằng kết quả; listener lỗi liên tiếp bị tách khỏi kênh sự kiện. Observer không hủy,
gộp, làm chậm có chủ ý hoặc đổi nội dung lưu lượng. Xem `docs/NETWORKING.md`.

## API viết client riêng

`Clients.create(owner, title)` cung cấp registry module/category riêng, lifecycle, keybind,
command cục bộ, lưu cấu hình, GUI quản lý và HUD. `WorldRendering` cung cấp context 3D
đầy đủ của Fabric; `GameAccess`, `Tasks`, `Profiler`, `WorkBudget` hỗ trợ gameplay và
tối ưu. Xem `docs/CLIENT-SDK.md` và `ExampleClient.java`.

## Phần đã backport

Các phần mới đã có triển khai: setting long/file/packet type; widget long và màn chọn
packet; keybind có modifier và NBT cũ/mới; file dialog bất đồng bộ; ListMode,
EntityAgeTest, SwingMode, DisplayItemUtils; packet catalog theo PacketType; helper
render, outline queue và vertex consumer. Phần cần Meteor được đặt dưới `compat26`.

**Chưa được gọi là toàn bộ API 26.3 đã backport 100%.** Mọi khai báo đã được ghi vào
`docs/generated/BACKPORT-26.3-LEDGER.csv`: phân biệt khai báo có sẵn ở 1.21.11,
chữ ký chỉ đổi mappings, code đã port, phần cần rà soát và hook riêng của game.
Sự tương đương của tên/chữ ký không được dùng thay kiểm chứng hành vi.

## Tài liệu và build

- `docs/generated/METEOR-API-BROWSER.html`: tra cứu API mới offline.
- `docs/generated/1.21.11-API-INDEX.md`: API Meteor gốc của baseline.
- `docs/DEPENDENCIES.md`: toàn bộ dự án bạn gửi, phiên bản và API đã kiểm kê.
- `docs/BACKPORT.md`: tình trạng và giới hạn backport.
- `docs/VERIFICATION.md`: kết quả kiểm tra, phạm vi kiểm chứng thực tế.

```powershell
.\gradlew.bat :foundation:check :api:build :example-addon:build
py -3 tools\verify_release.py
```

JDK 21, Gradle wrapper 9.2.1, Loom 1.14.10. Source active chỉ có `foundation`, `api`,
`example-addon`; source gốc và `history` không được compile vào JAR API.
