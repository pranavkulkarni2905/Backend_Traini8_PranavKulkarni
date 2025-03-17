# 📌 Traini8 MVP - Training Center Registry
### 🚀 Overview
This is a Spring Boot application that provides APIs for managing government-funded training centers. The app stores data in MongoDB Atlas and provides two APIs:

- POST API - To create and store a training center.
- GET API - To retrieve all stored training centers.
### 📂 Project Structure
```
training-center/
│── src/main/java/com/traini8/trainingcenter/
│   ├── model/
│   │   ├── TrainingCenter.java
│   │   ├── Address.java
│   ├── repository/
│   │   ├── TrainingCenterRepository.java
│   ├── service/
│   │   ├── TrainingCenterService.java
│   ├── controller/
│   │   ├── TrainingCenterController.java
│   ├── exception/
│   │   ├── GlobalExceptionHandler.java
│   ├── TrainingCenterApplication.java
│── src/main/resources/
│   ├── application.properties
│── pom.xml
│── README.md
```
### 🔧 Tech Stack
- Backend: Spring Boot 3.4.3
- Database: MongoDB Atlas
- Validation: Hibernate Validator
- Build Tool: Maven
- Testing: Postman
### ⚙️ Setup & Installation
1️⃣ Clone the Repository
```
git clone https://github.com/pranavkulkarni2905/Backend_Traini8_PranavKulkarni.git
cd traini8-mvp
```
2️⃣ Configure MongoDB Atlas

- Create a free MongoDB cluster on MongoDB Atlas.
- Go to Database Access → Add a user with Read & Write permissions.
- Go to Network Access → Allow IP 0.0.0.0/0.
- Copy the connection string.
3️⃣ Update application.properties

- Edit src/main/resources/application.properties:

```
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.mongodb.net/training_center?retryWrites=true&w=majority

server.port=8080
spring.application.name=training-center
Replace:

<username> → Your MongoDB username.
<password> → Your MongoDB password (encode special characters if needed).
training_center → Your database name.
```
4️⃣ Build & Run

- Run the application using Maven:

```
mvn spring-boot:run
or use IntelliJ Run Configuration.
```

### 📌 API Endpoints
1️⃣ Create Training Center (POST)
Endpoint:

```
POST http://localhost:8080/api/training-centers
```

Request Body (Valid Example):

```
{
  "centerName": "Tech Skills Academy",
  "centerCode": "TSA123456789",
  "address": {
    "detailedAddress": "123 Street, Near Park",
    "city": "New York",
    "state": "NY",
    "pincode": "10001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python", "Machine Learning"],
  "contactEmail": "info@techskills.com",
  "contactPhone": "9876543210"
}
```
Response:

```
{
  "id": "65f23a41e4b0df45f674dc9a",
  "centerName": "Tech Skills Academy",
  "centerCode": "TSA123456789",
  "address": {
    "detailedAddress": "123 Street, Near Park",
    "city": "New York",
    "state": "NY",
    "pincode": "10001"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Python", "Machine Learning"],
  "createdOn": 1710658456,
  "contactEmail": "info@techskills.com",
  "contactPhone": "9876543210"
}
```
2️⃣ Get All Training Centers (GET)
Endpoint:
```
GET http://localhost:8080/api/training-centers
```
Response Example:


```
[
  {
    "id": "65f23a41e4b0df45f674dc9a",
    "centerName": "Tech Skills Academy",
    "centerCode": "TSA123456789",
    "address": {
      "detailedAddress": "123 Street, Near Park",
      "city": "New York",
      "state": "NY",
      "pincode": "10001"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Java", "Python", "Machine Learning"],
    "createdOn": 1710658456,
    "contactEmail": "info@techskills.com",
    "contactPhone": "9876543210"
  }
]
```
### Snapshots
✅ Valid Request (Success Case)

![image](https://github.com/user-attachments/assets/e1f9101d-77d6-4ab9-9d1b-1c5f8fb5a83f)

❌ Invalid Cases (Validation Failures)
1️⃣ Missing Mandatory Fields

![image](https://github.com/user-attachments/assets/d2f087ab-8c0b-4a96-a2b4-ee77c556a74a)

2️⃣ Center Name Too Long (>40 characters)
![image](https://github.com/user-attachments/assets/97ee1ece-312a-485d-843d-b2dc8a9e8f71)

3️⃣ Center Code Not Exactly 12 Characters

![image](https://github.com/user-attachments/assets/70ae13e2-f203-4a91-a0ab-815e2de5391a)

4️⃣ Invalid Email Format

![image](https://github.com/user-attachments/assets/8c61a1fd-caad-49a4-ba42-6bef185b65d9)

5️⃣ Invalid Phone Number (Not Exactly 10 Digits)

![image](https://github.com/user-attachments/assets/ceee12b9-639b-4308-96bd-e82791a3ea51)

🔹 2. GET API - Retrieve All Training Centers
![image](https://github.com/user-attachments/assets/292ca77c-b19f-45f2-9ac3-9b742a3a9042)








