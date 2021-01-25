package com.example.demo.repozitories;

import com.example.demo.dto.Employee;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//изменить на сервис
@Repository

public class EmployeeRepositaryImpl implements EmployeeRepositary {
    public List<Employee> findAll() throws IOException {
        BufferedReader writer = new BufferedReader(new FileReader("salary.csv"));
        String line = writer.readLine();
        List<Employee> employees = new ArrayList<>();
        for (; line != null; line = writer.readLine()) {
            employees.add(new Employee(line));
        }
        return employees;
    }
}
