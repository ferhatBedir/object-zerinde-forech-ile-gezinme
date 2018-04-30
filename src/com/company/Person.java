package com.company;

public class Person {

    private String name;
    private String surname;
    private String number;
    private String phone;

    public Person(String name, String surname, String number, String phone) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
