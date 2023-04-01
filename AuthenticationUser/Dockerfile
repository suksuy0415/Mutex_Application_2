FROM openjdk:11-jre-slim
WORKDIR usr/src
#EXPOSE 8085
#ENV MYSQL_USERNAME=user
#ENV MYSQL_PASSWORD=root
ADD ./target/AuthenticationUser-0.0.1-SNAPSHOT.jar /usr/src/AuthenticationUser-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","AuthenticationUser-0.0.1-SNAPSHOT.jar"]