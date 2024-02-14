#Dockerfile

FROM openjdk:17

COPY build/libs/*.jar docker-demo.jar

ENTRYPOINT ["java", "-jar", "docker-demo.jar"]