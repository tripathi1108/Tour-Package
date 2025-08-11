# Simple Tour Package API

A RESTful API built with Spring Boot and PostgreSQL to manage tour packages.

## Technology Stack
- Java Spring Boot
- PostgreSQL
- Maven

## API Endpoints

### 1. Create Tour Package
- **POST** `/api/tours`
- Creates a new tour package

### 2. Get All Tour Packages  
- **GET** `/api/tours`
- Returns all tour packages

### 3. Get Tour by ID
- **GET** `/api/tours/{id}`
- Returns specific tour package

## Sample Request (POST /api/tours)
```json
{
  "id": 1,
  "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
  "discountInPercentage": "17%",
  "title": "Himalayan Trek Adventure",
  "description": "14-day trek through the Himalayas",
  "duration": "14Days/13Nights",
  "actualPrice": "$1200",
  "discountedPrice": "$1000"
}
```

## Setup Instructions

1. Create PostgreSQL database
2. Update `application.properties` with your database credentials
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. API will be available at `http://localhost:8080/api/tours`

## Features
- Input validation for all fields
- Proper HTTP status codes
- Error handling for invalid requests
