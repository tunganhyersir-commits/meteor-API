# Kết quả kiểm chứng

| Kiểm tra | Kết quả |
|---|---|
| Source Java Meteor 1.21.11 | 959 tệp, parse không lỗi |
| Danh mục API gốc | 6.257 khai báo có cú pháp public/protected |
| Source Java MeteorLib mới | Có catalog riêng `generated/meteorlib-api.json` |
| Foundation | 37 assertion checks qua JVM Java 21 |
| Adapter | Compile + build + remap + sources + Javadoc thành công |
| Addon ví dụ | Compile + build + remap thành công |
| Core original | SHA-256 khớp baseline build 86 |
| Runtime độc lập | 1.349/1.349 class upstream giữ nguyên bytes |
| Resource và thư viện gốc | 182 entry không phải class/metadata giữ nguyên bytes |
| Mixin/access widener | Giữ nguyên nội dung, vẫn có trong JAR |
| Metadata hoạt động | Minecraft 1.21.11; Loader >=0.19.5; Java >=21 |
| Full core build từ source | Chưa hoàn tất trong môi trường này: không tải được dependency Fabric API qua JVM |
| Chạy game thực tế | Chưa kiểm chứng |

Log build adapter/example nằm trong `verification/adapter-example-build.log`.
Báo cáo đối chiếu binary nằm trong `verification/runtime-integrity.json`.
Log thử build core source ở `verification/source-runtime-build.log`: lỗi tải dependency,
không được ghi thành build thành công. JAR phân phối dùng binary upstream đã ghim và
ghép adapter đã biên dịch, không giả là core vừa được compile lại từ source.

## Phạm vi kiểm tra tự động

Foundation checks bao gồm thứ tự cleanup và xử lý nhiều lỗi, hủy token một lần khi có
nhiều thread, từ chối thao tác sai thread, vòng đời service cũ/mới, định dạng ID, tên
và alias trùng case-insensitive, va chạm hash Java thật `Aa`/`BB`, kết quả đăng ký lỗi
không throw, thứ tự tác vụ, hủy tác vụ, overflow, hàng đợi có giới hạn, chống tick đệ
quy và tiếp tục sau khi tác vụ lỗi.

Các check này không mô phỏng Minecraft và không chứng minh registry/game render chạy
đúng trên mọi client. Ví dụ đã được biên dịch với API thực, không dùng stub Meteor.

Từng class gốc và từng resource được kiểm tra byte-for-byte, mạnh hơn việc chỉ đếm
tên class có mặt. Điều đó bảo toàn bề mặt API nhị phân của core build 86. Nó không
chứng minh các thay đổi metadata/JAR lồng hoặc lớp bổ sung không bao giờ gặp lỗi trong
game, và không thay việc thử nạp client.

## Kiểm tra client tiếp theo

1. Dùng Minecraft 1.21.11/Loader0.19.5/Java21 với runtime duy nhất.
2. Thêm optional example; mở GUI, bật `meteor-lib-example.reminder`, chỉnh delay,
   tắt trước thời hạn để kiểm tra scope hủy task.
3. Dùng `.meteor-lib-example.doctor`, thêm HUD `meteor-lib-example.status`.
4. Thử hai addon dùng local `status` với owner khác nhau; cả hai phải đăng ký được.
5. Cố đăng ký command/module trùng trong cùng owner: phải có kết quả CONFLICT và log,
   không ghi đè thành phần cũ.
6. Kiểm tra vào/ra world, save/load config và render/HUD khi bật các mod tương thích.

Chỉ sau khi thực sự chạy các bước đó mới nâng trạng thái game runtime lên đã test.
