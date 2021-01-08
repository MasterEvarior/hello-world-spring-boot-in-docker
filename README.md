# Hello World, Docker and Spring Boot!
Just a small "Hello World" repository for dockerizing a Spring Boot application.
## Usage
Simple hello  
`http://<host>:<port>/hello`  
User specified hello  
`http://<host>:<port>/hello/MisterCool`

## Deployment
Build jar  
`mvn package`  
Build docker container  
`docker build -t springio/hello-world-spring-boot-in-docker .`  
Run container  
`docker run -p 8080:8080 springio/hello-world-spring-boot-in-docker`
