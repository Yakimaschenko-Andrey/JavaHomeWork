package com.pb.yakimaschenko.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        // Получаю число от пользователя
        Scanner Operand = new Scanner(System.in);
        System.out.println("Введите число");
        int valueOperand = Operand.nextInt();

        if (valueOperand >=0 && valueOperand <= 100) {
            if (valueOperand <= 14) {
                System.out.println("Введенное число попадает в промежуток - [0 -14]");
            }
            if (valueOperand >= 15 && valueOperand <= 35) {
                System.out.println("Введенное число попадает в промежуток - [15 - 35]");
            }
            if (valueOperand >= 36 && valueOperand <= 50) {
                System.out.println("Введенное число попадает в промежуток - [36 - 50]");
            }
            if (valueOperand >= 51 ) {
                System.out.println("Введенное число попадает в промежуток - [51 - 100]");
            }
        }else {
            System.out.println("Введенное число не попадает ни в один промежуток");
        }
    }
}
