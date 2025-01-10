FROM tomcat:latest

COPY /target/java-servlets

EXPOSE 8080

CMD ["catalina.sh", "run"]
