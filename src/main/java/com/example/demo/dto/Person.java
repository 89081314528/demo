package com.example.demo.dto;

public class Person {
    final String name;
    final String surname;
    final String passportNumber;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public Person(String name, String surname, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }
}
