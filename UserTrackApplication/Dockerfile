FROM openjdk:11-jre-slim
WORKDIR usr/src
#ENV MONGO_URI=mongodb://localhost:27017/movie_db
ADD ./target/UserTrackApplication-0.0.1-SNAPSHOT.jar /usr/src/UserTrackApplication-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","UserTrackApplication-0.0.1-SNAPSHOT.jar"]