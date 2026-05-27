FROM maven:3.8.5-openjdk-17

WORKDIR /app

#COPY ./target/service-product-0.0.1-SNAPSHOT.jar .
#
#EXPOSE 8080
#
#CMD ["java","-jar","service-product-0.0.1-SNAPSHOT.jar"]

#copying the .mvn folder,mvnw, and pom.xml to the directory, and then running maven command
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

#copying source code
COPY src ./src

CMD ["./mvnw","spring-boot:run"]