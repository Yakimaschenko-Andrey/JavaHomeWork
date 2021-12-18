package com.pb.yakimaschenko.hw11;

import java.time.LocalDate;

public class PhoneBook  extends Contacts{


    public PhoneBook(String fio, LocalDate dateOfBirth, String phone, String address, LocalDate dateModify) {
        super(fio, dateOfBirth, phone, address, dateModify);
    }

    public static void findNumber(String fio) {
        System.out.println("");
    }


}
