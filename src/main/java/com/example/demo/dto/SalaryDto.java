package com.example.demo.dto;

public class SalaryDto {
    String name;
    String surname;
    Long amount;
    String passportNumber;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }


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


    public SalaryDto(String name, String surname, Long amount, String passportNumber) {
        this.name = name;
        this.surname = surname;
        this.amount = amount;
        this.passportNumber = passportNumber;
    }
}
