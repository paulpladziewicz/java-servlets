FROM tomcat:latest

COPY /target/java-servlets.war /usr/local/tomcat/webapps

EXPOSE 8080

CMD ["catalina.sh", "run"]
