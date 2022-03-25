FROM openjdk:11
WORKDIR /
ADD target/my-project-1.0.0-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/my-project-1.0.0-SNAPSHOT.jar"]
