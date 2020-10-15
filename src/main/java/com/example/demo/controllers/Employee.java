package com.example.demo.controllers;

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

    public Employee(String name, String month, String salary) {
        this.name = name;
        this.month = month;
        this.salary = salary;
    }
}
