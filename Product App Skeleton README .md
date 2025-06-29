# **Product App Skeleton – Full Stack (React \+ Spring Boot \+ PostgreSQL \+ Docker)**

This is a skeleton full-stack application that:

* **Displays a list of products**

* **Allows creation of a new product**

* Uses:

  * **React** frontend

  * **Spring Boot** backend

  * **PostgreSQL** (in Docker)

  * **Docker Compose** for DB setup

## **Prerequisites**

Ensure the following are installed on your machine:

* Docker & Docker Compose

* Java 17+

* Maven

* Node.js (v18+ recommended) & npm

## **Getting Started**

1) ### **Start the Database with Docker**

   1) Navigate to project root folder and enter the following command:

      `docker compose up -d`

   2) This starts PostgreSQL on port `5432`.  
        
      

2) ### **Backend Setup (Spring Boot)**

   1) The backend runs at: [http://localhost:8080](http://localhost:8080)  
   2) It exposes:  
      1) `GET api/v1/products/getAll`  
      2) `POST api/v1/products`  
   3) Data is stored in a PostgreSQL container.  
   4) Ensure `application.properties` has the correct DB credentials from `docker-compose.yml`.

3) ### **Frontend Setup (React)**

   1) At project root folder, enter the following commands:   
      `cd frontend`  
      `npm install`  
      `npm start`

## **How to Test**

1. Run all 3 services (Docker \+ Backend \+ Frontend)

2. Open browser at `http://localhost:3000`

3. Create a product and see it listed immediately

## **Features Implemented**

* View product list

* Create new product from Frontend

* Connect backend to PostgreSQL and persist in DB

* Proxy setup between React and Spring Boot

