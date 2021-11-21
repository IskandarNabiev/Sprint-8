FROM openjdk:8-jdk-alpine
ENV PROFILE = "prod"
WORKDIR /app
COPY . /app
ENTRYPOINT ["java", "-jar","/app.jar"]
EXPOSE 8080