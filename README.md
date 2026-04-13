GREENING INDIA 

Features
- Create Tree (POST /trees)
- Get All Trees (GET /trees)
- Get Tree by ID (GET /trees/{id})
- Update Tree (PUT /trees/{id})
- Delete Tree (DELETE /trees/{id})

Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

How to run
1. Clone the repository
2. Open in VS Code / IntelliJ
3. Run BackendApplication.java
4. Server runs on: http://localhost:8082

API Testing
Use Postman:

Create Tree
POST /trees
 {
 "location": "chennai",
 "plantedBy": "Preethi",
 "carbonSaved": 25.5
 }

Get All Trees
 GET /trees
Get Tree by ID
 GET /trees/{id}
Update Tree
 PUT /trees/{id}
Delete Tree
 DELETE /trees/{id}
