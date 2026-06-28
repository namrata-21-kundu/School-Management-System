# 🎓 School Management System (Core Java)

A console-based School Management System built using Java to manage students, teachers, and academic records. The project demonstrates core Object-Oriented Programming (OOP) concepts, custom exception handling, and Java Collections through a menu-driven application.

---

## 🚀 Features

### 👨‍🎓 Student Management

* Add new students
* View all students
* Search students by roll number
* Update student details
* Remove students

### 👩‍🏫 Teacher Management

* Add new teachers
* View all teachers
* Search teachers
* Remove teachers

### 📚 Academic Management

* Assign subjects
* Record student marks
* Calculate grades
* Generate report cards

### ⚠️ Exception Handling

* Duplicate student entries
* Invalid roll numbers
* Invalid marks input
* Student not found
* Teacher not found

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Exception Handling
* Java Collections Framework

  * ArrayList
  * HashMap

---

## 🧩 OOP Concepts Implemented

### 🔒 Encapsulation

* Private data members
* Public getters and setters

### 🧬 Inheritance

* `Student` extends `Person`
* `Teacher` extends `Person`

### 🔄 Polymorphism

* Method overriding using `displayInfo()`

### 🎭 Abstraction

* Abstract `Person` class

### ⚡ Exception Handling

* Custom exceptions for application-specific errors

---

## 📂 Project Structure

```text
src/
│
├── Person.java
├── Student.java
├── Teacher.java
├── School.java
│
├── exceptions/
│   ├── StudentNotFoundException.java
│   ├── TeacherNotFoundException.java
│   └── InvalidMarksException.java
│
└── Main.java
```

---

## 🔄 System Flow

```text
Start
  │
  ▼
Main Menu
  │
  ├── Student Management
  │      ├── Add Student
  │      ├── Search Student
  │      ├── View Students
  │      └── Delete Student
  │
  ├── Teacher Management
  │      ├── Add Teacher
  │      ├── Search Teacher
  │      ├── View Teachers
  │      └── Delete Teacher
  │
  ├── Academic Management
  │      ├── Add Marks
  │      ├── Calculate Grade
  │      └── Generate Report Card
  │
  └── Exit
```

---

## 📊 Class Diagram

```text
              Person (Abstract)
                    │
       ┌────────────┴────────────┐
       │                         │
    Student                  Teacher

         School
            │
    ┌───────┴───────┐
    │               │
Students       Teachers
(ArrayList)   (ArrayList)
```

---

## 📚 Learning Outcomes

* Class and Object Design
* Inheritance & Polymorphism
* Abstract Classes
* Custom Exception Creation
* Collection Framework Usage
* Menu-Driven Application Development
* Real-World Object Modeling

---

## 🔮 Future Enhancements

* File Handling for Data Persistence
* JDBC + MySQL Integration
* Spring Boot REST APIs
* Authentication & Authorization
* GUI Development
* Web-Based Dashboard

---

## 👨‍💻 Author

Developed as a Java OOP and Exception Handling project for learning, academic practice, and portfolio building.
