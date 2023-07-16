FROM openjdk:19
EXPOSE 8080
ADD target/To-Do.jar To-Do.jar
ENTRYPOINT ["java", "-jar", "/To-Do.jar"]