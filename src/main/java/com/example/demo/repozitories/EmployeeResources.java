package com.example.demo.repozitories;

import com.example.demo.controllers.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeResources {
    private final EmployeeRepositary employeeRepositary;

    public EmployeeResources() {
        this.employeeRepositary = new EmployeeRepositary();
    }
    public List<Employee> findByName(String name) throws IOException {
        List<Employee> employeeAll = employeeRepositary.findAll();
        List<Employee> employeeByName = new ArrayList<>();
        for (int i = 0; i < employeeAll.size(); i++) {
            Employee employee = employeeAll.get(i);
            if (employee.getName().equals(name)) {
                employeeByName.add(employee);
            }
        }
        return employeeByName;
    }
}
