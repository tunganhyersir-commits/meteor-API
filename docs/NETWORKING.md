# Quan sát packet và custom payload

Hai nhiệm vụ được tách rõ: `Packets` quan sát Minecraft packet đã decode trên kết
nối client; `Payloads` đăng ký codec/handler cho custom payload do mod của bạn sở hữu.

## Các phase quan sát

| Phase | Ý nghĩa thực tế |
|---|---|
| `SEND` | Đi vào hàm send ba tham số, sau các tầng gọi bên ngoài |
| `ENQUEUED` | Hàm send đó trả về; không chứng minh server đã nhận hoặc xử lý |
| `RECEIVE` | Packet đã decode đi vào channelRead0, trước khi vanilla xử lý |
| `DISCONNECT` | ClientConnection bắt đầu xử lý thông tin ngắt kết nối |
| `ERROR` | exceptionCaught nhận lỗi; API chỉ quan sát, không nuốt lỗi |

Nếu Meteor hoặc mod khác chặn packet ở một tầng trước đó, packet ấy có thể không
đi đến hook send của API. Receive hook nhìn thấy packet bundle ở lớp bao ngoài;
caller có thể duyệt `BundleS2CPacket.getPackets()` nếu cần từng phần tử.
Kết nối server phía integrated server được loại bằng NetworkSide; không ghi nhầm
cả hai đầu của một kết nối thành hai packet client.

```java
Packets.typed(id, Packets.Phase.RECEIVE, GameStateChangeS2CPacket.class,
    packet -> LOGGER.info("Weather/event reason: {}", packet.getReason()));
```

`listen` và `typed` chạy trên thread đang gọi hook. Không làm tác vụ chậm, đọc world
hoặc sửa GUI trực tiếp từ callback Netty. Dùng `onClient` để nhận snapshot bất biến,
hoặc `MeteorApi.execute` nếu cần chuyển một tác vụ phù hợp về client thread.
Snapshot không giữ packet, byte buffer, payload, IP hay thông tin tài khoản. Các hook 3D/extraction/terrain được cung cấp riêng qua WorldRendering.

Hàng đợi snapshot tối đa 2.048 mục, drain tối đa 256 mục/tick. Khi đầy, chỉ snapshot
chẩn đoán bị bỏ và tăng `droppedSnapshots`; packet game không bị bỏ. Mỗi listener
có ID namespaced, thứ tự priority xác định và token hủy một lần. Sau ba lỗi liên tiếp,
listener bị loại. Một lỗi listener hoặc lỗi callback ghi log không thoát ra Netty.
Hủy không thu hồi callback đã bắt đầu chạy trên thread khác.

## Payload có kiểu dữ liệu

`playReceiver`/`playSender` dùng RegistryByteBuf; `configurationReceiver`/
`configurationSender` dùng PacketByteBuf. Registry riêng theo phase và direction.
Dùng `CustomPayload.Id<T>` với namespace của chính addon.

```java
Payloads.playSender(ExamplePayload.ID, ExamplePayload.CODEC);
Payloads.playReceiver(ExamplePayload.ID, ExamplePayload.CODEC, payload -> use(payload.text()));
var result = Payloads.sendPlay(new ExamplePayload("hello"));
```

Mỗi phía phải đăng ký schema tương thích trước kết nối. API không làm một server
vanilla tự hiểu payload của addon. `canSend` được kiểm tra trước khi gửi, kết quả
phân biệt đã gửi, chưa có kết nối và kênh không được hỗ trợ.

Codec của Fabric đăng ký theo vòng đời process, không có API gỡ codec. Token receiver
ngừng handler của caller; slot codec vẫn được giữ. Có thể gắn handler mới cùng codec
sau khi đóng token, nhưng không thay schema dưới cùng ID. Các xung đột codec/receiver
được trả thành kết quả; không giả rằng mọi bước là một transaction có rollback.

## Common Networking và PacketFixer

Source Common Networking được kiểm kê đầy đủ. `Integrations.commonNetworkHandler`
cho phép lấy handler của mod đó khi có cài; API không clone một bản mất các thao tác
gửi server/player/chunk/range. Phần tiện ích client mới dùng trực tiếp Fabric API,
không bắt buộc Common Networking và không đăng ký trùng ID vào cả hai backend.

PacketFixer có các patch riêng cho giới hạn dữ liệu, NBT, decode và timeout. API chỉ
cung cấp adapter đọc cấu hình của PacketFixer; không tự bật unlimited limit, thay
decoder hoặc ghi đè config của mod đó. Các mixin quan sát packet của API không hủy
luồng xử lý hay redirect các constant mà PacketFixer sửa.

Tham khảo: https://docs.fabricmc.net/1.21.11/develop/networking và
https://github.com/mysticdrew/common-networking . Source đính kèm là cơ sở cho phiên bản cụ thể.
