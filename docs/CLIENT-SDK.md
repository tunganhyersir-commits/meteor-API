# API viết client riêng

SDK được thiết kế cho client tiện ích, gameplay, tối ưu hiệu năng, client tùy biến,
client có module hack/cheat và các tổ hợp module khác. Kiến trúc không giả định một
loại module duy nhất. Nó cung cấp hạ tầng; không tự cài các tính năng gameplay vào
mọi client sử dụng thư viện.

## Tạo client và nhóm module

```java
Clients.create("my-client", "My Client").value().ifPresent(client -> {
    client.category("render", "Hiển thị");
    client.module(new StatusModule());
    client.command("hello", "Local greeting", context -> context.reply("Hello"));
    client.start();
});
```

Owner là namespace riêng. Hai client khác owner có thể cùng có module local `status`
mà không ghi đè. Module registry khóa bằng NamespacedId, không ép mỗi class chỉ có
một instance. Category, module, option và command trùng được trả thành kết quả rõ ràng.
Đăng ký category/module trước `start()` để kiểm tra toàn bộ cấu hình trước khi nạp.

```java
final class StatusModule extends ClientModule {
    private final Setting<Long> x = setting(Settings.longValue(optionId("x"), 8, 0, 10000));

    StatusModule() {
        super(new NamespacedId("my-client", "status"),
              new NamespacedId("my-client", "render"), "Status", "My HUD");
        bind(GLFW.GLFW_KEY_F10, 0);
    }

    @Override protected void onStart(ResourceScope resources) {
        MeteorApi.hud().listen(optionId("draw"), event -> {
            event.canvas().text("Client active", x.get().intValue(), 8, 0xFFFFFFFF);
        }).value().ifPresent(resources::own);
    }
}
```

Ví dụ hoàn chỉnh được compile trong `example-addon/ExampleClient.java`. Sau khi cài
example, mở F8 → Example Client hoặc dùng F10 để bật/tắt HUD trong world.

## Vòng đời

| Hook/trạng thái | Hành vi |
|---|---|
| `enable` | Idempotent; lỗi khởi tạo dọn scope và trở về inactive |
| `onStart(scope)` | Khởi tạo tài nguyên khi world sẵn sàng |
| `onTick` | Gọi khi module đang chạy; lỗi được log và tắt module |
| `onStop` | Dừng tài nguyên của world hiện tại |
| `disable` | Thử mọi cleanup, kết thúc inactive kể cả hook dừng lỗi |
| `active` | Ý định bật module |
| `running` | Module đã khởi tạo runtime trong world hiện tại |
| `runInMenus` | Đặt true trong module để chạy cả khi không có world |

Module bật trước lúc vào world sẽ chờ, thay vì gọi hook cần player khi player null.
Khi đổi world hoặc rời world, runtime scope cũ được đóng; khi world mới sẵn sàng,
scope mới được tạo. Không giữ nhầm listener/entity/world của phiên trước.

`resources.own(token)` quản lý listener, task, service hoặc các AutoCloseable khác.
Tắt module không được đăng ký thêm listener trùng; token chỉ đóng một lần. Vòng đời
module yêu cầu client thread. Tác vụ nền không được đọc/sửa world một cách tùy tiện.

## Input, command và cấu hình

Bind bàn phím có modifier; GUI của client cho chỉnh key code/modifier mask. Keybind
chỉ xử lý khi không có screen đang nhập liệu. Có thể dùng `MeteorApi.keys` và
`InputState` khi cần chính sách input riêng.

Command mặc định có dạng `@my-client help`, `modules`, `toggle <id>`, `save`, `load`.
Chỉ prefix của client đã start mới được xử lý cục bộ. Các command đó không được gửi
thành chat server. Parser hỗ trợ dấu nháy và escape. Các command của Meteor giữ prefix
riêng; SDK không chiếm dấu chấm mặc định của Meteor.

Mỗi client lưu `config/<owner>/client.properties`. Trạng thái bật, keybind và setting
module được lưu theo ID riêng. Tắt ứng dụng đúng trình tự sẽ save/close các client
qua Fabric lifecycle. Lỗi IO được ghi log; không hiển thị giả như save đã thành công.

## Render và loại client

`MeteorApi.hud()` cung cấp DrawContext và Canvas. `WorldRendering.listen` cung cấp
các phase before/after entities, before debug, before translucent và end main với
nguyên WorldRenderContext của Fabric. Context có matrices, consumers và commandQueue;
có thể dùng API render native đầy đủ để xây các hiệu ứng hoặc overlay của client.
SDK push/pop matrix quanh mỗi callback thông thường; caller vẫn phải tuân thủ
quy tắc buffer/render-state của pipeline game.

`GameAccess` trả client/player/world/inventory/network thật, có Optional khi chưa có
world. `Packets`/`Payloads` cung cấp hook mạng. Khi có Meteor, `MeteorClientApi` trả
nguyên các hệ thống Meteor; đây là đường riêng, không trộn registry client tự viết.

`Profiler` có section namespaced và thống kê count/average/max. `WorkBudget` giới hạn
số công việc và thời điểm bắt đầu công việc kế tiếp; nó không ngắt ngang một callback
chậm. `Tasks.submit` dùng hai worker với hàng đợi 64 mục, có Future và hủy theo scope.
Các công cụ này hỗ trợ xây module tối ưu; không tự hứa tăng FPS cho mọi modpack.

Các client có thể cùng nạp nhờ định danh riêng. Những module cùng điều khiển camera,
movement hoặc render state vẫn cần chính sách phối hợp của tác giả; namespace không
thể tự chứng minh mọi hành vi của các mod bên ngoài đều tương thích.

## Bổ sung 0.1.2-beta

`Client.menu` đăng ký menu con có chủ sở hữu, `findModule`/`categories` cho tra cứu
read-only; `start` đăng ký `<owner>:main`. Setting được khai báo trước khi đăng ký
module và dùng `label()` cho GUI. Xem `BETA-0.1.2.md` và `API-NAMES.md`.
