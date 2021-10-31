package com.pb.yakimaschenko.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static char[] function() {

        //Получаю ввод строки от пользователя
        System.out.println("Введите предложение:");
        Scanner Stroka = new Scanner(System.in);
        String Strokavalue = Stroka.nextLine();

        char[] words = Strokavalue.toCharArray();

        for (int i = 1; i < words.length; i++){
            if(words[i - 1] == ' ' && words[i] != ' ')
                words[i] = Character.toUpperCase(words[i]);
        }
        if (words[0] != ' ')
            words[0] = Character.toUpperCase(words[0]);
        System.out.println(words);

        return words;
    }

    public static void main(String[] args) {
        System.out.println(function());

    }

}