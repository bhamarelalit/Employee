package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

    // Spring Boot application for Jenkins Docker and Kubernates Build
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

}
