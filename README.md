# Spring Boot Student Management API

This project is a simple backend REST API built using Spring Boot.  
It demonstrates basic backend concepts such as REST controllers, service layer architecture, JSON request handling, and API testing using Postman.

## Technologies Used

- Java
- Spring Boot
- Maven
- Postman
- Git & GitHub

## Project Architecture

Controller → Service → Data (in-memory list)

## API Endpoints

### Create Student

POST /students

Example Request

{
 "id": 1,
 "name": "Sai Krishna",
 "age": 19,
 "department": "CSE Cyber Security"
}

---

### Get All Students

GET /students

---

### Get Student by ID

GET /students/{id}

Example

GET /students/1

---

## Running the Project

1. Clone the repository
   git clone https://github.com/Sai-Krishna-131006/backend-demo

2. Open the project in IntelliJ

3. Run
   BackenddemoApplication.java

4. Test APIs using Postman

Server runs on:
http://localhost:8081
