package com.example.demo.controllers;

import com.example.demo.enteties.Salary;
import com.example.demo.repositories.SalaryRepository;
import com.example.demo.repozitories.EmployeeService;
import com.example.demo.service.SalaryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

//№ 2 find by name принимает параметром строку с именем и возвращает лист отфильтрованный по имени
//№ 3 find all возвращает полный лист, без входных параметров
// №1 - принт рекорд, вызывает find by name, find by name вызывает all
//
// создать класс employeeRepozitory в пакете repozitary
// сделать в этом классе метод findall такой же как в контроллере
//добавить в контроллер зависимость от employeeRepozitory
// использовать в контроллере метод findall из employeeRepozitory
@RestController // аннотация

public class DemoController2 {
    private final SalaryService salaryService;
    private final EmployeeService employeeService;

    public DemoController2(SalaryService salaryService, EmployeeService employeeService) {
        this.salaryService = salaryService;
        this.employeeService = employeeService;
    }

    @RequestMapping("/salary/{name}")
    public String printRecord(@PathVariable String name) throws IOException {
        List<Employee> employeeByName = employeeService.findByName(name);
        String result = "";
        for (int i = 0; i < employeeByName.size(); i++) {
            Employee employee = employeeByName.get(i);
            result = result + employee.getMonth() + ";" + employee.getSalary() + "<br/>";
        }
        if (result.equals("")) {
            result = "данных по имени " + name + " не найдено";
        }
        return result;
    }

    @RequestMapping("/allSalaries")
    public List<Salary> showAllSalaries() {
        return salaryService.findAll();
    }

}
