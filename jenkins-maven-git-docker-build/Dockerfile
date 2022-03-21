FROM java:8

ARG JAR_FILE=jenkins-maven-git-docker-build/target/teacher-service.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]