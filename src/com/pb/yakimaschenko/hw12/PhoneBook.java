package com.pb.yakimaschenko.hw12;

import com.pb.yakimaschenko.hw11.Contacts;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook extends Contacts {
    private static List<String> listCont = new ArrayList<>();

    public PhoneBook(String fio, String dateOfBirth, List<String> phone, String address, LocalDateTime dateModify) {
        super(fio, dateOfBirth, phone, address, dateModify);
    }

    //поиск номера телефона
    public static void findContacts(String fio) {
        System.out.println("");
    }

    //addPB - добавляет запись по заданным номеру телефона и фамилии
    public static void addContacts() {
        for (String p: listCont) {
            listCont.add(p);
            System.out.println(p);
        }
    }

    //delPB - удаляет запись по номеру телефона
    private static void delContacts(String fio) {
        listCont.remove(fio);
    }


}
