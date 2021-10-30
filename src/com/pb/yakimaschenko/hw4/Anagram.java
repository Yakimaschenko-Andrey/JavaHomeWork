package com.pb.yakimaschenko.hw4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
 //   static String function() {

           public static boolean Mymethod(String Sentense1,String Sentense2){

//        System.out.println("Введите первое предложение:");
//        Scanner Scanner = new Scanner(System.in);
//        String Sentense1 = Scanner.nextLine();
//        System.out.println("Введите второе предложение:");
//        String Sentense2 = Scanner.nextLine();


        //все буквы ровняю ловеркейсом и убираю символы и пробелы
        String Stroka1 = (Sentense1.toLowerCase().replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", ""));
        String Stroka2 = (Sentense2.toLowerCase().replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", ""));



 //              if (Stroka1.length() != Stroka2.length()){
 //                return false;
 //          }
 //              System.out.println("Это не анаграмма");

        //записываю в одинаковый формат переменной
        char[] word1 = Stroka1.toCharArray();
        char[] word2 = Stroka2.toCharArray();
//        Arrays.sort(word1);
//        Arrays.sort(word2);

               Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

               for (char c : word1) {
                   int count = 1;
                   if (lettersInWord1.containsKey(c)) {
                       count = lettersInWord1.get(c) + 1;
                   }
                   lettersInWord1.put(c, count);
               }

               for (char c : word2) {
                   int count = -1;
                   if (lettersInWord1.containsKey(c)) {
                       count = lettersInWord1.get(c) - 1;
                   }
                   lettersInWord1.put(c, count);
               }

               for (char c : lettersInWord1.keySet()) {
                   if (lettersInWord1.get(c) != 0) {
                       return false;
                   }
               }

               return true;

    }

    public static void main(String[] args) {

        System.out.println("Введите первое предложение:");
        Scanner Scanner = new Scanner(System.in);
        String Sentense1 = Scanner.nextLine();
        System.out.println("Введите второе предложение:");
        String Sentense2 = Scanner.nextLine();

        Scanner.close();
        boolean ret = Mymethod(Sentense1,Sentense2);
        System.out.println((ret) ? "Это анаграмма" : "Это не анаграмма");

    }
}
