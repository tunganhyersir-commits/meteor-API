# Nguồn tra cứu và quyết định

Ngày thực hiện: 2026-11-09. Các source đính kèm và artifact có checksum là cơ sở cho
version cụ thể; tài liệu online chỉ bổ sung, không tự thay thế baseline.

| Nguồn | Mục đích |
|---|---|
| https://github.com/TerraformersMC/ModMenu#java-api | Entrypoint `modmenu`, screen factory, metadata library |
| https://modrinth.com/mod/modmenu/version/17.0.0 | Xác nhận binary 17.0.0 cho Minecraft 1.21.11 |
| https://docs.fabricmc.net/1.21.11/develop/networking | Phase PLAY/configuration, typed payload và đăng ký hai đầu |
| https://github.com/mysticdrew/common-networking | Phân biệt schema registry với observer mọi packet |
| https://github.com/TonimatasDEV/PacketFixer | Phạm vi patch NBT/size/timeout, tách khỏi thư viện quan sát |
| Metadata official client 1.21.11 của Mojang + Yarn build.3 | Nối class mapping qua namespace obfuscated |
| Fabric API 0.140.0+1.21.11 artifact thực | Đọc metadata và API rendering/networking/lifecycle đã remap |

Không lấy API của trang đang mặc định Minecraft 26.x rồi áp đặt chữ ký cho 1.21.11.
Các interface Fabric thực được đọc từ JAR đã remap và compile với target 1.21.11.

Đã gọi Graphify list_repositories/list_workspaces. Tài khoản trả `no_account` /
không có workspace, nên không có graph index hoặc nơi ghi remember. Không giả tạo
Graphify output. Bản đồ import/ứng viên và ledger được tạo cục bộ bằng tree-sitter;
đây không phải call graph đã resolve đầy đủ.
