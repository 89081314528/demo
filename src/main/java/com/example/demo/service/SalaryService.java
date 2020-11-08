package com.example.demo.service;

import com.example.demo.controllers.Person;
import com.example.demo.enteties.Salary;

import java.util.List;

public interface SalaryService {
    public List<Salary> findAll();
    public Salary findByNumber(String passportNumber);
    public List<Person> findAllPerson();
}
