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
    // метод который принимает имя и csv и читает из csv только нужное имя и создает лист - написать позже

    // метод рид должен возвращать лист из всех объектов из csv
    //метод написать отдельно и вызвать его в printPecord

    public List<Employee> read(String fileName) throws IOException {
        BufferedReader writer = new BufferedReader(new FileReader(fileName));
        String line = writer.readLine();
        List<Employee> employees = new ArrayList<>();
        for (; line != null; line = writer.readLine()) {
            String[] salaries = line.split(";");
            employees.add(new Employee(salaries[0], salaries[1], salaries[2]));
        }
        return employees;
    }

    @RequestMapping("/thewall/{name}")
    public String printPecord(@PathVariable String name) throws IOException {
        List<Employee> employeeList = read("salary.csv");
        String result = "";
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)) {
                count = count + 1;
                result = result + employeeList.get(i).getMonth() + ";" + employeeList.get(i).getSalary() + "<br/>";
            }
        }
        if (count == 0) {
            result = "данных по имени " + name + " не найдено";
        }
        return result;
    }
}
