# 🎓 Student Result WebApp

A web-based application for managing student marks, storing results in a database, and analyzing performance using charts.  
Teachers can log in, enter student marks, generate grades, and view records in a structured dashboard.

---

## 🚀 Features

- 🔐 Teacher Login System  
- 🧾 Add Student Marks (Multiple Subjects)  
- 🗄 Stores Data in MySQL Database  
- 🧮 Auto Total, Average & Grade Calculation  
- 📂 View All Student Records in Table Format  
- 📊 Result Analytics (Pass / Fail Chart)  
- 🎨 Clean & Modern Web Interface (JSP + CSS)  
- 🧑‍🏫 Teacher Dashboard Navigation  

---

## 🏗️ Tech Stack

**Frontend**
- JSP (Java Server Pages)
- HTML / CSS
- Chart.js

**Backend**
- Java Servlets
- JDBC
- MySQL Database

**Server**
- Apache Tomcat

---

## 🗄️ Database Structure

Table Name: `students`

| Column | Type |
|------|------|
| id | INT (Primary Key, Auto Increment) |
| name | VARCHAR |
| m1 | INT |
| m2 | INT |
| m3 | INT |
| m4 | INT |
| total | INT |
| grade | VARCHAR |

---

## 🔑 Default Login

| Username | Password |
|--------|--------|
| teacher | 1234 |

*(Can be modified inside LoginServlet.java)*

---

## 📂 Project Structure

StudentResultWebApp/
├── WebContent/
│ ├── login.jsp
│ ├── dashboard.jsp
│ ├── index.jsp
│ ├── view.jsp
│ ├── result.jsp
│ ├── analytics.jsp
│ ├── logout.jsp
│ └── style.css
│
├── src/
│ ├── servlet/
│ │ ├── AddStudentServlet.java
│ │ ├── LoginServlet.java
│ │ └── PdfServlet.java (optional)
│ ├── model/
│ │ └── Student.java
│ └── db/
│ └── DBConnection.java
│
└── WEB-INF/web.xml


---

## ⚙️ Setup Instructions

1️⃣ Import project into **Eclipse**  
2️⃣ Add MySQL JDBC driver inside  
   `WebContent/WEB-INF/lib/`  
3️⃣ Create database & table in MySQL  
4️⃣ Update DB credentials in `DBConnection.java`  
5️⃣ Run project on **Apache Tomcat**

---

## 📊 Result Analytics

- Displays Pass/Fail summary using Chart.js  
- Graph updates automatically when new records are added

---

## 👥 Project Members

**Team Name:** Java Junction  

- Basil — frontend 
- Karthik P V — backend  

---

## 🏫 Course Project

Java OOPJ Mini Project — Student Result Processing System

---

