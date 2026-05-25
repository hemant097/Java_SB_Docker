FROM maven:3.8.5-openjdk-17

WORKDIR /app

COPY ./target/service-product-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java","-jar","service-product-0.0.1-SNAPSHOT.jar"]