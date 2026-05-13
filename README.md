# Smart Hospital Management System

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

## Overview

The Smart Hospital Management System is a backend application developed using Java and Hibernate ORM with MySQL as the database. The system simulates core hospital operations and demonstrates enterprise-level object-relational mapping concepts.

The project is designed to reflect real-world backend architecture and is intended for portfolio presentation, internship applications, and technical interview preparation.

## Core Features

- Management of doctors, patients, and administrators  
- Department-based organization of medical staff  
- Appointment handling between doctors and patients  
- Medical record management for patients  
- Extensible billing structure for future enhancement  

## Hibernate Concepts Implemented

### Inheritance Mapping
A single-table inheritance strategy is used where `Person` serves as the base entity for `Doctor`, `Patient`, and `Admin`.

### One-to-One Relationship
Each patient is associated with exactly one medical record.

### One-to-Many Relationship
A department can contain multiple doctors, while each doctor belongs to a single department.

### Many-to-Many Relationship
Doctors and specializations are mapped in a many-to-many relationship using a join table.

### CRUD Operations
A generic DAO layer is implemented to handle create, read, update, and delete operations using Hibernate Session management.

### HQL Queries
The system uses Hibernate Query Language for database operations instead of native SQL.

Examples:
FROM Doctor  
FROM Doctor d WHERE d.salary > :salary  
SELECT COUNT(d) FROM Doctor d  

## Architecture

The project follows a layered structure:

src/main/java/com.abdullah.smarthospital  
- entity layer  
- dao layer  
- utility layer  
- application entry point  

## Database Design

Database Name: hospital_db  

Main tables include:
person, medical_record, department, specialization, doctor_specialization, appointment

## Technology Stack

- Java 17  
- Hibernate ORM 6+  
- MySQL  
- Maven  
- JPA Annotations  
- JDBC  

## Learning Outcomes

This project demonstrates practical understanding of ORM principles, relational database design, Hibernate inheritance strategies, entity relationships, transaction management, and HQL-based querying. It also reflects backend system design principles used in enterprise applications.

## Project Status

The project currently includes full implementation of core Hibernate concepts, CRUD operations, and relational mappings. It is structured to support future migration to Spring Boot and RESTful APIs.

## Future Enhancements

- Migration to Spring Boot REST API architecture  
- Integration of Swagger for API documentation  
- Implementation of Spring Security for authentication and authorization  
- Containerization using Docker  
- Frontend integration for full-stack version  

## Author

Abdullah Shams  
Backend Developer (Java, Hibernate, Spring Boot)

## License

This project is intended for educational and portfolio purposes.
