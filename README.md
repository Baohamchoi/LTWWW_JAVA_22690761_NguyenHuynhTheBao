<!-- Animated Banner -->
<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=160&color=0:00b4db,100:0083b0&text=Web%20Programming%20with%20Java%20Technology&fontSize=28&fontAlignY=30&desc=Nguy%E1%BB%85n%20Hu%E1%BB%B3nh%20Th%E1%BA%BF%20B%E1%BA%A3o%20%E2%80%A2%20Class%20DHKTPM18CTT&descAlignY=55&descAlign=50" alt="banner"/>
</p>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&pause=1100&center=true&vCenter=true&width=840&lines=Welcome+to+the+Web+Programming+with+Java+Technology+Repository!;Student%3A+Nguy%E1%BB%85n+Hu%E1%BB%B3nh+Th%E1%BA%BF+B%E1%BA%A3o+%7C+Class%3A+DHKTPM18CTT;Language%3A+Java+%7C+App+Server%3A+Apache+Tomcat+%7C+VCS%3A+GitHub" alt="typing"/>
</p>

<p align="center">
  <a href="#-technologies"><img src="https://img.shields.io/badge/Java-17+-f89820?style=for-the-badge&logo=java&logoColor=white"/></a>
  <a href="#-technologies"><img src="https://img.shields.io/badge/Tomcat-9-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=black"/></a>
  <a href="#-git-workflow"><img src="https://img.shields.io/badge/GitHub-Repo-181717?style=for-the-badge&logo=github"/></a>
  <a href="#-how-to-run"><img src="https://img.shields.io/badge/Build-Maven%20-007396?style=for-the-badge&logo=apachemaven"/></a>
</p>

---

## 📚 Introduction
> This repository is dedicated to the course **Web Programming with Java Technology**. It demonstrates Java Web models (Servlet/JSP/Spring MVC), deployed on **Apache Tomcat**, with source control using **Git/GitHub**.

---

## 🧭 Table of Contents
- [📚 Introduction](#-introduction)
- [👨🏻‍🎓 Student Information](#-student-information)
- [🛠️ Technologies](#-technologies)
- [🗂️ Suggested Folder Structure](#️-suggested-folder-structure)
- [▶️ How to Run](#️-how-to-run)
- [🌿 Git Conventions & Workflow](#-git-conventions--workflow)
- [✅ Completion Criteria](#-completion-criteria)
- [📌 Study Notes](#-study-notes)
- [📄 License](#-license)

---

## 👨🏻‍🎓 Student Information
<p align="center">

| Full Name | Class | Course | Semester |
|---|---|---|---|
| **Nguyễn Huỳnh Thế Bảo** | **DHKTPM18CTT** | Web Programming with Java Technology | Semester I, 2025-2026 |

</p>

> 🎯 _Personal Goal_: Master Servlet/JSP, deploy on Tomcat, and set up simple CI with GitHub Actions.

---

## 🛠️ Technologies
- ☕ **Java**: 17
- 🐱‍👤 **Apache Tomcat**: 9
- 🧰 **Build Tool**: Maven
- 💾 **Database**: MariaDB
- 🔐 **Security** (optional): Spring Security
- 🧪 **Testing**: JUnit, Mockito
- 🗂️ **Version Control**: Git & GitHub

> _Tip_: Prefer **Jakarta EE**/Servlet API if using Tomcat 10+.

---

## 🗂️ Suggested Folder Structure
```
webapp-java/
├─ src/
│  ├─ main/
│  │  ├─ java/               # Java source (Controller/Service/DAO)
│  │  ├─ resources/          # Configurations, templates, i18n
│  │  └─ webapp/             # JSP/HTML/CSS/JS, WEB-INF
│  └─ test/java/             # Tests
├─ pom.xml | build.gradle    # Maven/Gradle configuration
├─ README.md                 # Documentation (this file)
└─ .github/workflows/        # CI (optional)
```

---

## ▶️ How to Run
### 1) Run with **Tomcat** (WAR)
1. Configure _pom.xml_ (Maven) or _build.gradle_ (Gradle) to package as `war`.
2. Run `mvn clean package` **or** `gradle clean build` → generates `.war` in `target/` or `build/libs/`.
3. Copy `.war` to `TOMCAT_HOME/webapps/` and start Tomcat.
4. Access: `http://localhost:8080/<context-path>`

### 2) Run with **Spring Boot** (embedded Tomcat, optional)
```bash
mvn spring-boot:run
# or
java -jar target/app-*.jar
```

> If deploying WAR to external Tomcat, configure `SpringBootServletInitializer` and set `packaging` = `war`.

---

## 🌿 Git Conventions & Workflow
**Branches**
- `main`: stable, release-ready
- `dev`: integration branch
- `feature/<feature-name>`: develop specific features

**Commit Conventions**
```
feat: add a new feature
fix:  fix a bug
docs: update documentation
style: formatting/code style
refactor: refactor code without changing behavior
test: add/update tests
chore: miscellaneous tasks (bump version, build scripts...)
```

**Workflow**
```bash
# first time
git clone <repo>
cd <repo>

# create a feature branch
git checkout -b feature/login
# code...
git add .
git commit -m "feat(auth): add login with servlet"
git push -u origin feature/login
# open Pull Request → review → merge into dev/main
```

---

## ✅ Completion Criteria
- [ ] Home page, basic routes (Servlet/JSP or Spring MVC)
- [ ] Database connection & basic CRUD
- [ ] Build WAR and deploy successfully on Tomcat
- [ ] Write basic Unit Tests
- [ ] CI build check (optional)
- [ ] API/Endpoints documented (README)

---

## 📌 Study Notes
<details>
<summary>📘 Servlet/JSP Quick Notes</summary>

- `HttpServlet`, methods `doGet/doPost`
- Configure `web.xml` or use `@WebServlet` annotation
- JSP + JSTL to render views
- Filters & Listeners for cross-cutting concerns
</details>

<details>
<summary>🌐 Spring MVC Summary</summary>

- `@Controller`, `@RestController`, `@RequestMapping`
- Views with `Thymeleaf`/JSP; `@Service`, `@Repository`
- Validation with `@Valid`, `BindingResult`
</details>

---

## 🎨 Decoration & Animated Effects (README-safe)
- **Waving banner** at the top (SVG)
- **Typing effect** text (SVG)
- Technology badges via **shields.io**
- Use emoji and <details> tags for interactive notes

> ⚠️ Note: GitHub README supports basic HTML and animated SVG images (no custom CSS animations). Effects are achieved with hosted SVGs/images.

---

## 📄 License
Released under the **MIT License**. Free to use for educational and personal purposes.

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&height=120&section=footer&color=0:0083b0,100:00b4db"/>
</p>
