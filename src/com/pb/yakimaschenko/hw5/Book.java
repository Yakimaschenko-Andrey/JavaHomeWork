package com.pb.yakimaschenko.hw5;

public class Book {

   private String NameBook;
   private String BookAuthor;
   private String PublicYear;


    public Book(String NameBook, String BookAuthor, String PublicYear) {
        this.NameBook = NameBook;
        this.BookAuthor = BookAuthor;
        this.PublicYear = PublicYear;
    }

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String nameBook) {
        NameBook = nameBook;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public String getPublicYear() {
        return PublicYear;
    }

    public void setPublicYear(String publicYear) {
        PublicYear = publicYear;
    }

    public String getInfo() {
        return "{" + "NameBook='" + NameBook + '\'' +", BookAuthor='" + BookAuthor + '\'' + ", PublicYear='" + PublicYear +
                '}';
    }



}
