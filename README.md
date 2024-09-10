# (10/09/2024 Update) e-learning
https://github.com/Tsonewa/e-learning

E-learning microservice architecture application build with String and Angular, Kafka, Eureka, Zuul Gateway, NGINX. Use relational, hash and nonrelational for data managing - PostgreSQL, Redis, MongoDB.

# 10/09/2024 Update --- >Khả năng quan sát các dịch vụ vi mô

Khả năng quan sát là gì và tại sao nó lại liên quan đến các dịch vụ vi mô
Tổng hợp số liệu với Micrometer , Prometheus và Grafana
Phân phối theo dõi với Micrometer và Zipkin
Tổng hợp nhật ký với ELK Stack

https://github.com/nbicocchi/learn-microservices


# Learning management system

University's Learning managment system web application built with Spring and Angular.

There are four groups of users: guests, students, teachers, administrators.

Guests may view the home page and basic information about the University.

Students can track their subjects and previous studies, teachers manage subject and exam realizations, while administrators manage the entire University.

## System architecture

The system is using the client-server and layered architecture.

The backend is implemented with microservices architecture and database per service pattern. 

Authentication and authorization are realized with JWT, including access and refresh tokens.

![system-architecture](https://user-images.githubusercontent.com/66832914/184617342-b7a26ee3-f7be-4aba-914c-4a2a8dfc3749.jpg)

## Technologies used

- Spring Boot
- Spring Cloud
- MySQL
- Angular
- Angular Material
- TailwindCSS
- Docker
