package com.pb.yakimaschenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 100.");
        System.out.println("Для выхода из программы введите - 500.");

        // Допустимое количество попыток и Счетчик попыток.
        final int MAX_ATTEMPT = 101;
        int attempt = 0;

        //получаем рандомное число
        Random random = new Random();
        int number = random.nextInt(100);
//        System.out.println("number: " + number);

        //получаем ввод от пользователя
        Scanner in = new Scanner(System.in);
        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            int value = in.nextInt();

            if (value == 500) {
                break;
            }
            if (value > number){
                System.out.println("Загаданное число меньше. Введите, число меньше");
            }else if (value < number){
                System.out.println("Загаданное число больше. Введите, число больше");
            } if (value != number) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }
        System.out.println("Конец игры!");
    }
}

