package com.pb.yakimaschenko.hw5;

public class Library {
    public static void main(String[] args){

        //Массив книг
        Book[] books = new Book[3];
        books[0] = new Book("Множественные умы Билли Миллигана","Дэниэл Киз","1981");
        books[1] = new Book("Скотный Двор","Джордж Оруэл","1944");
        books[2] = new Book("Никаких правил: уникальная культура Netflix","Рид Хастингс","2021");

        for (Book x:books){
            System.out.println(x.toString());
        }

        //Массив читателей
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В.",1,"Экономический","09.10.1996","+380630000001");
        readers[1] = new Reader("Иванов В.В.",2,"Машиностроительный","09.09.1997","+380630000002");
        readers[2] = new Reader("Сидоров В.В.",3,"Менеджмент","09.01.1998","+380630000003");



//        System.out.println();
    }
}
