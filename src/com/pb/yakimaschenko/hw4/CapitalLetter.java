package com.pb.yakimaschenko.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static String function() {

        //Получаю ввод строки от пользователя
        System.out.println("Введите предложение:");
        Scanner Stroka = new Scanner(System.in);
        String Strokavalue = Stroka.nextLine();

        String[] words = Strokavalue.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        Strokavalue = String.join(" ", words);

//        System.out.println(words[i]);
        return Strokavalue;
    }

    public static void main(String[] args) {
        System.out.println(function());

    }

}