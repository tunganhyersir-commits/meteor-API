# Kiểm kê toàn bộ dự án đính kèm

Tất cả file được đọc hết bytes, ghi SHA-256/kích thước/phân loại. Java được parse
declaration và comment; Python được parse AST để lấy class/function/docstring, không
import hoặc thực thi các công cụ mạng. Ảnh/font/bytecode được nhận diện bằng chữ ký
bytes và hash; không giả là review thủ công từng pixel hoặc từng lệnh máy.

| Dự án | Phiên bản và nền từ source | API được ghi lại | Cách dùng trong bản này |
|---|---|---|---|
| Meteor source đính kèm | MC 26.3, Java 25, Loader 0.19.5 | 951 Java, catalog 6.231 declaration public/protected | Đối chiếu và backport có trạng thái từng declaration |
| Meteor baseline | MC 1.21.11 build 86, Yarn build.3 | 959 Java, 6.257 declaration public/protected | Compile-only cho bridge; không nhúng client |
| Mod Menu | Source MC 1.21.11, Loader build 0.18.3; metadata >=0.17.2 | 55 Java, 510 declaration public/protected | Entrypoint config screen; binary tùy chọn 17.0.0 |
| PacketFixer | 3.3.5, MC 1.21.11, Java 21, Loader build 0.18.1 | 32 Java, 74 declaration public/protected | Adapter read-only cho 13 getter cấu hình; không clone patch |
| Common Networking | 1.0.22, MC 1.21.11, Java 21, Loader build 0.18.2 | 27 Java, 156 declaration public/protected | Capability adapter và giữ handler gốc; có Payloads native riêng |
| Fabric API bổ sung | Base/network/rendering/lifecycle cho 1.21.11; metadata Loader >=0.17.3 | 258 Java, 1.142 declaration public/protected | Bốn module gốc lồng trong JAR; có source và catalog riêng |
| Networking Projects | Các ví dụ Python, không phải mod Minecraft | 13 Python, 81 class/function/method | Tài liệu tham khảo, không compile Python vào mod Java |

Các catalog là cú pháp declaration, không tuyên bố mọi phương thức public đều là
API ổn định của tác giả. Source mixin, GUI nội bộ, build scripts và license cũng được
giữ; không bỏ qua chúng khi đếm toàn bộ file.

Loader build thấp hơn 0.19.5 không tự đồng nghĩa artifact không tương thích. Metadata
và bytecode được đối chiếu riêng. Mọi source đang hoạt động của Meteor API được
compile JDK 21/MC1.21.11 và dependency Loader được ghim 0.19.5. Source 26.3/JDK25,
Forge/NeoForge và template cũ được giữ làm reference, không compile vào JAR API.

Common Networking có hướng dẫn README cũ nhắc Java 17, trong khi properties cho nhánh
được gửi là Java 21. Build đang hoạt động dùng Java 21, không sao chép hướng dẫn cũ
thành yêu cầu runtime. Source chính thức hiện tại cũng khác nhánh đính kèm; report
ưu tiên nội dung đính kèm cho bản cụ thể.

## Catalog

- `generated/all-input-files.json`: từng file, kích thước, hash và loại dữ liệu.
- `generated/all-input-comments.json`: toàn bộ comment Java của input.
- `generated/COMMENT-NOTES.md`: TODO/FIXME/NOTE được tập hợp, không gắn nhãn đã sửa.
- `generated/guides-and-licenses.json`: mọi guide/license đã kiểm kê.
- `generated/<project>-API-INDEX.md`: API của từng dự án Java chia theo phần.
- `generated/python-api.json`: API Python, kèm vị trí và docstring.

Không chạy chức năng LAN scanner/sniffer, firewall, spoofing hay proxy của bộ Python.
Chúng không phải API Minecraft và không cần thiết để xây observer cho packet game.

## Nguồn tra cứu bổ sung

Đã đối chiếu tài liệu Mod Menu Java API, trang phát hành 17.0.0 và tài liệu Fabric
Networking đúng mục 1.21.11; thêm README upstream Common Networking và PacketFixer.
Danh sách URL và mục đích ở `RESEARCH.md`. Các bản binary thực dùng để compile/build
được ghim SHA-256 trong `libs/checksums.json`.
