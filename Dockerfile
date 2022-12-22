FROM maven:3.8.3-openjdk-11-slim AS build

WORKDIR /app

COPY . /app

RUN mvn package

FROM tomcat:9.0.54-jre11-openjdk-slim

COPY --from=build /app/docker /usr/local/tomcat/conf

COPY --from=build /app/target/sweater.war /usr/local/tomcat/webapps

EXPOSE 8080

EXPOSE 8443

CMD ["catalina.sh", "run"]
