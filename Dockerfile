FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8088
ADD target/api-gateway_new.jar api-gateway_new.jar
ENTRYPOINT [ "java","-jar","/api-gateway_new.jar" ]