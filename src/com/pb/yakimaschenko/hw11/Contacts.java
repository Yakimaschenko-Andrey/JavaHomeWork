package com.pb.yakimaschenko.hw11;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Contacts implements Serializable {

    private final static long serialVersionUID = 42;

    private int id;
    private String fio;
    private LocalDate dateOfBirth;
//    private String phone;
    private List<String> phone;
    private String address;
    private LocalDateTime dateModify;

    public Contacts(int id, String name, LocalDate dateOfBirth, List<String> numbers, String address) {
    }

    public Contacts(int id, String fio, LocalDate dateOfBirth, List<String> phone, String address, LocalDateTime dateModify) {
        this.id = id;
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.dateModify = dateModify;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public List<String> getPhone() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contact = (Contacts) o;
        return id == contact.id && Objects.equals(fio, contact.fio) && Objects.equals(dateOfBirth, contact.dateOfBirth) && Objects.equals(phone, contact.phone) && Objects.equals(address, contact.address) && Objects.equals(dateModify, contact.dateModify);
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
