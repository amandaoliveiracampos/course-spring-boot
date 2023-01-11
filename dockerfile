FROM maven:3.8.7-openjdk-18 AS build
COPY . /home/course/
RUN mvn -f /home/course/pom.xml clean install

FROM openjdk:17
EXPOSE 8080
COPY --from=build /home/course/target/*.jar blog.jar
ENTRYPOINT [ "java", "-jar", "/blog.jar" ]
