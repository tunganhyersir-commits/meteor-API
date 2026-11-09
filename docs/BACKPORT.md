# Tình trạng backport 26.3 → 1.21.11

Nền hoạt động là Fabric 1.21.11 / Loader 0.19.5 / Java 21. Bản API mới độc lập với
Meteor Client và không sửa class gốc của Meteor để thêm phương thức dưới cùng FQCN.
Điểm gọi API được chuyển sang namespace mới, giữ được khả năng cài hai mod cùng nhau.

| Nhóm đã triển khai | Đích |
|---|---|
| LongSetting, FileSetting, PacketListSetting | `dev.meteorapi.compat26.settings` |
| Long editor, packet chooser, theme extension | `dev.meteorapi.compat26.gui` |
| KeyInputEvent bridge, WeatherChanger | `dev.meteorapi.compat26.events/modules` |
| Keybind + Modifier, ListMode, EntityAgeTest | `dev.meteorapi.backport` |
| File dialogs | `dev.meteorapi.ui.FileDialogs`, TinyFD thay SDL |
| SwingMode, DisplayItemUtils | Backend protocol/registry đúng 1.21.11 |
| Packet catalog | `dev.meteorapi.network.PacketUtils`, PacketType thật của 1.21.11 |
| Renderer subclass, outline queue, vertex fluent names | Constructor/interface phù hợp pipeline 1.21.11 |
| Utility mới, GUI fill, shouldHideHud | Helper bổ sung, không ghi đè class Meteor gốc |

Long editor không ép về int/double. PacketListSetting vẫn có filter, clientbound/
serverbound, NBT, parse, suggestions và GUI chọn packet. Keybind giữ cả NBT cũ và mới.
FileDialogs giữ kiểu callback và có thêm Future; callback được chuyển về client thread.

## Không đánh đồng tên API với hành vi

`generated/BACKPORT-26.3-LEDGER.json/csv` có một dòng cho mọi declaration public/
protected được parser trích từ source 26.3. Các trạng thái phân biệt:

- Declaration giữ nguyên ở baseline 1.21.11.
- Chữ ký tương đương sau chuẩn hóa class mappings: chỉ là ứng viên, chưa chứng minh implementation.
- Symbol tồn tại nhưng cần rà soát hành vi/default hoặc overload.
- Code đã port hoặc đã thích nghi backend/constructor.
- Hook riêng của phiên bản game, không phải public SDK ổn định.
- Declaration còn chờ backport/review.

Không gắn nhãn “100% đã port” cho các dòng còn chờ. Parser còn một điểm không nhận
cú pháp nhiều unnamed pattern ở SlotUtils của 26.3; raw source và lỗi parser được giữ.

Class map official→Yarn được nối qua namespace obfuscated từ mappings 1.21.11,
ghi ở `generated/mojang-to-yarn-class-map.json`. Chuẩn hóa bỏ annotation và initializer
khi so chữ ký, nên **không** dùng kết quả đó để chứng minh nullability hoặc default
value được giữ nguyên. Đổi tên import chỉ là một bước trong port.

## Những khác biệt thật của Minecraft

26.3 dùng GuiGraphicsExtractor/renderer và một số API transient GPU upload khác với
1.21.11. Thay tên class không tạo ra backend đó. Các constructor renderer được thích
nghi nơi có cơ sở rõ ràng; phần còn lại được giữ trong ledger thay vì tạo stub trả null
hoặc phương thức rỗng rồi tính là thành công.

Packet catalog của 1.21.11 có 227 PacketType thực. Một số ID/packet mới của 26.3 không
tồn tại trong protocol 1.21.11. Alias không có tương đương trả null và được liệt kê trong
`verification/platform-checks.json`; không tự gửi ID không hợp lệ sang server 1.21.11.

Full API gốc của Meteor 1.21.11 vẫn dùng trực tiếp khi có Meteor Client đúng baseline.
API độc lập mới cung cấp GUI/settings/client SDK/networking riêng; nó không tự biến
mọi addon biên dịch cho 26.3 thành binary chạy trên Minecraft khác phiên bản.
