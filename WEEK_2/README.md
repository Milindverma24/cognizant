# Week 2 Assignment Sandbox

A comprehensive collection of hands-on exercises completed during **Week 2**, covering Maven projects, Spring Core IoC container wiring, Dependency Injection, JPA interfaces, Hibernate ORM, and database CRUD repository setups.

---

## 📂 Repository Index

This directory is structured into the following key assignment modules:

1. [Spring Core & Maven Projects](#1-spring-core--maven-projects)
2. [Spring Data JPA Framework Modules](#2-spring-data-jpa-framework-modules)
3. [Data Structures & Algorithms (Java Baselines)](#3-data-structures--algorithms)

---

## 1. Spring Core & Maven Projects
Covers standard Java build configuration setups and dependency injection controls using XML configurations.

### Sub-projects:
- **Creating and Configuring a Maven Project:** Basic setup of Maven configurations and entrypoint compilation.
  - 📄 Core Launcher: `Spring Core_Maven/Creating and Configuring a Maven Project/src/main/java/com/library/LibraryManagementApplication.java`
- **Implementing Dependency Injection:** Demonstrates setter dependency injection using Spring bean container XML registry.
  - 📄 Configurations: `Spring Core_Maven/Implementing Dependency Injection/src/main/resources/applicationContext.xml`
  - 📄 Service Beans: `BookService.java`, `BookRepository.java`
- **Configuring a Basic Spring Application:** Establishes application contexts and retrieves bean instances programmatically.
  - 📄 Core Main: `Spring Core_Maven/Configuring a Basic Spring Application/src/main/java/com/library/Main.java`

---

## 2. Spring Data JPA Framework Modules
Explores standard object-relational mapping, specifications vs implementations, and repository abstractions.

### Sub-projects:
- **Difference between JPA, Hibernate, and Spring Data JPA:** Detailed comparative guide outlining specs and implementations.
  - 📄 Comparison Document: `Spring-data-jpa-handson/Difference between JPA, Hibernate and Spring Data JPA/README.md`
- **Quick Example (CRUD Repository):** Spring Boot command line database service managing Country entity mapping and lifecycle events.
  - 📄 Entity Model: `Spring-data-jpa-handson/Quick_example/orm-learn/Quick Example/src/main/java/com/cognizant/model/Country.java`
  - 📄 Service API: `Spring-data-jpa-handson/Quick_example/orm-learn/Quick Example/src/main/java/com/cognizant/service/CountryService.java`

---

## 3. Data Structures & Algorithms
Basic array sorting, searching, and recursion structures practiced inside the module setup.

### Sub-projects:
- **DSA Practice Suite:** Standard implementation of searches (linear) and sorting (bubble, selection).
  - 📄 Sorts: `Spring-data-jpa-handson/orm-learn/DSA/src/sorting/bubbleSort.java`
  - 📄 Arrays: `EvenAndOddCount.java`, `LinearSearch.java`

---

## 🛠️ Global Prerequisites
- **JDK 17** or higher
- **Maven 3.x**
- **MySQL Server** (for relational database connection mappings)
