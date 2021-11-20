package com.pb.yakimaschenko.hw8;

import java.util.regex.Pattern;

public class Auth {

    private String login;
    private String password;
    private String confirmPassword;

//    Auth auth = new Auth(login,password,confirmPassword);

    public Auth(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;

    }




    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
            if(Pattern.matches("[a-zA-Z0-9]{5,20}", login)){
                this.login = login;
            } else{
                throw new WrongLoginException("Логин не соответствует требованиям! Длинна должна быть от 5 до 20 символов. " +
                                              "Login должен содержать только латинские буквы и цифры");
            }

        if(Pattern.matches("[a-zA-Z0-9_]{5,}", password)){
            this.password = password;
        } else{
            throw new WrongPasswordException("Пароль не соответствует требованиям! " +
                    "Длинна должна быть более 5 символов,может иметь только латинские буквы, цифры и знак подчеркивания");
        }

        if(password.equals(confirmPassword)){
            this.password = password;
        } else{
            throw new WrongPasswordException("Пароль не соответствует требованиям! " +
                    "Пароль не соответствует ранее введенному при регистрации");
        }
        if(!this.password.equals(null)&& !this.login.equals(null)){
            System.out.println("--------------------------");
            System.out.println("Регистрация проведена успешно");
            System.out.println("--------------------------");
        }


        }



    public void signIn(String login, String password) throws WrongLoginException{
        if (this.login.equals(login) && this.password.equals(password)){
            System.out.println("--------------------------");
            System.out.println("Вход выполнен успешно");
            System.out.println("--------------------------");
        }else {
            throw new WrongLoginException("Логин или пароль указаны неправильно. Пожалуйста, повторите попытку");
        }


    }

    }

