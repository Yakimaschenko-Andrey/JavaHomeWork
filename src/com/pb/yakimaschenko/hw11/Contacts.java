package com.pb.yakimaschenko.hw11;

import java.io.Serializable;
import java.time.LocalDate;

public class Contacts implements Serializable {

    private final static long serialVersionUID = 42;

    private String fio;
    private LocalDate dateOfBirth;
    private String phone;
    private String address;
    private LocalDate dateModify;

    public Contacts(String fio, LocalDate dateOfBirth, String phone, String address, LocalDate dateModify) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.dateModify = dateModify;
    }

//    public Contacts(String name, String phone) {
//        this.fio = name;
//        this.phone = phone;
//    }
//
//    public Contacts(String name, String phone, LocalDate dateOfBirth) {
//        this.fio = name;
//        this.phone = phone;
//        this.dateOfBirth = dateOfBirth;
//    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateModify() {
        return dateModify;
    }

    public void setDateModify(LocalDate dateModify) {
        this.dateModify = dateModify;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "fio='" + fio + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dateModify=" + dateModify +
                '}';
    }
}
