package com.example.demo.service;

import com.example.demo.dto.Person;
import com.example.demo.dto.SalaryDto;
import com.example.demo.enteties.Salary;
import com.example.demo.repositories.SalaryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalaryServiceImpl implements SalaryService {
    private final SalaryRepository salaryRepository;

    public SalaryServiceImpl(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }
@Override
    public List<Person> findAllPerson() {
        List<Person> personList = new ArrayList<>();
        List<Salary> salaryList = salaryRepository.findAll();
        for (int i = 0; i < salaryList.size(); i++) {
            Salary salary = salaryList.get(i);
            personList.add(new Person(salary.getName(), salary.getSurname(),
                    salary.getPassportNumber()));

        }
        return personList;
    }

    public SalaryDto findByNumber(String passportNumber) {
        Salary salaryByNumber = salaryRepository.findById(passportNumber).orElse(null);
        SalaryDto salaryByNumberDto;
        if (salaryByNumber == null) {
            salaryByNumberDto = new SalaryDto(null,null,null, "не найден человек с таким номером паспорта"); //???????
        } else {
            salaryByNumberDto = new SalaryDto(salaryByNumber.getName(),salaryByNumber.getSurname(),
                    salaryByNumber.getAmount(), salaryByNumber.getPassportNumber());

        }
        return salaryByNumberDto;
    }

}
