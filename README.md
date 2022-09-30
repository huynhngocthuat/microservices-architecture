# Microservices Architecture
Build project using microservice

## Functions of each project
- demo_microservices: Server microservices (gateway)
- demo_service: Connect into server microservices (project demo_microservices), server can use API from demo_service
- demo_client: Demo communication between Services
- config_server: Create a common config server (application.properties) https://github.com/huynhngocthuat/spring-cloud-sample-config-repo
- config_client: Get data from config_server

## Run 
- demo_microservices -> demo_service, demo_client
- demo_microservices -> config_server -> config_client
