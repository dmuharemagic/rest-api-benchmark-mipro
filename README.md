# RESTful API benchmark tests

This repository features a set of small **RESTful APIs** featuring basic **CRUD operations** in several modern frameworks, including **_Spring Boot_** (_release 2.2.4_), **_Quarkus_** (_version 1.1.1_), and **_Micronaut_** (_version 1.2.10_) to analyze how well they perform in different environments and JDKs, as well as how do they compare with their GraalVM Native Image counterparts.

The applications are a part of a scientific research paper written by _Dino Muharemagić_, _Matija Šipek_, _Branko Mihaljević_ and _Aleksander Radovan_ on the topic "**Enhancing Performance of Cloud-based Software Applications with GraalVM and Quarkus**".

## Description

Each of the implementations operate with a **MySQL database** through the **Hibernate framework** on a table called _products_.

The _products_ table data was randomly generated and consists of approximately _250 rows_.

The applications have a set of **3 endpoints** exposed:

1.  **GET** mapping to `/products`, which retrieves a collection of products,
2.  **GET** mapping to `/products/{id}`, which retrieves a specific product determined by a unique identifier
3.  **POST** mapping to `/product` which creates a new product.

## Usage

To use these applications, you firstly need to import the **schema.sql** in your _DBMS_ with your favorite tool.

For each of the implementations, you need to change the **application.properties** file located in _src/main/resources_, and change the _username_ and _password_ properties, in order to successfully connect to your database.

> **NOTE:** All the projects have been generated as IntelliJ IDEA projects.

## License

This code is published under the **MIT License**.
