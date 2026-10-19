# Student Management System

A RESTful Student and Course Management System built with Spring Boot and MySQL, supporting student and course records with enrollment management and request validation.

## Tech Stack

- Java 17
- Spring Boot (Spring Web, Spring Data JPA, Spring Validation)
- Hibernate / JPA
- MySQL
- Maven

## Features

- Full CRUD for students
- Course catalog with many-to-many enrollment relationship between students and courses
- Centralized exception handling with correct HTTP status codes (400, 404)
- Request validation (required fields, valid email format, minimum age)

## Data Model

**Student**
- id, name, email, age, courses (many-to-many)

**Course**
- id, title, instructor, students (many-to-many)

A join table (`student_course`) links students and courses, modeling a many-to-many enrollment relationship where a student can enroll in multiple courses and a course can have multiple students.

## API Endpoints

### Students
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/students | List all students |
| GET | /api/students/{id} | Get a single student |
| POST | /api/students | Add a new student |
| PUT | /api/students/{id} | Update a student |
| DELETE | /api/students/{id} | Remove a student |
| POST | /api/students/{studentId}/enroll/{courseId} | Enroll a student in a course |

### Courses
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/courses | List all courses |
| GET | /api/courses/{id} | Get a single course |
| POST | /api/courses | Add a new course |

## Setup

1. Create a MySQL database:
```sql
   CREATE DATABASE studentdb;
```
2. Configure `src/main/resources/application.properties` with your MySQL username/password.
3. Run the application:./mvnw spring-boot:run
4. The API will be available at `http://localhost:8080`.

## Example Requests

**Create a student**
POST /api/students
{
“name”: “John Doe”,
“email”: “john@example.com”,
“age”: 22
}

**Create a course**
POST /api/courses
{
“title”: “Data Structures”,
“instructor”: “Dr. Smith”
}


**Enroll a student in a course**

POST /api/students/1/enroll/1