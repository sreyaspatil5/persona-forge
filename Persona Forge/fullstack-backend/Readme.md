# User Management System

## Overview
This project Persona Forge is implemented in Java using Spring Boot. It allows for the creation,
retrieval, updating, and deletion of user data through exposed RESTful API endpoints.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- H2 Database (embedded)

## Project Structure
- **`FullstackApplication.java`**: Main entry point for the application.
- **`UserController.java`**: Handles HTTP requests for user-related operations (Create, Read, Update, Delete).
- **`UserNotFoundException.java`**: Custom exception class for handling user not found scenarios.
- **`UserRepository.java`**: Interface extending JpaRepository for user entity operations.
- **`User.java`**: Entity class defining the structure of a User.

## Setup
1. Clone the repository.
2. Ensure you have Java and a compatible IDE installed.
3. Set up the database configurations in `application.properties`.
4. Run the `FullstackApplication.java` file to start the application.

## Usage
1. Access the API using appropriate HTTP requests to interact with user data.
2. Use endpoints like `/users`, `/user/{id}`, `/user` (POST), `/user/{id}` (PUT), and `/user/{id}` (DELETE) to
   perform CRUD operations on user data.

## API Endpoints
- **GET /users**: Retrieve all users.
- **GET /user/{id}**: Retrieve a specific user by ID.
- **POST /user**: Create a new user.
- **PUT /user/{id}**: Update an existing user by ID.
- **DELETE /user/{id}**: Delete a user by ID.

## Additional Files
- **`application.properties`**: Contains database configurations.
- **Exception Handling**:
  - `UserNotFoundException.java`: Custom exception class.
  - `UserNotFoundAdvice.java`: Handles UserNotFoundException and returns appropriate HTTP responses.

