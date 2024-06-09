    package com.employee.controller;


    import com.employee.dto.Employee;
    import com.employee.service.EmployeeService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;
    import java.util.List;

    @RestController
    public class EmployeeController {

        @Autowired
        EmployeeService employeeService;


        @GetMapping()
        public List<Employee> getEmployees() {

            return employeeService.findAll();

        }



    }
