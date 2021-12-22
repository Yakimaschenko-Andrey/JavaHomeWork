package com.pb.yakimaschenko.hw12;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Contacts implements Serializable {

    private final static long serialVersionUID = 42;

    private String fio;
    private String dateOfBirth;
    //    private String phone;
    private List<String> phone;
    private String address;
    private LocalDateTime dateModify;

    public Contacts(String fio, String dateOfBirth, List<String> phone, String address, LocalDateTime dateModify) {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String>  getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDateModify() {
        return dateModify;
    }

    public void setDateModify(LocalDateTime dateModify) {
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
