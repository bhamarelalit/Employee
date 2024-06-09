    package com.employee.service;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import com.employee.dto.Employee;
    import org.springframework.stereotype.Service;

    @Service
    public class EmployeeService {

        private final ArrayList<Employee> employees = new ArrayList<>
                (List.of(new Employee("1", "Lalit Bhamare")));

        public List<Employee> findAll()
        {
                return employees;
        }
    }
