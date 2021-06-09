FROM maven:3.6.3-jdk-8

RUN apt-get install git -y

RUN git clone -b CMD-vs-ENTRYPOINT https://github.com/CalculatorApps/Addition.git

WORKDIR Addition

RUN mvn clean install -DreleaseVersion=1.0.0

ENTRYPOINT ["java", "-jar", "target/Addition-1.0.0.jar"]
CMD ["100","300"]
