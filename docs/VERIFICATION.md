# Kiểm chứng 0.1.2-beta

| Nhóm | Kết quả |
|---|---|
| Foundation | 37 kiểm tra đạt |
| Events/settings/config/mailbox | 37 kiểm tra đạt |
| Client SDK/task/profiling | 20 kiểm tra đạt |
| Menu ownership/labels/search/paging mới | 34 kiểm tra đạt |
| Minecraft 1.21.11 class/platform | 39 kiểm tra đạt |
| Tổng kiểm tra Java | **167 đạt** |
| Profile metadata | **6 cấu hình** với VersionPredicate thật của Loader 0.19.5 |
| Build | Foundation/API/example compile, test, remap thành công |
| Public/protected members baseline | 566 thành viên khai báo được đối chiếu, không phát hiện bị loại |
| Class public/protected API/foundation | 89 baseline → 96 beta trong đối chiếu bytecode |
| Trùng class top-level | 0 với Meteor Client, 0 với Mod Menu |
| Java | Bytecode active tối đa major 65 / Java 21 |
| SDK source | 80 Java gồm tests/example; 500 khai báo public/protected theo parser |
| Mở cửa sổ Minecraft | **Chưa thực hiện** |

Các profile: API; API+Meteor; API+Mod Menu; API+cả hai; API+example beta;
API+cả hai+example beta. Dependency của example và thứ tự SemVer của beta đã được
kiểm tra. `0.1.2-beta` thấp hơn `0.2.0`; đây không phải một upgrade theo thứ tự SemVer.

Kiểm tra mới gồm giữ ID config khi đổi nhãn, menu trùng ID, immutable snapshots,
factory lỗi/null/trả lại parent, token cũ không gỡ entry mới, đóng sai thread rồi
đóng đúng thread, lọc hàng ẩn trước phân trang, tìm kiếm không dấu/không phân biệt
hoa thường/nhiều từ, clamp offset và dữ liệu rỗng.

Platform kiểm tra thêm core menu classes link khi chặn Meteor/Mod Menu, constructor
Action cũ còn hiện diện, Action vẫn có hai record component, predicate của nút mới.
Đối chiếu bytecode không chứng minh mọi hành vi tương đương, không bảo đảm source
switch exhaustive qua sealed Row khỏi cần thêm case, và không thay thế dependency
version của addon.

Báo cáo: `verification/build.log`, `platform-checks.json`, `metadata-profiles.json`,
`api-compatibility.json`, `release-checks.json`.

Chưa thử live mixin application, game join/leave, GUI layout/focus/render, native
file dialog và tình huống native completion thực, traffic server thật hoặc các
tổ hợp mod trong game. Mô hình Java của menu/search đã được test; phần native
Minecraft vẫn cần kiểm tra bằng game. Không gắn nhãn backport 26.3 là hoàn tất 100%.

Build ở đây dùng Loom cục bộ chỉ báo Unix-domain socket không được hỗ trợ theo
giới hạn môi trường. Dự án phân phối vẫn ghim Loom chính thức 1.14.10; cấu hình
proxy/truststore riêng của môi trường build không được đóng gói vào dự án.
