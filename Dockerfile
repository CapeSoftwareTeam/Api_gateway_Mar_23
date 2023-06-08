FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8088
ADD target/api-gateway.jar api-gateway.jar
ENTRYPOINT [ "java","-jar","/api-gateway.jar" ]