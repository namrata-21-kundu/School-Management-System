# School Management System (Java)

## Overview

The School Management System is a console-based Java application designed to manage students, teachers, and academic records efficiently. This project demonstrates the practical implementation of Object-Oriented Programming (OOP) concepts, exception handling, and Java Collection Frameworks without using databases or external frameworks.

The system allows users to perform various school administration tasks such as adding students, managing teachers, recording marks, and generating report cards through a menu-driven interface.

---

## Features

### Student Management

* Add new students
* View all students
* Search students by roll number
* Update student details
* Remove students

### Teacher Management

* Add new teachers
* View all teachers
* Search teachers
* Remove teachers

### Academic Management

* Assign subjects
* Record student marks
* Calculate grades
* Generate report cards

### Exception Handling

* Duplicate student entries
* Invalid roll numbers
* Invalid marks input
* Student not found
* Teacher not found

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Exception Handling
* Java Collections Framework (ArrayList, HashMap)

---

## OOP Concepts Implemented

### Encapsulation

Private data members with public getters and setters.

### Inheritance

Student and Teacher classes inherit from the Person class.

### Polymorphism

Method overriding for displaying information.

### Abstraction

Abstract Person class defining common behavior.

### Exception Handling

Custom exceptions for application-specific errors.

---

## Project Structure

```text
src/
│
├── Person.java
├── Student.java
├── Teacher.java
├── School.java
├── StudentManager.java
├── TeacherManager.java
│
├── exceptions/
│   ├── StudentNotFoundException.java
│   ├── TeacherNotFoundException.java
│   └── InvalidMarksException.java
│
└── Main.java
```

---

## Sample Menu

```text
===== SCHOOL MANAGEMENT SYSTEM =====

1. Add Student
2. View Students
3. Search Student
4. Delete Student

5. Add Teacher
6. View Teachers
7. Search Teacher
8. Delete Teacher

9. Add Marks
10. Generate Report Card

0. Exit
```

---

## Learning Outcomes

Through this project, you will gain practical experience with:

* Class and object design
* Inheritance and polymorphism
* Abstract classes
* Custom exception creation
* Collection Framework usage
* Menu-driven application development
* Real-world object modeling

---

## Future Enhancements

* File handling for data persistence
* JDBC integration with MySQL
* Spring Boot REST APIs
* Authentication and authorization
* Graphical User Interface (GUI)
* Web-based dashboard

---

## Author

Developed as a Java OOP and Exception Handling project for learning and academic purposes.
