# Relationship Nexus Manager

## Overview
The Relationship Nexus Manager is a robust backend application designed to facilitate project
management, task assignment, and collaboration among team members. It offers user-friendly 
interfaces for admins to oversee projects and users to efficiently manage tasks within the 
system.

## Technologies Used
- Java Backend language
- Spring Boot Framework for building APIs
- MySQL Database management system
- Hibernate Object-relational mapping tool
- Postman API testing and development environment

## Features
- User Management Create, update, and delete user accounts.
- Admin Panel Tools for administrators to manage users and projects.

## Setup
1. Clone the repository `git clone repository-url`
2. Set up the database Configure MySQL and update `application.properties`.
3. Run the application `mvn spring-bootrun`

## Usage
The Smart Project Management System simplifies project and task management. Users can log in,
view assigned tasks, update statuses, and communicate within the platform. Admins can manage 
users, projects, and assign tasks.

## API Endpoints
- GET apiusers Retrieve all users.
- POST apiusers Create a new user.
- GET apiadmins Retrieve all admins.
- POST apiadmins Create a new admin.
- PUT apiusers{id} Update user details by ID.
- PUT apiadmins{id} Update admin details by ID.
