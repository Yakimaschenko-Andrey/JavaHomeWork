package com.pb.yakimaschenko.hw12;

import com.pb.yakimaschenko.hw12.Contacts;
import com.pb.yakimaschenko.hw12.PhoneBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContactsMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final List<Contacts> listCont = new ArrayList<>();


        Scanner in = new Scanner(System.in);
        System.out.println("Телефонный справочник");
        System.out.println("1. Добавить/Сохранить контакт");
        System.out.println("2. Отобразить контакты");
        System.out.println("3. Найти контакт в телефонной книге");
        System.out.println("4. Редактировать контакт");
        System.out.println("5. Удалить контакт");
        System.out.println("6. Сохранить контакты в файл");
        System.out.println("7. Выгрузить контакты из файла");


        System.out.println("Для совершения действия укажите соответствующую цифру:");

        int choice = in.nextInt(); //выберете что хотите сделать
        in.nextLine();

        switch(choice){
            case 1:
                com.pb.yakimaschenko.hw12.PhoneBook.addContact();
//        System.out.println("Введите ФИО нового контакта: ");
//        String valueFio = in.nextLine();
//        System.out.println("Введите дату рождения: (дату введите в формате 1992-01-01)");
//        LocalDate valueBrthDay = LocalDate.parse(in.next());
//        System.out.println("Введите номер телефона: ");
//        String valuePhone = in.next();
//        System.out.println("Введите адресс: ");
//        String valueAddr = in.next();
//        LocalDateTime dateModify = LocalDateTime.now();
//        PhoneBook.addContact();
                break;
            case 2:
                System.out.println("Сортировка");
                System.out.println("1. По id");
                System.out.print("Выбор: ");
                String input = in.nextLine();
                switch (input) {
                    case "1":
                        com.pb.yakimaschenko.hw12.PhoneBook.sortByIdAndPrint();
                }
                break;
            case 3:
                System.out.println("Введите ФИО контакта для поиска: ");
//                valueFio = in.nextLine();
                break;
            case 4:
                System.out.println("Введите ФИО контакта для редактирования");
//                valueFio = in.nextLine();
//               PhoneBook.editContact();
                break;
            case 5:
//                System.out.println("Введите ФИО контакта для удаления");
                com.pb.yakimaschenko.hw12.PhoneBook.delContacts();
                break;
            case 6:
                PhoneBook.saveToFile();
                break;
            case 7:
                PhoneBook.loadFromFile();
                break;
            default:
                return;
        }
    }



}
