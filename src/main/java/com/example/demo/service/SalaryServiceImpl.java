package com.example.demo.service;

import com.example.demo.controllers.Employee;
import com.example.demo.enteties.Salary;
import com.example.demo.repositories.SalaryRepository;
import com.example.demo.repozitories.EmployeeRepositary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService{
    private final SalaryRepository salaryRepository;

    public SalaryServiceImpl(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    public List<Salary> findAll() {
        return salaryRepository.findAll();
    }
}
