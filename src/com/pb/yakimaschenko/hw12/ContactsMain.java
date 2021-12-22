package com.pb.yakimaschenko.hw12;

import com.pb.yakimaschenko.hw11.Contacts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static com.pb.yakimaschenko.hw11.PhoneBook.saveContact;


public class ContactsMain {
    public static void main(String[] args) {

//        System.out.println("Введите данные по контакту ");
//        //Принимаю данные по контакту
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите, пожалуйста, ФИО нового контакта: ");
//        String valueFio = scan.next();
//        System.out.println("Введите дату рождения: ");
//        String valueBrthDay = scan.next();
//        System.out.println("Введите номер телефона: ");
//        String valuePhone = scan.next();
//        System.out.println("Введите адресс: ");
//        String valueAddr = scan.next();
//
//        List<String> list = new ArrayList<>();
        List<Contacts> listCont = new ArrayList<>();

//        List<Contacts> listCont = inputPhoneNumbers();



        Scanner in = new Scanner(System.in);
        System.out.println("Телефонный справочник");
        System.out.println("1. Добавить/Сохранить контакт");
        System.out.println("2. Найти контакт в телефонной книге");
        System.out.println("3. Редактировать контакт");
        System.out.println("4. Удалить контакт");

        System.out.println("Для совершения действия укажите соответствующую цифру:");


        int choice = in.nextInt(); //выберете что хотите сделать
        in.nextLine();

        switch(choice){
            case 1:
        System.out.println("Введите ФИО нового контакта: ");
        String valueFio = in.next();
        System.out.println("Введите дату рождения: ");
        String valueBrthDay = in.next();
        System.out.println("Введите номер телефона: ");
        String valuePhone = in.next();
        System.out.println("Введите адресс: ");
        String valueAddr = in.next();
//        addContacts(valueFio, valueBrthDay, valuePhone, valueAddr);
//                listCont.add (new Contacts (valueFio, valueBrthDay, valuePhone, valueAddr, LocalDateTime.now()));
                break;
            case 2:
                System.out.println("Введите ФИО контакта для поиска: ");
                valueFio = in.nextLine();
                System.out.println();
                break;
            case 3:
                System.out.println("Введите ФИО контакта для редактирования: ");
                valueFio = in.nextLine();
                System.out.println();
                break;
            case 4:
                System.out.println("Введите ФИО контакта для удаления");
            default:
                break;
        }
//        for(String s : listCont) {
//            System.out.println(s);
//        }
    }
    public static void saveContact(String fio, LocalDate dateOfBirth, String phone, String address, String dateModify) {
        System.out.println("Контакт сохранен:"+ fio + " " + dateOfBirth + " " + phone + " " + address + " " + dateModify);

    }

//    private List<String> inputPhoneNumbers() {
//        List<String> numbers = new ArrayList<>();
//        while (true) {
//            System.out.println("Введите номер телефона (0 - для выхода): ");
//            String number = scan.nextLine();
//               if ("0".equals(number)) {
//                return numbers;
//            }
//            numbers.add(number);
//        }
//    }
}
