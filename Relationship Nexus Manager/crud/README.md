# Relationship Nexus Manager

## Overview
The Relationship Nexus Manager is an application that focuses on managing 
users, admins, and their associations. It facilitates the creation, update, 
and deletion of user and admin accounts while establishing relationships 
between them for streamlined management.

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
The Relationship Nexus Manager simplifies the management of users and admins 
while establishing and managing relationships between them. Users can be 
associated with specific admins for better organization and administration.

## API Endpoints
- GET apiusers Retrieve all users.
- POST apiusers Create a new user.
- GET apiadmins Retrieve all admins.
- POST apiadmins Create a new admin.
- PUT apiusers{id} Update user details by ID.
- PUT apiadmins{id} Update admin details by ID.
