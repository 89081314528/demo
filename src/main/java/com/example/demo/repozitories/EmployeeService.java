package com.example.demo.repozitories;

import com.example.demo.controllers.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeService {
    public List<Employee> findByName(String name) throws IOException;
}
