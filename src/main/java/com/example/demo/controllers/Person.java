package com.example.demo.controllers;

public class Person {
    final String name;
    final String surname;
    final Long amount;
    final String passportNumber;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getAmount() {
        return amount;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public Person(String name, String surname, Long amount, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.amount = amount;
        this.passportNumber = passportNumber;
    }
}
