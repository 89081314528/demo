package com.example.demo.service;

import com.example.demo.dto.Person;
import com.example.demo.dto.SalaryDto;

import java.util.List;

public interface SalaryService {
    public SalaryDto findByNumber(String passportNumber);
    public List<Person> findAllPerson();
}
