# ProductManagerjava

## Overview
This project is a **Product Management Application** built using Java. It provides functionalities to manage product information, including various attributes such as price, model, and category. The application supports operations like adding, updating, deleting, and retrieving product details, and it uses a relational database for data persistence.

## Features
- **Product Management**
  - Add, update, delete, and retrieve product information.
  - Manage product attributes such as name, description, model, price, and category.
  - Search for products based on criteria like name, category, price range, and model.

- **Entities**
  - **Product**: Represents a product with attributes such as name, description, model, price, and category.
  - **Price**: Manages product pricing, including the base price and any discounts.
  - **Model**: Represents different models of products.
  - **Category**: Organizes products into categories for better management.

- **User Interface**
  - Command-line interface (CLI) for interacting with the application.
  - Menu-driven options for easy navigation.

- **Data Persistence**
  - Data stored in a relational database (e.g., MySQL/PostgreSQL).
  - CRUD operations implemented using JDBC.

- **Modular Design**
  - Layered architecture: model, service, DAO (Data Access Object).
  - Flexible design for easy enhancement and maintenance.

- **Exception Handling**
  - Comprehensive exception handling to ensure application robustness.
  - User-friendly error messages.

- **Testing**
  - **Unit Testing**: Using JUnit for testing individual components.
  - **Integration Testing**: Ensuring proper interaction between components.
