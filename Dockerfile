FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} env-config.jar

ENTRYPOINT ["java", "-jar", "/env-config.jar"]

EXPOSE 8080