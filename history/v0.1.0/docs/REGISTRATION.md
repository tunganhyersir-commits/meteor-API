# Đăng ký và chống xung đột

API khuyên dùng là `AddonRegistry`. Mỗi addon chọn owner chính là mod id của mình,
ví dụ `new AddonRegistry("sand-tools")`; `name("status")` cho `sand-tools.status`.
Dấu chấm phân tách owner/local name, cả hai phần không được chứa dấu chấm nên
không có trường hợp ghép chuỗi mơ hồ. Dùng tên lowercase và ký tự `[a-z0-9_-]`,
bắt đầu bằng chữ cái. Các alias phải cùng owner.

## Quy tắc trước khi ghi

| Thành phần | Kiểm tra |
|---|---|
| Category | Tên không trùng case-insensitive; hash tên không trùng Category đã có |
| Module | Không trùng lớp instance, tên, alias; category phải đã đăng ký |
| Command | Tên chính và tất cả alias không giao nhau; không alias lặp trong chính command |
| HUD | Không trùng tên, kể cả chỉ khác chữ hoa/chữ thường |
| Listener | Một lần subscribe thực cho mỗi identity qua `MeteorLib.listen`; reference count cho nhiều scope |
| Service | Một service cho mỗi contract type; token cũ không xóa service mới |
| Cleanup | Token chạy một lần; scope đóng một lần, giải phóng theo thứ tự ngược |

Các API sửa game yêu cầu client thread. Category chỉ đăng ký trong
`onRegisterCategories`; module/command/HUD trong `onInitialize`.
`AddonRegistry` trả kết quả `REGISTERED`, `CONFLICT`, `INVALID`, `FAILED` cho các trường
hợp thông thường; bản strict `Registry` có thể ném ngoại lệ để lập trình viên tự xử lý.
`RegistrationResult.Status.ALREADY_PRESENT` được dành cho caller xây lớp cache;
việc strict registry chấp nhận lại cùng identity vẫn được adapter báo `REGISTERED`.

Kết quả lỗi không có `value`. Đừng dùng `orElseThrow` nếu mục tiêu là tiếp tục chạy khi
thành phần tùy chọn không đăng ký được. Nếu category không tạo được, bỏ qua các module
phụ thuộc nó. Ví dụ đi kèm thực hiện đúng đường đi này.

Mỗi phần tử được kiểm tra trước khi thêm vào upstream. Đây không phải giao dịch nguyên
tử bao trùm toàn addon: lỗi bên trong code người dùng hoặc hook upstream xảy ra sau khi
thêm không thể đảm bảo rollback toàn bộ. Không bắt `Error` của JVM để che lỗi nghiêm trọng.

## Vì sao cần đổi đường đăng ký?

Trong source gốc:

- `Modules.add` xóa module cùng tên, nhưng map instance lại khóa bằng `Class`.
- `Commands.add` xóa command cùng tên; alias không được so sánh tại đó.
- `Hud.register` dùng `infos.put`, có thể thay thế entry cũ cùng tên.
- `Category.equals` chỉ so sánh hash tên, nên tên khác nhau vẫn có thể coi là cùng category.

Lớp bảo vệ kiểm tra chính các điều kiện này. Gọi lại strict registry với đúng cùng
đối tượng module/command/HUD không thêm một bản ghi nữa. Tạo đối tượng mới dùng cùng
ID được coi là xung đột và đường `AddonRegistry` trả kết quả để tránh crash do ngoại lệ
trùng tên thoát ra quá trình khởi tạo.

Không thể chặn addon khác gọi trực tiếp API legacy mà vẫn giữ bytecode gốc không đổi.
Muốn dùng chính sách mới, addon phải chuyển các điểm đăng ký sang `AddonRegistry`.
Tên `meteor-client`, namespace Java gốc và đường config vẫn được giữ nguyên.

## Lưu ý vòng đời

`ManagedModule.onStart(ResourceScope)` sở hữu tác vụ, listener và token service bằng
`resources.own(...)`. Khi tắt module, tất cả cleanup được thử thực hiện; lỗi được ghi
log và không ngăn `Module.toggle` hoàn tất việc đặt trạng thái inactive.

Không `Thread.sleep` trong event game. Scheduler dùng tick, tối đa 4.096 tác vụ đang
chờ và 256 tác vụ mỗi tick. Delay 0 nghĩa là tick kế tiếp, tránh tự enqueue lặp vô hạn
trong cùng tick. Một task lỗi không làm mất các task còn lại khi error handler trả về.

Scope/scheduler là thread-confined. Chuyển công việc về client thread bằng
`MeteorLib.execute(...)`; nó trả CompletableFuture để quan sát hoàn tất hoặc lỗi.
Các listener qua API mới vẫn phải nằm trong package mà `MeteorAddon.getPackage()`
đăng ký với Orbit; việc đăng ký package không bị tự ý mở rộng ra package addon khác.
