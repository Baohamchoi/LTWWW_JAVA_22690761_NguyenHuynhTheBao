<!-- Banner động -->
<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=160&color=0:00b4db,100:0083b0&text=L%E1%BA%ADp%20tr%C3%ACnh%20WWW%20v%E1%BB%9Bi%20C%C3%B4ng%20ngh%E1%BB%87%20Java&fontSize=28&fontAlignY=30&desc=Nguy%E1%BB%85n%20V%C4%83n%20A%20%E2%80%A2%20L%E1%BB%9Bp%20DHCNTT&descAlignY=55&descAlign=50" alt="banner"/>
</p>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&pause=1100&center=true&vCenter=true&width=720&lines=Ch%C3%A0o+m%E1%BB%ABng+%C4%91%E1%BA%BFn+repo+m%C3%B4n+L%E1%BA%ADp+tr%C3%ACnh+WWW+v%E1%BB%9Bi+Java!;Sinh+vi%C3%AAn%3A+Nguy%E1%BB%85n+V%C4%83n+A+%7C+L%E1%BB%9Bp%3A+DHCNTT;Ng%C3%B4n+ng%E1%BB%AF%3A+Java+%7C+App+Server%3A+Apache+Tomcat+%7C+VCS%3A+GitHub" alt="typing"/>
</p>

<p align="center">
  <a href="#-cong-nghe-su-dung"><img src="https://img.shields.io/badge/Java-17+-f89820?style=for-the-badge&logo=java&logoColor=white"/></a>
  <a href="#-cong-nghe-su-dung"><img src="https://img.shields.io/badge/Tomcat-10+-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=black"/></a>
  <a href="#-quy-uoc-va-quy-trinh-git"><img src="https://img.shields.io/badge/GitHub-Repo-181717?style=for-the-badge&logo=github"/></a>
  <a href="#-huong-dan-chay"><img src="https://img.shields.io/badge/Build-Maven%20%7C%20Gradle-007396?style=for-the-badge&logo=apachemaven"/></a>
</p>

---

## 📚 Giới thiệu
> Repository phục vụ học phần **Lập trình WWW với công nghệ Java**. Dự án minh họa mô hình Web Java (Servlet/JSP/Spring MVC), triển khai trên **Apache Tomcat**, quản lý mã nguồn bằng **Git/GitHub**.

---

## 🧭 Mục lục
- [📚 Giới thiệu](#-giới-thiệu)
- [👨🏻‍🎓 Thông tin sinh viên](#-thông-tin-sinh-viên)
- [🛠️ Công nghệ sử dụng](#-công-nghệ-sử-dụng)
- [🗂️ Cấu trúc thư mục gợi ý](#️-cấu-trúc-thư-mục-gợi-ý)
- [▶️ Hướng dẫn chạy](#️-hướng-dẫn-chạy)
- [🌿 Quy ước & Quy trình Git](#-quy-ước--quy-trình-git)
- [✅ Tiêu chí hoàn thành](#-tiêu-chí-hoàn-thành)
- [📌 Ghi chú học tập](#-ghi-chú-học-tập)
- [📄 License](#-license)

---

## 👨🏻‍🎓 Thông tin sinh viên
| Họ và tên | Lớp | Mã môn | Học kỳ |
|---|---|---|---|
| **Nguyễn Huỳnh Thế Bảo** | **DHKTPM18CTT** | Lập trình WWW với công nghệ Java | Học kỳ I năm 2025-2026 |

> 🎯 _Mục tiêu cá nhân_: Nắm vững Servlet/JSP, triển khai trên Tomcat, CI đơn giản với GitHub Actions.

---

## 🛠️ Công nghệ sử dụng
- ☕ **Java**: 17
- 🐱‍👤 **Apache Tomcat**: 9/10+
- 🧰 **Build**: Maven
- 💾 **DB**: MariaDB
- 🔐 **Bảo mật** (tùy chọn): Spring Security
- 🧪 **Kiểm thử**: JUnit, Mockito
- 🗂️ **Quản lý mã nguồn**: Git & GitHub

> _Tip_: Ưu tiên chuẩn **Jakarta EE**/Servlet API mới nếu dùng Tomcat 10+.

---

## 🗂️ Cấu trúc thư mục gợi ý
```
webapp-java/
├─ src/
│  ├─ main/
│  │  ├─ java/               # Mã nguồn Java (Controller/Service/DAO)
│  │  ├─ resources/          # cấu hình, template, i18n
│  │  └─ webapp/             # JSP/HTML/CSS/JS, WEB-INF
│  └─ test/java/             # Kiểm thử
├─ pom.xml | build.gradle    # Cấu hình Maven/Gradle
├─ README.md                 # Tài liệu (file này)
└─ .github/workflows/        # CI (tùy chọn)
```

---

## ▶️ Hướng dẫn chạy
### 1) Chạy bằng **Tomcat** (WAR)
1. Cấu hình _pom.xml_ (Maven) hoặc _build.gradle_ (Gradle) để đóng gói `war`.
2. `mvn clean package` **hoặc** `gradle clean build` → tạo file `.war` trong `target/` hoặc `build/libs/`.
3. Copy `.war` vào thư mục `TOMCAT_HOME/webapps/` và khởi động Tomcat.
4. Truy cập: `http://localhost:8080/<context-path>`
5. 

### 2) Chạy **Spring Boot** trên Tomcat embedded (tuỳ chọn)
```bash
mvn spring-boot:run
# hoặc
java -jar target/app-*.jar
```

> Nếu deploy WAR lên Tomcat ngoài, cấu hình `SpringBootServletInitializer` và `packaging` = `war`.

---

## 🌿 Quy ước & Quy trình Git
**Nhánh**
- `main`: ổn định, sẵn sàng release
- `dev`: tích hợp tính năng
- `feature/<tinh-nang>`: phát triển từng chức năng

**Quy ước commit (ngắn gọn)**
```
feat: thêm tính năng mới
fix:  sửa lỗi
docs: cập nhật tài liệu
style: format/code style
refactor: tái cấu trúc không đổi hành vi
test: thêm/cập nhật test
chore: việc vặt (bump version, build script...)
```

**Luồng làm việc**
```bash
# lần đầu
git clone <repo>
cd <repo>

# tạo tính năng
git checkout -b feature/login
# code...
git add .
git commit -m "feat(auth): thêm đăng nhập bằng servlet"
git push -u origin feature/login
# mở Pull Request → review → merge vào dev/main
```

---

## ✅ Tiêu chí hoàn thành
- [ ] Có trang chủ, route cơ bản (Servlet/JSP hoặc Spring MVC)
- [ ] Kết nối DB & CRUD tối thiểu
- [ ] Build ra WAR và deploy Tomcat thành công
- [ ] Viết Unit Test cơ bản
- [ ] CI check build (tùy chọn)
- [ ] Tài liệu hoá API/Endpoints (README)

---

## 📌 Ghi chú học tập
<details>
<summary>📘 Servlet/JSP nhanh gọn</summary>

- `HttpServlet`, phương thức `doGet/doPost`
- Cấu hình `web.xml` hoặc annotation `@WebServlet`
- JSP + JSTL để render view
- Filter & Listener cho cross-cutting
</details>

<details>
<summary>🌐 Spring MVC tóm tắt</summary>

- `@Controller`, `@RestController`, `@RequestMapping`
- `Thymeleaf`/JSP view; `@Service`, `@Repository`
- Validation `@Valid`, `BindingResult`
</details>

---

## 🎨 Trang trí & hiệu ứng động (README-safe)
- Banner **waving** ở đầu (SVG)
- Dòng chữ **typing** động (SVG)
- Badges công nghệ từ **shields.io**
- Dùng emoji, <details> gấp/mở để tạo tương tác

> ⚠️ Lưu ý: GitHub README hỗ trợ HTML cơ bản và ảnh/SVG động (không hỗ trợ CSS animation custom). Các hiệu ứng trên dùng ảnh/SVG hosted.

---

## 📄 License
Phát hành dưới giấy phép **MIT**. Tự do sử dụng cho mục đích học tập và cá nhân.

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=120&section=footer&color=0:0083b0,100:00b4db"/>
</p>
