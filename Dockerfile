FROM openjdk:17
EXPOSE 9090
ADD target/EmployeeApp.jar EmployeeApp.jar
ENTRYPOINT ["java","-jar","/EmployeeApp.jar"]