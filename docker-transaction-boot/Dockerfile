FROM openjdk:8
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} docker.jar
ENTRYPOINT ["java","-jar","docker.jar"]