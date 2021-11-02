package com.pb.yakimaschenko.hw5;

public class Library {
    public static void main(String[] args){
        int number = 3;
        //Массив книг
//        Book[] books = new Book[3];
//        books[0] = new Book("Множественные умы Билли Миллигана","Дэниэл Киз","1981");
//        books[1] = new Book("Скотный Двор","Джордж Оруэл","1944");
//        books[2] = new Book("Никаких правил: уникальная культура Netflix","Рид Хастингс","2021");
        Book book1 = new Book("Множественные умы Билли Миллигана","Дэниэл Киз","1981");
        Book book2 = new Book("Скотный Двор","Джордж Оруэл","1944");
        Book book3 = new Book("Никаких правил: уникальная культура Netflix","Рид Хастингс","2021");
        Book[] books = {book1, book2, book3};

        for(Book x : books){
            System.out.println(x.takeBook());
        }

        //Массив читателей
//        Reader[] readers = new Reader[3];
//        readers[0] = new Reader("Петров В.В.",1,"Экономический","09.10.1996","+380630000001");
//        readers[1] = new Reader("Иванов В.В.",2,"Машиностроительный","09.09.1997","+380630000002");
//        readers[2] = new Reader("Сидоров В.В.",3,"Менеджмент","09.01.1998","+380630000003");
        Reader reader1 = new Reader("Петров В.В.",1,"Экономический","09.10.1996","+380630000001");
        Reader reader2 = new Reader("Иванов В.В.",2,"Машиностроительный","09.09.1997","+380630000002");
        Reader reader3 = new Reader("Сидоров В.В.",3,"Менеджмент","09.01.1998","+380630000003");
        Reader[] readers = {reader1, reader2, reader3};


        for(Reader x : readers){
            System.out.println(x.takeReader());
        }

        reader1.takeBook(number);
        reader1.takeBook(book1.getNameBook() + ", "+ book2.getNameBook() + ", "+ book3.getNameBook());
        reader3.takeBook(book1, book2,book3);

//        reader1.takeBook(  book1.getNameBook() + " (" + book1.getBookAuthor() + ", " + book1.getPublicYear() +" г." +")" +", "+
//                                  book2.getNameBook() + " (" + book2.getBookAuthor() + ", " + book2.getPublicYear() +" г." +")" +", "+
//                                  book3.getNameBook() + " (" + book3.getBookAuthor() + ", " + book3.getPublicYear() +" г." +")" );

        reader1.returnBook(number);
        reader1.returnBook(book1.getNameBook() + ", "+ book2.getNameBook() + ", "+ book3.getNameBook());
        reader3.returnBook(book1, book2,book3);

//        reader1.returnBook(  book1.getNameBook() + " (" + book1.getBookAuthor() + ", " + book1.getPublicYear() +" г." +")" +", "+
//                                    book2.getNameBook() + " (" + book2.getBookAuthor() + ", " + book2.getPublicYear() +" г." +")" +", "+
//                                    book3.getNameBook() + " (" + book3.getBookAuthor() + ", " + book3.getPublicYear() +" г." +")" );


    }

}
