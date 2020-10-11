package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController

public class DemoController {
    @RequestMapping("/")
    public String welcomePage() {
        return "Welcome";
    }

    @RequestMapping("/thewall/{name}")

    public String printPecord(@PathVariable String name) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("salary.csv"));
        String line = reader.readLine();
        String[] salaries = line.split(";");
        String fio = salaries[0];
        List<String> fios = new ArrayList<>();
        fios.add(fio);
        PrintStream csv = new PrintStream(fio + ".csv");

        for (; line != null; line = reader.readLine()) {
            salaries = line.split(";");
            String currentFio = salaries[0];
            if (!fio.equals(currentFio)) {
                fio = currentFio;
                fios.add(fio);
                csv = new PrintStream(fio + ".csv");
            }
            for (int i = 1; i < salaries.length; i++) {
                if (i == salaries.length - 1) {
                    csv.println(salaries[i]);

                } else {
                    csv.print(salaries[i] + ";");
                }
            }
        }
        String result = "";
        for (int i = 0; i < fios.size(); i++) {
            if (name.equals(fios.get(i))) {
                BufferedReader read = new BufferedReader(new FileReader(fios.get(i) + ".csv"));
                result = "";
                String salary = read.readLine();
                for (; salary != null; salary = read.readLine()) {
                    result = result + salary;
                }
            }
        }
        return result;
    }
}
