FROM eclipse-temurin:17
COPY target/allmight.jar allmight.jar
CMD ["java","-jar","allmight.jar"]
