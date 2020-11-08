package com.example.demo.service;

import com.example.demo.controllers.Employee;
import com.example.demo.controllers.Person;
import com.example.demo.enteties.Salary;
import com.example.demo.repositories.SalaryRepository;
import com.example.demo.repozitories.EmployeeRepositary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    private final SalaryRepository salaryRepository;

    public SalaryServiceImpl(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }


    public List<Salary> findAll() {
        return salaryRepository.findAll();
    }

    public List<Person> findAllPerson() {
        List<Person> personList = new ArrayList<>();
        List<Salary> salaryList = salaryRepository.findAll();
        for (int i = 0; i < salaryList.size(); i++) {
            personList.add(new Person(salaryList.get(i).getName(),salaryList.get(i).getSurname(), salaryList.get(i).getAmount(),
                    salaryList.get(i).getPassportNumber()));

        }
        return personList;
    }

    public Salary findByNumber(String passportNumber) {
        Salary salaryByNumber = salaryRepository.findById(passportNumber).orElse(null);
        if (salaryByNumber == null) {
            salaryByNumber = new Salary();
            salaryByNumber.setPassportNumber("не найден человек с таким номером паспорта");
        }
        return salaryByNumber;
    }

}
