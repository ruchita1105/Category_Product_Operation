# Category_Product_Operation
A simple Spring Boot application to manage Categories and Products with a one-to-many relationship using REST APIs
# Task Overview
CRUD operations for categories and products
One-to-many relationship between categories and products
# Technologies Used
Spring Boot: Backend framework
Spring Data JPA: For database interaction
MySQL: Relational database
Hibernate: ORM tool
Postman: API testing
# Prerequisites
Java 17 or higher
Maven
MySQL database server
# API Endpoints
# Categories
GET /api/categories : Retrieve all categories
POST /api/categories: Create a new category
GET /api/categories/{id}: Retrieve a category by ID
PUT /api/categories/{id}: Update a category by ID
DELETE /api/categories/{id}: Delete a category by ID
# Products
GET /api/products?page={page}: Get all products
POST /api/products: Create a new product
GET /api/products/{id}: Get a product by ID 
PUT /api/products/{id}: Update a product by ID
DELETE /api/products/{id}: Delete a product by ID
# Testing the APIs
Use Postman or any API testing tool:
Base URL: http://localhost:8086

