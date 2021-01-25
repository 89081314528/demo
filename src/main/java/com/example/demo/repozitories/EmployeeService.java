package com.example.demo.repozitories;

import com.example.demo.dto.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeService {
    public List<Employee> findByName(String name) throws IOException;
    //в интерфейсе нет тела метода
}
//тип возвращаемого значения не входит в сигнатуру метода. нельзя создать два метода с одинаковым названием и
// параметрами
