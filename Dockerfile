FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-20-jdk -y
COPY . .
RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:20-slim
COPY --from=build /target/*.jar ./beprepared.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "beprepared.jar"]

