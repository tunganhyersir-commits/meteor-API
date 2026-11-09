# API giao diện

API GUI hoạt động khi không cài Meteor. `Panels.create(title)` tạo một screen native;
`build(parent)` giữ screen trước đó để quay lại. Màn hình không pause game.

| Builder | Chức năng |
|---|---|
| `label` | Dòng mô tả |
| `button` | Hành động có bắt lỗi RuntimeException và báo log |
| `toggle` | Chỉnh Setting<Boolean> |
| `field` | Chỉnh setting qua codec, phản hồi giá trị sai |
| `file` | Chọn tệp bằng native dialog bất đồng bộ |
| `onClose` | Lưu cấu hình hoặc dọn tài nguyên khi đóng |

Có scroll wheel, Page Up/Down và nút chuyển trang. Widget vanilla cung cấp focus,
keyboard navigation và narration. Kiểm thử trực quan với cửa sổ Minecraft chưa được
thực hiện trong lần build này; đặc biệt cần kiểm tra tỷ lệ GUI lớn và cửa sổ rất nhỏ.

Settings hỗ trợ default/reset, parse/validate, visibility, change listener có token,
codec tùy biến và config UTF-8 ghi bằng atomic replacement. Helper có long đủ 64 bit,
double hữu hạn, bool, text, enum, file và list string không mất dữ liệu Unicode/chuỗi
rỗng. Settings mới không phụ thuộc lớp Setting của Meteor.

`Canvas` có text, item, rectangle, scissor, transform; truy cập `context()` để dùng
texture, tooltip, render state và các API DrawContext khác. API rút gọn không che
mất đối tượng renderer gốc hoặc buộc addon dùng một kiểu GUI duy nhất.

Khi có Meteor, `compat26.settings.LongSetting/FileSetting/PacketListSetting` kế thừa
Setting của Meteor. Bridge đăng ký factory tương ứng với class riêng. `WLongEdit`
giữ giá trị long đầy đủ, validate/clamp khi commit, không cần truy cập trường cursor
protected bằng reflection. `ThemeApi.longEdit` cung cấp extension cho theme đang có.

FileDialogs thay SDL của 26.3 bằng TinyFD đã có trong 1.21.11. Có cả Future<Optional<Path>>
và overload callback File tương ứng. Hủy hộp chọn trả Optional.empty; lỗi trả Future
exceptional. Callback dạng File được chuyển về client thread. Native dialogs chưa
được mở kiểm thử trên Windows/macOS/Linux trong lần build này.

Mod Menu integration implement `ModMenuApi.getModConfigScreenFactory`, được metadata
entrypoint `modmenu` tìm thấy. Không nhúng bản class `com.terraformersmc.*` vào API.
Nếu không cài Mod Menu, dùng F8 hoặc tự mở screen.

Tham khảo: https://github.com/TerraformersMC/ModMenu#java-api và
https://docs.fabricmc.net/1.21.11/develop/rendering/gui/custom-screens .

## Bổ sung 0.1.2-beta

`searchable` lọc theo nhãn trước khi phân trang; `choice` hỗ trợ enum; overload
`button` có predicate bật/tắt. `Menus`/`MenuRegistry` quản lý menu theo namespace.
Hàng ẩn không chiếm chỗ, editor giữ dữ liệu đang nhập; completion chọn tệp cũ
không cập nhật screen đã đóng/thay/resize. Xem `BETA-0.1.2.md`.
