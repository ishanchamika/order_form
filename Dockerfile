FROM openjdk:17.0.9-alpine
WORKDIR /opt
ENV PORT 8082
EXPOSE 8082
COPY target/*.jar /opt/app.jar
#ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /opt/app.jar
