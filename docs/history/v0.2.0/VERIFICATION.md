# Kiểm chứng bản 0.2.0

| Kiểm tra | Kết quả |
|---|---|
| Foundation lifecycle/registry/scheduler | 37 kiểm tra JVM đạt |
| API event/settings/config/mailbox | 37 kiểm tra JVM đạt |
| Client SDK lifecycle/command/tasks/profiling | 20 kiểm tra JVM đạt |
| Platform Minecraft 1.21.11 | 33 kiểm tra đạt với class game thật |
| Tổng | **127 kiểm tra đạt** |
| Tổ hợp cài đặt | 4 profile metadata dùng VersionPredicate của Fabric Loader |
| Build | Foundation + API + example compile/build/remap thành công |
| Nạp lớp độc lập | Lớp lõi link được bằng classloader mới khi chặn Meteor/Mod Menu |
| Định danh | API và Meteor/Mod Menu có ID khác nhau |
| Trùng class top-level | 0 với Meteor Client, 0 với Mod Menu |
| Java | Bytecode active tối đa major 65, JDK 21 |
| Phiên bản | Metadata MC1.21.11, Loader >=0.19.5; build dependency pin 0.19.5 |
| Packet catalog | 227 PacketType thực của Minecraft 1.21.11 |
| Source input | 2.723 file đọc hết bytes, 2.292 Java parse |
| Source API mới | 76 Java kể cả tests/example; không lỗi parser |
| Chạy cửa sổ Minecraft | **Chưa thực hiện** |

Build log: `verification/build.log`. Check packaging: `verification/release-checks.json`.
Platform details và các alias packet 26.3 không có tương đương: `verification/platform-checks.json`.

## Các trường hợp đã thử

Listener trùng ID bị từ chối, thứ tự priority ổn định, hủy idempotent, lỗi listener/
filter/logger được cô lập, listener lỗi liên tiếp bị loại, publisher nhiều thread,
mailbox overflow chỉ bỏ snapshot và có đếm, FIFO/drain limit đúng.

Long min/max giữ đủ 64 bit; overflow/range/NaN bị từ chối; list Unicode/chuỗi rỗng
roundtrip, có snapshot bất biến; setting trùng không ghi đè; dữ liệu cấu hình sai giữ
giá trị trước; key không biết của bản config mới được giữ khi save.

Module start/stop idempotent, lỗi activation dọn resource và trả inactive, lỗi stop
vẫn dọn resource, chống reentrant transition/sai thread. Command xử lý quote/escape.
Scope hủy Future nền. Profiler đóng một lần, budget giới hạn công việc.

Keybind dùng class KeyInput/NbtCompound thật, giữ modifier và NBT cũ/mới. PacketType
được liệt kê từ constant game thật. Core type được link trong URLClassLoader mới với
Meteor và Mod Menu bị chặn. Đây không phải test khởi tạo mọi class trong game.

## Giới hạn thực tế

Chưa mở game để kiểm tra apply mixin, render 2D/3D, native file dialog, input trong
các screen, join/leave/change world, traffic server thật hoặc đồng thời bốn tổ hợp
mod. Các tổ hợp đã kiểm tra ở mức metadata, dependency predicate của Loader, định danh, class overlap, nested JAR và
bytecode; không ghi chúng thành “game test đã qua”.

Các phương thức/API 26.3 còn chờ trong ledger không được đánh dấu đã kiểm chứng.
Baseline API gốc Meteor 1.21.11 không bị thay bytecode trong JAR phát hành vì không
có class implementation Meteor nào được nhúng vào JAR API.

Môi trường build hạn chế Unix-domain socket mà Loom thăm dò. Lần build này dùng bản
Loom cục bộ chỉ báo socket đó không được hỗ trợ; source mod/runtime không bị sửa để
né kiểm tra. Project phân phối vẫn ghim Loom chính thức 1.14.10, không yêu cầu sửa
Loom trên Windows thông thường.
