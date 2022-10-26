FROM amazoncorretto:latest
COPY target/cpo2-1.0-SNAPSHOT-shaded.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
