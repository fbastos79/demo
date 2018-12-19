FROM openjdk:8-jdk-alpine
VOLUME /tmp

ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]