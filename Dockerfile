FROM eclipse-temurin:21-jre-alpine

EXPOSE 8889

ADD build/libs/authorizationservice-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]