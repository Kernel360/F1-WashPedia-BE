FROM openjdk:17-jdk
CMD ["./gradlew", "clean", "build"]
ARG JAR_FILE=./build/libs/module-api-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} washpedia.jar
ENTRYPOINT ["java", "-jar", "washpedia.jar"]





