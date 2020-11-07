package com.example.demo.enteties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salaries")
public class Salary {
    @Column(name = "first_name")
    String name;
    @Column(name = "last_name")
    String surname;
    @Column(name = "sum")
    Long amount;
    @Column(name = "passport")
    @Id
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
}
