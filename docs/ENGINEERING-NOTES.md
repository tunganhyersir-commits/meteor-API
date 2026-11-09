# Ghi chú để tiếp tục dự án

Yêu cầu đã chốt: MC1.21.11/Fabric Loader0.19.5/JDK21, API tách Meteor Client, cài cùng
được, registry an toàn, GUI/Mod Menu, packet send/receive, đọc toàn bộ nguồn và phát
triển SDK cho client gameplay/hack/cheat/tối ưu/client riêng.

## Thay đổi kiến trúc so với 0.1

0.1 đóng gói toàn runtime Meteor và giữ ID `meteor-client`, do đó không cài cùng một
Meteor gốc khác. 0.2 có ID `meteor-api`, không nhúng các class Meteor. Optional bridge
chỉ được Meteor nạp; optional Mod Menu entrypoint chỉ được Mod Menu nạp. Namespace
mới tách biệt. History của 0.1 chỉ là tham khảo, không thuộc build active.

Không được đổi metadata của một binary 26.3 để gọi nó là 1.21.11. Source 26.3/JDK25
được đối chiếu, code active phải compile với game 1.21.11 thật. Những API còn chờ giữ
trong ledger; không xóa trạng thái chờ để tăng phần trăm hoàn tất.

## Những quyết định quan trọng

- Client SDK có registry theo NamespacedId; không dùng lỗi so sánh hash-only của Category Meteor.
- Legacy bridge giữ kiểm tra duplicate name/alias/class và hash category trước khi ghi.
- Native module chờ world, dọn running scope khi world đổi, giữ ý định active để chạy lại.
- Observer packet không cancel hoặc nuốt exception mạng; snapshot bounded, raw callback phải ngắn.
- Payload codec là tài nguyên process của Fabric; token chỉ tháo handler, không giả rollback codec.
- GUI dùng Screen/DrawContext native; world rendering trả full Fabric context, giữ đường API thấp.
- Client command dùng `@owner`, không tranh dấu chấm với Meteor. Command cục bộ bị chặn khỏi chat server.
- Một lớp module native có thể có nhiều instance với ID khác; registry native không khóa theo Class như Meteor.
- Module/state/settings/commands được đăng ký trước start. Không thêm hot reload giả chưa có transaction.
- PacketFixer adapter chỉ đọc getter; không tự đổi timeout/NBT/protocol limit.
- Common Networking không bị clone thành một backend mất chức năng; giữ handler thật khi cài mod đó.
- Python Networking Projects chỉ được phân tích; không chạy công cụ mạng và không trộn vào JAR Java.

## Điều đã đọc và ghi lại

2.723 input files gồm các archive người dùng và nguồn bốn Fabric API submodule bổ sung.
Mọi file có hash/kích thước/loại; Java có declaration/comment; Python có AST signature
và docstring. Có 30 guide/license trong các input ban đầu, thêm license Fabric source.
Binary được phân loại/hash, không nhận là review thủ công nội dung hình ảnh/bytecode.

Class mappings official→Yarn được nối qua namespace obfuscated (1.21.11). Ledger
không coi chữ ký chuẩn hóa là proof hành vi, đặc biệt khi initializer/nullability
bị lược khỏi so sánh. Source 26.3 còn một parser limitation ở SlotUtils unnamed patterns.

Graphify đã được gọi nhưng trả chưa có workspace/tài khoản chưa setup. Không có graph
index hoặc memory Graphify được ghi. Tài liệu và graph import cục bộ là ghi chú bền vững
của lần làm này. Graph là import/ứng viên cùng package, không phải call graph resolved.

## Các việc cần xác minh tiếp bằng game

Mở đúng MC1.21.11/Loader0.19.5/JDK21 và thử API riêng, API+Meteor86, API+ModMenu17,
API+Meteor+ModMenu. Kiểm tra F8/F9/F10, command/history, module wait-world/restart,
HUD/render3D, packet callbacks/payload schema hai đầu, native dialogs và save/load.
Chỉ sau thực sự chạy mới cập nhật `game_runtime_tested`.

Trước khi sửa thêm: đọc README, CLIENT-SDK, BACKPORT và VERIFICATION. Chạy các test
hiện có sau thay đổi, giữ checksum/artifact và trạng thái chưa xong trung thực.
