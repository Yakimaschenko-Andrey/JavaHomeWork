package com.pb.yakimaschenko.hw5;

public class Reader {
    private String fio;
    private int numCard;
    private String faculty;
    private String birthDate;
    private String phoneNum;
    static int bookCount = 0;

//    public int getBookCount(){
//        return bookCount;
//    }

    public Reader(String fio, int numCard, String faculty, String birthDate, String phoneNum) {
        this.fio = fio;
        this.numCard = numCard;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNum = phoneNum;
//        bookCount++;
    }
    public Reader() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String takeReader() {
        return "{" + "fio='" + fio + '\'' +", numCard='" + numCard + '\'' + ", faculty='" + faculty + ", birthDate='" + birthDate + ", phoneNum='" + phoneNum +
                '}';
    }

    public int takeBook(int number) {
        System.out.println(fio + " взял " + number + " книги.");
        return bookCount;
    }

    public void takeBook(String... books){
        System.out.println(fio + " взял следующие книги:");
        for(String book :books){
            System.out.print(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getNameBook() + " (" + " автор - " + book.getBookAuthor() + ", " + book.getPublicYear() +" г." +")");
        }
        System.out.println();
    }


//    public void returnBook(int number) {
//        System.out.println(fio + " вернул " + number+ " книги.");
//    }
public int returnBook(int number) {
    System.out.println(fio + " вернул " + number + " книги.");
    return bookCount;
}

    public void returnBook(String... books) {
        System.out.println(fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getNameBook() + " (" + " автор - " + book.getBookAuthor() + ", " + book.getPublicYear() +" г." +")");
        }
        System.out.println();
    }

}


