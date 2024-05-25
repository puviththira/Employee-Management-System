# Employee Management System

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Project Setup](#project-setup)
  - [Backend Setup (Spring Boot)](#backend-setup-spring-boot)
  - [Frontend Setup (React JS)](#frontend-setup-react-js)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [License](#license)

## Introduction

This project is a CRUD (Create, Read, Update, Delete) application built with Spring Boot for the backend, React JS for the frontend, and MySQL for the database. The application allows users to manage employee records, including creating new employees, reading employee details, updating existing employee information, and deleting employees.

## Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- [Java 11 or higher](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Node.js and npm](https://nodejs.org/)
- [MySQL](https://www.mysql.com/)

## Project Setup

### Backend Setup (Spring Boot)

1. **Clone the repository:**

    ```bash
    git clone https://github.com/puviththira/employee-management-system.git
    cd employee-management-system/backend
    ```

2. **Configure MySQL Database:**

    Create a database named `employees_db`:

    ```sql
    CREATE DATABASE employees_db;
    ```

3. **Update `application.properties`:**

    Open `src/main/resources/application.properties` and update the MySQL configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/employees_db
    spring.datasource.username=root
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

4. **Build and run the Spring Boot application:**

    ```bash
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```

### Frontend Setup (React JS)

1. **Navigate to the frontend directory:**

    ```bash
    cd ../frontend
    ```

2. **Install dependencies:**

    ```bash
    npm install
    ```

3. **Start the React application:**

    ```bash
    npm start
    ```

## Running the Application

1. Ensure the MySQL server is running.
2. Start the Spring Boot backend application.
3. Start the React frontend application.

The React application will run on `http://localhost:3000` and the Spring Boot backend will run on `http://localhost:8080`.

## API Endpoints

Here are the main API endpoints for the backend service:

- **GET** `/api/v1/employees` - Retrieve all employees
- **GET** `/api/v1/employees/{id}` - Retrieve an employee by ID
- **POST** `/api/v1/employees` - Create a new employee
- **PUT** `/api/v1/employees/{id}` - Update an existing employee
- **DELETE** `/api/v1/employees/{id}` - Delete an employee

## Usage

1. **Create a new employee:**
   - Navigate to the "Add Employee" section in the React application.
   - Fill out the form and submit to create a new employee record.

2. **View employee details:**
   - Navigate to the "Employee List" section.
   - Click on an employee to view their details.

3. **Update an employee:**
   - From the "Employee List" section, click on an employee and then click the "Edit" button.
   - Update the employee information and submit.

4. **Delete an employee:**
   - From the "Employee List" section, click on an employee and then click the "Delete" button.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
