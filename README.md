# 💡 Learning REST APIs Using Spring Boot & PostgreSQL

A simple and beginner-friendly project demonstrating how to build RESTful APIs using Spring Boot, JPA/Hibernate, and PostgreSQL.
This project includes basic CRUD operations for managing student data and is structured following best backend development practices. 🚀

---

## 📌 Features

✔️ Build REST APIs using Spring Boot
✔️ Connect Spring Boot with PostgreSQL
✔️ Perform CRUD operations
✔️ Use DTOs and Service Layer Architecture
✔️ JPA Repositories for database access
✔️ MapStruct for object mapping
✔️ Layered structure — Controller, Service, Repository, Entity

---

## 🏗️ Project Structure

```
LearningRESTAPIs
 │
 ├── controller
 │     └── StudentController.java
 ├── dto
 │     ├── StudentDTO.java
 │     └── AddStudentRequestDTO.java
 ├── entity
 │     └── Student.java
 ├── repository
 │     └── StudentRepository.java
 ├── service
 │     ├── StudentService.java
 │     └── impl/StudentServiceImpl.java
 ├── config
 │     └── MapperConfig.java
 ├── resources
 │     └── application.properties
 └── LearningRestapIsApplication.java
```

---

## 🗄️ Database Configuration (PostgreSQL)

Make sure PostgreSQL is installed and running locally.

Update your application.properties:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 🚀 API Endpoints
🔹 Get all students
```
GET /students
```

🔹 Get student by ID
```
GET /students/{id}
```

🔹 Add a student
```
POST /students
```

🔹 Update a student
```
PUT /students/{id}
```

🔹 Delete a student
```
DELETE /students/{id}
```

---

## ▶️ How to Run the Project

1️⃣ Clone the repository
```
git clone https://github.com/OmPimple26/Learning-Rest-APIs-Using-PostgreSQL.git
cd Learning-Rest-APIs-Using-PostgreSQL
```

2️⃣ Build the project
```
mvn clean install
```

3️⃣ Run the application
```
mvn spring-boot:run
```

Application will start at:
👉 http://localhost:8080

---

## 🧪 Testing API with Swagger / Postman

Use Postman or browser to test APIs.
If Swagger is enabled, access:
👉 http://localhost:8080/swagger-ui/index.html

---

## 🎯 Learning Outcomes

By building this project, you will learn:

> How Spring Boot handles dependency injection

> How to use Controller-Service-Repository pattern

> How to implement DTOs and object mapping

> How to connect Spring Boot to PostgreSQL

> How REST architecture works

---

## 📘 Tech Stack

```
| Technology          | Purpose          |
| ------------------- | ---------------- |
| **Spring Boot**     | REST API backend |
| **PostgreSQL**      | Database         |
| **JPA / Hibernate** | ORM tool         |
| **MapStruct**       | DTO mapping      |
| **Maven**           | Build tool       |
```

---

## 🤝 Contributing

Feel free to fork the repository and submit pull requests.
Suggestions and improvements are always welcome! 😊

---

## ⭐ Show Your Support

If you liked this project, give it a star ⭐ on GitHub!
