package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController

public class DemoController {
    public DemoController() throws FileNotFoundException {
    }

    @RequestMapping("/")
    public String welcomePage() {
        return "Welcome";
    }
    // <br/> чтобы сделать на разных строках
    // String f = "a" + "<br/>" + "100";

    // метод рид должен возвращать лист из всех объектов из csv
    //метод написать отдельно и вызвать его в printPecord

    public List<Employee> read(String fileName) throws IOException {
        BufferedReader writer = new BufferedReader(new FileReader(fileName));
        String line = writer.readLine();
        List<Employee> employees = new ArrayList<>();
        for (; line != null; line = writer.readLine()) {
            employees.add(new Employee(line));
        }
        return employees;
    }

//    @RequestMapping("/thewall/{name}")
//    public String printPecord(@PathVariable String name) throws IOException {
//        List<Employee> employeeList = read("salary.csv");
//        String result = "";
//        int count = 0;
//        for (int i = 0; i < employeeList.size(); i++) {
//            Employee employee = employeeList.get(i);
//            if (employee.getName().equals(name)) {
//                count = count + 1;
//                result = result + employee.getMonth() + ";" + employee.getSalary() + "<br/>";
//            }
//        }
//        if (count == 0) {
//            result = "данных по имени " + name + " не найдено";
//        }
//        return result;
//    }

    @RequestMapping("/thewall/{name}")
    public String printPecord2(@PathVariable String name) throws IOException {
        BufferedReader writer = new BufferedReader(new FileReader("salary.csv"));
        String line = writer.readLine();
        String result = "";
        int count = 0;
        for (; line != null; line = writer.readLine()) {
            Employee employee = new Employee(line);
            if (employee.getName().equals(name)) {
                count = count + 1;
                result = result + employee.getMonth() + ";" + employee.getSalary() + "<br/>";
            }
        }
        if (count == 0) {
            result = "данных по имени " + name + " не найдено";
        }
        return result;
    }
}
