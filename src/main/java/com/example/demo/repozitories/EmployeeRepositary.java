package com.example.demo.repozitories;

import com.example.demo.dto.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepositary {
    public List<Employee> findAll() throws IOException;
}
