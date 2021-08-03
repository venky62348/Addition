FROM maven:3.6.3-jdk-8

RUN mvn clean install -DreleaseVersion=1.0.0

ENTRYPOINT ["java", "-jar", "target/Addition-1.0.0.jar"]
CMD ["100","300"]
