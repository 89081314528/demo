package com.example.demo.controllers;

import com.example.demo.repozitories.EmployeeService;
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
@RestController

public class DemoController2 {

    private final EmployeeService employeeResources;

    public DemoController2() {
        this.employeeResources = new EmployeeService();
    }

//    public List<Employee> findAll() throws IOException {
//        BufferedReader writer = new BufferedReader(new FileReader("salary.csv"));
//        String line = writer.readLine();
//        List<Employee> employees = new ArrayList<>();
//        for (; line != null; line = writer.readLine()) {
//            employees.add(new Employee(line));
//        }
//        return employees;
//    }

//    public List<Employee> findByName(String name) throws IOException {
//        List<Employee> employeeAll = employeeRepositary.findAll();
//        List<Employee> employeeByName = new ArrayList<>();
//        for (int i = 0; i < employeeAll.size(); i++) {
//            Employee employee = employeeAll.get(i);
//            if (employee.getName().equals(name)) {
//                employeeByName.add(employee);
//            }
//        }
//        return employeeByName;
//    }

    @RequestMapping("/salary/{name}")
    public String printRecord(@PathVariable String name) throws IOException {
        List<Employee> employeeByName = employeeResources.findByName(name);
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
}
