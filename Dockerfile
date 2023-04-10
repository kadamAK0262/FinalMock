FROM openjdk:17
EXPOSE 8080 
COPY target/QC-Demo-0.0.1-SNAPSHOT.jar QC-Demo-0.0.1-SNAPSHOT.jar
CMD [ "java","-jar","QC-Demo-0.0.1-SNAPSHOT.jar" ]