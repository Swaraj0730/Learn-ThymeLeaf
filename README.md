# 🌐 Spring Boot Web App with Thymeleaf

A modern, responsive **Spring Boot** web application using **Thymeleaf** as a template engine. Ideal for form-based UIs, CRUD operations, and dynamic HTML rendering.

---

## 🚀 Tech Stack

- **Java 21**
- **Spring Boot 3.5.0**
- **Spring MVC**
- **Thymeleaf**
- **Spring Data JPA**
- **MySQL / H2 Database**
- **Lombok**
- **Maven**

---

## 🎯 Features

- 📄 Server-side rendering with Thymeleaf
- 🧾 Form submission & validation
- 🔄 CRUD operations (Create, Read, Update, Delete)
- 💾 Configurable MySQL/H2 database
- ✨ Bootstrap-powered UI

---

## 🛠 Getting Started

### Clone the Repository

```bash
git clone https://github.com/your-username/spring-thymeleaf-app.git
cd spring-thymeleaf-app

H2 Database (In-Memory)
-----------------------

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true

MySQL Configuration (Optional)
-------------------------------
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

📂 Project Structure
----------------------

src
├── main
│   ├── java
│   │   └── com.project.webapp
│   │       ├── controller
│   │       ├── service
│   │       ├── model
│   │       └── repository
│   └── resources
│       ├── templates   # Thymeleaf HTML files
│       ├── static      # CSS, JS, Images
│       └── application.properties
└── test

🤝 Contribution
Contributions are welcome! Fork this repo, make changes, and open a pull request.


