package com.example.demo.dto;

public class Employee {
    private final String name;
    private final String month;
    private final String salary;

    public String getName() {
        return name;
    }

    public String getMonth() {
        return month;
    }

    public String getSalary() {
        return salary;
    }

    public Employee(String salary) {
        String[] salaries = salary.split(";");
        this.name = salaries[0];
        this.month = salaries[1];
        this.salary = salaries[2];
    }
}
