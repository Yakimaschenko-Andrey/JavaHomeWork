package com.pb.yakimaschenko.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class OnlineShop {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {


        System.out.println("Зарегистрируйтесь на сайте ");
        //Принимаю логин для регистрации
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, логин для регистрации: ");
        String valuelogiin1 = scan.next();
        System.out.println("Введите пароль: ");
        String valuepassword1 = scan.next();
        System.out.println("Повторите пароль: ");
        String valuepassword2 = scan.next();

        Auth auth = new Auth(valuelogiin1,valuepassword1,valuepassword2);

        try {
            auth.signUp(valuelogiin1,valuepassword1,valuepassword2);
        }catch (WrongLoginException | WrongPasswordException e){
            e.printStackTrace();
//        }catch (WrongPasswordException e){
//           System.out.println("Пароль не соответствует требованиям: " + e.getMessage());
        }

//        auth.signUp(valuelogiin1,valuepassword1,valuepassword2);

        //Принимаю логин и пароль для авторизации
        System.out.println("Введите,пожалуйста, логин и пароль для авторизации");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String valuelogiinAuth = scan2.next();
        System.out.println("Введите пароль: ");
        String valuepasswordAuth = scan2.next();

        try {
            auth.signIn(valuelogiinAuth,valuepasswordAuth);
        }catch (WrongLoginException  e) {
            e.printStackTrace();
        }



    }


}
