FROM java:8
EXPOSE 8080
ADD /target/CuisineSearch-0.0.1-SNAPSHOT.jar CuisineSearch-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "CuisineSearch-0.0.1-SNAPSHOT.jar"]