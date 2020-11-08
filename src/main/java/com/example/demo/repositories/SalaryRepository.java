package com.example.demo.repositories;

import com.example.demo.enteties.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalaryRepository extends JpaRepository<Salary, String> {
//public Salary findById();
// метод findById объявлять не надо,
// потому что он объявлен в JpaRepository от которого наследуется SalaryRepository
}
