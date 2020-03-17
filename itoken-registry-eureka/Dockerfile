FROM openjdk:8-jre

RUN mkdir /app
COPY /target/itoken-registry-eureka-1.0-SNAPSHOT.jar /app/
CMD java -jar /app/itoken-registry-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=pro
EXPOSE 7001
