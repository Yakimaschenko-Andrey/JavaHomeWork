package com.pb.yakimaschenko.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class OnlineShop {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {


        System.out.println("Зарегистрируйтесь на сайте ");
        //Принимаю логин для регистрации
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин для регистрации: ");
        String valuelogiin1 = scan.next();
        System.out.println("Введите пароль: ");
        String valuepassword1 = scan.next();
        System.out.println("Повторите пароль: ");
        String valuepassword2 = scan.next();

 //       try {
 //           Auth auth = new Auth(valuelogiin1,valuepassword1,valuepassword2);
 //       }catch (WrongLoginException e){
 //           System.out.println("Логин не соответствует требованиям: " + e.getMessage());
 //       }catch (WrongPasswordException e){
 //           System.out.println("Пароль не соответствует требованиям: " + e.getMessage());
 //       }

        Auth auth = new Auth(valuelogiin1,valuepassword1,valuepassword2);

        auth.signUp(valuelogiin1,valuepassword1,valuepassword2);

        System.out.println("--------------------------");
        System.out.println("Регистрация проведена успешно");
        System.out.println("--------------------------");





        //Принимаю логин и пароль для авторизации
        System.out.println("Введите логин и пароль для авторизации");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите логин для регистрации: ");
        String valuelogiinAuth = scan2.next();
        System.out.println("Введите пароль: ");
        String valuepasswordAuth = scan2.next();





    }


}
