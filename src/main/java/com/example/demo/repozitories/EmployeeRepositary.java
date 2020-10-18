package com.example.demo.repozitories;

import com.example.demo.controllers.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepositary {
    public List<Employee> findAll() throws IOException;
}
