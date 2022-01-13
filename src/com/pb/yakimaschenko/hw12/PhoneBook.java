package com.pb.yakimaschenko.hw12;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import java.nio.charset.StandardCharsets;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class PhoneBook {
    private static List<com.pb.yakimaschenko.hw12.Contacts> listCont = new ArrayList<>();
    private static final Scanner scan = new Scanner(System.in);

    private final ObjectMapper objectMapper;

    public PhoneBook() {
        objectMapper = new ObjectMapper();
        // pretty printing (json с отступами)
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        // для работы с полями типа LocalDate и LocalDateTime
        SimpleModule module = new SimpleModule();
//        module.addSerializer(LocalDate.class, new LocalDateSerializable());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializable());
        objectMapper.registerModule(module);
    }

    //Добавление контакта
    public static void addContact() {
        System.out.println("Введите ФИО: ");
        String name = scan.nextLine();
        System.out.println("Введите дату рождения: ");
        String dateOfBirthStr = scan.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);
        System.out.println("Введите номер телефона: ");
        List<String> numbers = inputPhoneNumbers();
        System.out.println("Введите адрес: ");
        String address = scan.nextLine();
        int id = getNextId();
        com.pb.yakimaschenko.hw12.Contacts contact = new com.pb.yakimaschenko.hw12.Contacts(id, name, dateOfBirth, numbers, address);
        listCont.add(contact);
    }

    private static int getNextId() {
        if (listCont.isEmpty()) {
            return 1;
        }
        com.pb.yakimaschenko.hw12.Contacts maxIdContact = Collections.max(listCont, new Comparator<com.pb.yakimaschenko.hw12.Contacts>() {
            @Override
            public int compare(com.pb.yakimaschenko.hw12.Contacts c1, com.pb.yakimaschenko.hw12.Contacts c2) {
                return Integer.compare(c1.getId(), c2.getId());
            }
        });
        return maxIdContact.getId() + 1;
    }

    //поиск номера телефона
    private static com.pb.yakimaschenko.hw12.Contacts findContacts(int id) {

        for (com.pb.yakimaschenko.hw12.Contacts contact : listCont) {
            if (id == contact.getId()) {
                return contact;
            }
        }
        return null;
    }

    private static List<String> inputPhoneNumbers() {
        List<String> numbers = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер телефона (0 - для выхода): ");
            String number = scan.nextLine();
            if ("0".equals(number)) {
                return numbers;
            }
            numbers.add(number);
        }
    }

    //delPB - удаляет запись по номеру телефона

    public static void delContacts() {
        System.out.println("Введите id контакта для удаления: ");
        int id = Integer.parseInt(scan.nextLine());
        com.pb.yakimaschenko.hw12.Contacts contact = findContacts(id);
        if (contact == null) {
            System.out.println("Контакт не найден");
            return;
        }
        listCont.remove(contact);
        System.out.println("Контакт удален");
    }

    public static void sortByIdAndPrint() {
        listCont.sort(new Comparator<com.pb.yakimaschenko.hw12.Contacts>() {
            @Override
            public int compare(com.pb.yakimaschenko.hw12.Contacts c1, com.pb.yakimaschenko.hw12.Contacts c2) {
                return Integer.compare(c1.getId(), c2.getId());
            }
        });
    }


    public static void saveToFile() throws IOException {
        File file = Paths.get("contacts.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(listCont);
        System.out.println("Файл записан! ");
        objectOutputStream.close();
        System.out.println(new String(Files.readAllBytes(Paths.get("contacts.data"))));
    }
    public static void loadFromFile() throws IOException, ClassNotFoundException {
        ArrayList<com.pb.yakimaschenko.hw12.Contacts> newContacts = new ArrayList<>();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("contacts.data"));
        newContacts = (ArrayList<com.pb.yakimaschenko.hw12.Contacts>) objectInputStream.readObject();
        for (com.pb.yakimaschenko.hw12.Contacts c : newContacts) {
            System.out.println(c.toString());
        }
    }




}
