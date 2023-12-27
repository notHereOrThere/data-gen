FROM maven:3.8.5-openjdk-17 as build
COPY /src /src
COPY pom.xml /
RUN mvn -U /pom.xml clean package

FROM openjdk:17-jdk-slim
COPY --from=build /target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]