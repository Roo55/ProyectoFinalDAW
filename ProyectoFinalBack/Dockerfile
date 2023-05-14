FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /app
COPY target/gimnasio-0.0.1-SNAPSHOT.jar /app/gimnasio.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/gimnasio.jar"]
