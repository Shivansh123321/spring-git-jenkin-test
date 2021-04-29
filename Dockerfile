FROM openjdk:11
EXPOSE 8080
ADD target/spring-git-jenkin-test-0.0.1-SNAPSHOT.jar spring-git-jenkin-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-git-jenkin-test-0.0.1-SNAPSHOT.jar"]