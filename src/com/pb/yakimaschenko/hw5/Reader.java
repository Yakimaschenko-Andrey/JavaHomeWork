package com.pb.yakimaschenko.hw5;

public class Reader {
    private String fio;
    private int numCard;
    private String faculty;
    private String birthDate;
    private String phoneNum;

    public Reader(String fio, int numCard, String faculty, String birthDate, String phoneNum){
        this.fio = fio;
        this.numCard = numCard;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNum = phoneNum;

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

    public String takeBook() {
        return "{" + fio + '\'' + "взял" + numCard + '\'' + "книги" + '}';
    }

}

