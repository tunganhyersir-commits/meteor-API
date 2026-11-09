# Đối chiếu source 26.3 và nền 1.21.11

Yêu cầu nền tảng cuối cùng là **Fabric 1.21.11 / Loader 0.19.5 / Java 21**.
Không build bất kỳ source 26.3 nào trong các JAR hoạt động.

| Thuộc tính | Source Meteor bạn gửi | Runtime đang dùng |
|---|---|---|
| Minecraft | 26.3 | 1.21.11 |
| Java | 25 | 21 |
| Mapping | Tên Mojang | Yarn 1.21.11+build.3 |
| Client class | `Minecraft` | `MinecraftClient` |
| Text | `Component` | `Text` |
| NBT | `CompoundTag` | `NbtCompound` |
| Tick event Meteor | `TickEvent` | `TickEvent` |
| Key event Meteor | `KeyInputEvent` | `KeyEvent` |
| Loader active build | Không dùng source tham khảo | 0.19.5 |

Giữ source build 86 đúng Minecraft có thể chạy thực tế tốt hơn việc sửa hàng loạt tên
import và giữ nguyên mixin target của một Minecraft khác. Toàn bộ chức năng/API gốc
**của Meteor 1.21.11 build 86** được bảo toàn trong runtime.

Các lớp mới ở 26.3 như `LongSetting`, `FileSetting`, `WLongEdit`, `FileDialogs`,
`KeyInputEvent`, renderer mới và các accessor đổi tên không được tuyên bố đã backport
về 1.21.11. Một số thay đổi chỉ là mapping, một số thay đổi game/API thật. Danh sách
chính xác nằm trong `generated/26.3-vs-1.21.11.json`; phép so sánh dựa trên cú pháp,
không giả định hai declaration khác chữ là khác hành vi.

Yêu cầu “100%” trong báo cáo hoàn tất được giới hạn rõ ở: giữ tất cả class bytecode
của bản Meteor **đúng phiên bản 1.21.11**. Nó không phải cam kết bao phủ API tương lai
của Meteor 26.3 hoặc mọi phiên bản snapshot khác.

Đổi tên đăng ký addon mới không làm đổi namespace của class gốc. Addon cần chuyển từ
Mojang mappings sang Yarn khi compile cùng SDK này. Các addon đã nhắm Yarn 1.21.11
build 86 có thể tiếp tục dùng API gốc trực tiếp.
