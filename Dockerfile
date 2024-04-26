FROM adoptopenjdk:11-jre-hotspot
COPY target/testme-0.0.1-SNAPSHOT.jar testme.jar
EXPOSE 8080
CMD ["java", "-jar", "testme.jar"]
