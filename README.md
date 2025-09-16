# 🚀 SIH25008 Backend (Spring Boot + MongoDB + JWT)

This is the **backend service** for **SIH 2025 Problem Statement 25008**, built using:

- **Spring Boot 3.2 (Java 17)**
- **MongoDB Atlas (Cloud DB)**
- **JWT-based Authentication**
- **Swagger UI for API Documentation**
- **Secure Configuration using `application.properties`**

---

## ✅ Features
✔ User Registration & Login  
✔ JWT Token-based Authentication  
✔ Project Management (CRUD)  
✔ Submission Management  
✔ Role-based Access Control  
✔ Swagger API Docs  
✔ MongoDB Atlas Integration  
✔ CORS Config for React Frontend  

---

## ✅ Tech Stack
- **Backend**: Java 17, Spring Boot 3.2
- **Database**: MongoDB Atlas
- **Security**: Spring Security + JWT
- **Documentation**: Swagger (OpenAPI 3)
- **Build Tool**: Maven

---

🔥 Swagger UI Screenshots
Authorize with JWT

API Endpoints

<img width="1850" height="875" alt="image" src="https://github.com/user-attachments/assets/7964c25c-753d-48f9-998c-fc1d4c297240" />
<img width="1013" height="744" alt="image" src="https://github.com/user-attachments/assets/5c4aad33-c74b-4036-b08b-a170ac58377a" />
<img width="1151" height="839" alt="image" src="https://github.com/user-attachments/assets/7a7abdde-5de4-42c2-bd54-5022954a01a6" />

## ✅ Project Structure
src/main/java/com/project/sih25008
│
├── config
│ ├── SecurityConfig.java
│ ├── OpenApiConfig.java
│
├── controller
│ ├── AuthController.java
│ ├── ProjectController.java
│ ├── SubmissionController.java
│
├── dto
│ ├── AuthRequest.java
│ ├── AuthResponse.java
│ ├── CreateProjectDto.java
│
├── model
│ ├── User.java
│ ├── Project.java
│ ├── Submission.java
│
├── repository
│ ├── UserRepository.java
│ ├── ProjectRepository.java
│ ├── SubmissionRepository.java
│
├── security
│ ├── JwtUtils.java
│ ├── JwtAuthenticationFilter.java
│
└── service
├── AuthService.java
├── ProjectService.java
├── SubmissionService.java


---

## ✅ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/anupamchaubey/backend_SIH25008.git
cd backend_SIH25008


2. Configure application.properties

Update src/main/resources/application.properties:

spring.data.mongodb.uri=mongodb+srv://user1:1234@sih25008db.l64so5m.mongodb.net/sih25008db?retryWrites=true&w=majority&appName=sih25008db
jwt.secret=mySuperSecretKey1234567890ExtraSecureKey!
jwt.expiration-ms=86400000
frontend.url=http://localhost:3000
server.port=8080

3. Build & Run
mvn clean install
mvn spring-boot:run

```
````.


✅ API Documentation (Swagger)

Start the application and open:

http://localhost:8080/swagger-ui/index.html

✅ JWT Authentication Flow

Register → POST /api/auth/register

Login → POST /api/auth/login (get JWT token)

Authorize in Swagger → Click Authorize → Enter:

Bearer <your-token>


Access secured APIs like /api/projects/my

✅ Main APIs
Method	Endpoint	Description

POST	/api/auth/register	Register new user

POST	/api/auth/login	Login and get JWT token

POST	/api/projects	Create project

GET	/api/projects/my	Get logged-in user's projects

POST	/api/submissions	Submit project file

GET	/api/submissions/project/{id}	Get submissions for a project


✅ Dependencies

Spring Boot Starter Web

Spring Boot Starter Data MongoDB

Spring Boot Starter Security

io.jsonwebtoken (JWT)

Lombok

Springdoc OpenAPI (Swagger)



✅ Testing with cURL

Register:

curl -X POST http://localhost:8080/api/auth/register \
-H "Content-Type: application/json" \
-d '{"username":"testuser","password":"password123"}'


Login:

curl -X POST http://localhost:8080/api/auth/login \
-H "Content-Type: application/json" \
-d '{"username":"testuser","password":"password123"}'




✅ License

MIT License © 2025
