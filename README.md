# EmployeeInfo-Hibernate

EmployeeInfo-Hibernate is a simple Java project developed using Hibernate ORM and PostgreSQL database.  
The project is designed to manage employee records and perform CRUD operations efficiently.

---

## 🚀 Technologies Used

- Java
- Hibernate ORM
- PostgreSQL
- Maven
- JDBC

---

## 📌 Features

- Add Employee
- View Employee Details
- Update Employee Information
- Delete Employee Record
- Hibernate ORM Mapping
- Database Connectivity with PostgreSQL

---

## 📂 Project Structure

src/main/java  
├── entity  
├── dao  
├── service  
└── controller  

src/main/resources  
└── META-INF  
    └── persistence.xml

---

## ⚙️ Database Configuration

Configure the database in `persistence.xml`

```xml
<property name="javax.persistence.jdbc.driver"
          value="org.postgresql.Driver"/>

<property name="javax.persistence.jdbc.url"
          value="jdbc:postgresql://localhost:5432/postgres"/>

<property name="javax.persistence.jdbc.user"
          value="postgres"/>

<property name="javax.persistence.jdbc.password"
          value="root"/>
