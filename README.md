# OTP Authentication System

A secure OTP (One-Time Password) Authentication System built using Spring Boot, Spring Data JPA, MySQL, Thymeleaf, and Gmail SMTP. Users can register, log in with their username and password, receive a 6-digit OTP via email, and access the dashboard after successful OTP verification.

## Features

- User Registration
- User Login
- 6-Digit OTP Generation
- OTP Sent to Registered Email
- OTP Verification
- Dashboard Access After Successful Verification
- MySQL Database Integration
- Spring Boot MVC Architecture
- Thymeleaf Frontend

## Technologies Used

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- MySQL
- Thymeleaf
- Gmail SMTP
- Maven

## Project Structure

```
OTPAuthentication
│
├── src
│   ├── main
│   │   ├── java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   └── application.properties
│   │   └── ...
│   └── test
│
├── pom.xml
└── README.md
```

## How to Run

1. Clone the repository

```bash
git clone https://github.com/adarshsankeshwar/OTPAuthentication.git
```

2. Open the project in Eclipse or IntelliJ IDEA.

3. Create a MySQL database.

```sql
CREATE DATABASE kodhiber;
```

4. Update `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/kodhiber
spring.datasource.username=root
spring.datasource.password=886721

spring.mail.username=akashsankeshwarom@gmail.c
spring.mail.password=bbeahxrzfvwhqczm
```

5. Run the Spring Boot application.

6. Open your browser.

```
http://localhost:9090/
```

## Project Workflow

1. User Registration
2. User Login
3. OTP Generation
4. OTP Sent via Email
5. OTP Verification
6. Dashboard Access

## Screenshots

You can add screenshots here.

## Future Enhancements

- OTP Expiration
- Password Encryption (BCrypt)
- Forgot Password
- JWT Authentication
- Spring Security
- User Roles
- Login History

## Author

Your Name

## GitHub Repository

https://github.com/adarshsankeshwar/OTPAuthentication
