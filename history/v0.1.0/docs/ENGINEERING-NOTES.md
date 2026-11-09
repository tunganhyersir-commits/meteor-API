# Ghi chú kỹ thuật để tiếp tục dự án

## Mục tiêu đã chốt

- Minecraft Fabric **1.21.11**, Fabric Loader **0.19.5**, JDK **21**.
- Giữ toàn bộ API Meteor tương ứng phiên bản đó và bổ sung lớp thư viện riêng.
- Thay đổi đường đăng ký mới để tránh ghi đè, tên/alias/lớp trùng và crash do các lỗi trùng thông thường.
- Có source đầy đủ, tài liệu, bản đồ phụ thuộc, mục lục chú thích, kiểm chứng có thể chạy lại.

## Nguồn và sự khác biệt

Hai ZIP đầu tiên chứa source Meteor 26.3/JDK25 và addon template 1.21.11/JDK21.
ZIP template Fabric sau đó dùng official Mojang mappings, Loader 0.20.1 và Loom 1.19-SNAPSHOT.
Không thể chỉ sửa số phiên bản rồi coi chúng tương thích.

Source runtime đúng bản được lấy tại commit `48030717dc0d4898a195a713fb048bf597fc5b54`,
trùng trường `meteor-client:commit` trong artifact Meteor 1.21.11 build 86.
Runtime/API đang hoạt động dùng Yarn `1.21.11+build.3`, Loader 0.19.5, Loom 1.14.10.
Bản template Fabric gốc được giữ trong `upstream/user-template`; project triển khai là ở root.

## Hướng dẫn và chú thích đã ghi lại

`tools/audit_sources.py` đọc toàn bộ bytes của từng file nguồn đầu vào, ghi SHA-256,
kích thước, loại file, số dòng text; parse toàn bộ Java và trích toàn bộ comment bằng AST.
Các file nhị phân được nhận diện bằng chữ ký bytes và hash, không được tuyên bố đã
đọc nội dung hình ảnh/font như một bài review thủ công.

`upstream/meteor-1.21.11/README.md`: build bằng Gradle; hướng dẫn đóng góp yêu cầu
header bản quyền, định dạng gần code hiện có, ưu tiên dễ đọc; thông báo nguồn và GPL
được giữ. `upstream/addon-template-1.21.11/README.md`: entrypoint addon, quy trình
build, thư mục nguồn, cập nhật catalog/mappings và wrapper. `upstream/user-template/README.md`
trỏ đến tài liệu Fabric. Toàn bộ README, license, workflow, resource JSON, Gradle,
`.editorconfig`, template issue/PR và Java đều có trong danh mục file.

Các comment TODO/FIXME/NOTE được giữ nguyên trong
`generated/all-input-comments.json` và `generated/COMMENT-NOTES.md`. Chúng không tự
động được đánh dấu là đã sửa. Những ghi chú đáng chú ý: chuyển đổi long sang int trong
mesh renderer; HUD Combat còn TODO dùng renderer chung; color editor nhắc trường hợp
chia cho 0; một số module/decoder giữ TODO gốc. Đây là backlog upstream, không phải
tính năng mới đã hoàn tất.

## Quy tắc quan trọng đã xác minh từ source

| Quy tắc | File nguồn |
|---|---|
| Khởi tạo Meteor có hai giai đoạn; lần đầu lưu `INSTANCE`, mixin game gọi giai đoạn hai | `MeteorClient.java`, `mixin/MinecraftClientMixin.java` |
| Package từng addon được đăng ký lambda factory cho Orbit trước `onInitialize` | `MeteorClient.java` |
| Category chỉ đăng ký trong callback riêng | `systems/modules/Modules.java`, `Categories.java` |
| Module lookup khóa theo class; đăng ký cùng tên có thể xóa instance cũ | `systems/modules/Modules.java` |
| So sánh category chỉ dựa trên hash tên | `systems/modules/Category.java` |
| Command thêm bằng tên có thể thay thế entry; alias đăng ký riêng vào Brigadier | `commands/Commands.java`, `Command.java` |
| HUD info dùng TreeMap theo name, `put` ghi đè | `systems/hud/Hud.java` |
| Cấu hình hệ thống dùng NBT; không thể đổi sang JSON mà giữ nguyên hành vi | `systems/System.java`, `Systems.java` |
| Thứ tự init có phụ thuộc phản chiếu | `utils/ReflectInit.java`, `PreInit.java`, `PostInit.java` |
| Mixin phát event và nhiều mixin gọi trực tiếp module có sẵn | `mixin/MinecraftClientMixin.java` và toàn bộ `mixin/*` |

## Quyết định triển khai

Giữ mọi class/resource upstream để bảo toàn tương thích. Không relocate namespace gốc,
không xóa built-in module, không thay singleton event bus, không tạo một bộ stub giả.
Thêm namespace `dev.meteorlib.*` cho các API được cải tiến. Chỉ metadata runtime thay
đổi tên hiển thị, mô tả, Loader minimum và cấu trúc JAR lồng bổ sung.

Không cài runtime này cạnh Meteor gốc vì chúng chủ ý cùng mod id. Dùng adapter-only
nếu người dùng đã có đúng Meteor build 86. Foundation được lồng trong adapter, adapter
được lồng trong runtime. Example luôn là tùy chọn, không tự thêm module demo vào bản lib.

Các API strict chỉ dùng nếu caller chủ động xử lý ngoại lệ. Đường dùng khuyên nghị
`AddonRegistry` trả `RegistrationResult`; collision không phải lý do làm chết toàn client.
Tuy nhiên không thể bảo đảm addon bất kỳ không crash: constructor, static initializer,
hook, mixin và các mod khác vẫn có thể có lỗi độc lập.

## Graphify và giới hạn phân tích

Đã gọi danh sách repository và workspace của Graphify. Kết quả: không có workspace
khả dụng, nên không có graph repository được index và không có nơi lưu `remember`.
Không giả tạo kết quả Graphify hoặc lưu ghi chú vào repository không liên quan.

Bản đồ được tạo cục bộ từ import Java và tham chiếu tên cùng package. Wildcard import
được mở rộng thành các ứng viên trong package, có thể là over-approximation; đây không
phải call graph đã resolve hoặc chứng minh runtime không có vòng phụ thuộc.
Ghi chú lâu dài của công việc là file này và toàn bộ `docs/generated`.

Parser không có lỗi cú pháp trên toàn bộ source Java của 1.21.11. Bản tham khảo 26.3
có một chỗ parser không nhận cú pháp switch nhiều unnamed pattern tại
`utils/player/SlotUtils.java:61`; nội dung gốc vẫn được đọc, giữ nguyên và ghi lại.
Không tuyên bố catalog 26.3 là phép phân tích ngữ nghĩa hoàn hảo.

## Cách tiếp tục an toàn

1. Đọc README, REGISTRATION, VERIFICATION, rồi kiểm tra `libs/checksums.json`.
2. Thêm source mới trong foundation hoặc adapter, không sửa `upstream` để né test.
3. Nếu sửa class gốc, ngừng tuyên bố 100% byte-identical, thay baseline và tạo báo cáo ABI riêng.
4. Chạy foundation checks và build adapter/example sau thay đổi API.
5. Đóng gói lại bằng script, kiểm tra từng class/resource giữ nguyên.
6. Test trong client 1.21.11/Loader0.19.5 trước khi tuyên bố đã kiểm chứng hành vi game.
