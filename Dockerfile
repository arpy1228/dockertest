FROM eclipse-temurin:21.0.8_9-jre-ubi9-minimal
LABEL authors="jang"

WORKDIR /app

COPY target/docker-0.0.1-SNAPSHOT.jar dockertest.jar

CMD ["java", "-jar", "dockertest.jar"]