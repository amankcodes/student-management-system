🎓 Student Management System — Spring Boot Project
📘 Overview

The Student Management System is a web-based application built using Java Spring Boot and Thymeleaf that allows administrators to manage student records easily.
It supports student creation, listing, updating, and deletion with a simple and responsive UI.

🚀 Tech Stack
Layer	Technologies Used
Frontend	HTML, CSS, Bootstrap 5, Thymeleaf
Backend	Java 17, Spring Boot 3.5.7
Database	H2 (in-memory)
Security	Spring Security (Admin login authentication)
Build Tool	Maven
⚙️ Features

✅ Admin login & logout system
✅ Add new students
✅ View all students
✅ Update or delete student records
✅ In-memory database (auto resets each run)
✅ Responsive dark-themed interface
✅ “Developed by Aman Kumar © 2025” footer

student-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/student_management/
│   │   │       ├── controller/
│   │   │       │   ├── StudentViewController.java
│   │   │       │   ├── AdminController.java
│   │   │       ├── model/
│   │   │       │   ├── Student.java
│   │   │       │   ├── Admin.java
│   │   │       ├── repository/
│   │   │       │   ├── StudentRepository.java
│   │   │       │   ├── AdminRepository.java
│   │   │       ├── service/
│   │   │       │   ├── StudentService.java
│   │   │       │   ├── AdminService.java
│   │   │       └── StudentManagementApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── (images, css, js if any)
│   │       ├── templates/
│   │       │   ├── login.html
│   │       │   ├── students.html
│   │       └── application.properties
├── pom.xml
├── README.md
└── .gitignore



🧠 How to Run

1️⃣ Clone the repository

git clone https://github.com/amankcodes/student-management-system.git


2️⃣ Open in IntelliJ IDEA or VS Code

3️⃣ Run the project using:

mvn spring-boot:run


4️⃣ Open browser and visit
👉 http://localhost:8080/admin/login

🔑 Default Admin Credentials
Username: admin
Password: admin123

✨ Future Enhancements

Student search & filter by course

Export data as Excel or PDF

Role-based access (Admin / Teacher)

Database migration to MySQL

👨‍💻 Developed by

Aman Kumar
📍 B.Tech CSE (2026 Batch)
© 2025 All Rights Reserved

📦 GitHub Repo: https://github.com/amankcodes/student-management-system
