FROM openjdk:21
EXPOSE 8080
ADD target/dockerized-spring-boot-0.0.1-snapshot.jar dockerized-spring-boot-0.0.1-snapshot.jar
ENTRYPOINT ["java", "-jar", "/dockerized-spring-boot-0.0.1-snapshot.jar"]