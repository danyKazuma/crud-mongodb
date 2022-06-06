FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} com-crud-mongodb.jar
ENTRYPOINT ["java","-jar","/com-crud-mongodb.jar"]
