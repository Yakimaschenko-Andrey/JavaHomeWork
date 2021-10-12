package com.pb.yakimaschenko.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        //Создаем 1-й объект класса Scanner
        Scanner Operand1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int valueOperand1 = Operand1.nextInt();

        //Создаем 2-й объект класса Scanner
        Scanner Operand2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int valueOperand2 = Operand2.nextInt();

        //Создаем 3-й объект класса Scanner, уточняем арифметический знак
        Scanner sign = new Scanner(System.in);
        System.out.println("Введите арифметический знак: ");
        String valuesign = sign.next();

        switch (valuesign){
            case "+":
                System.out.println(valueOperand1 + valueOperand2);
                break;
            case "-":
                System.out.println(valueOperand1 - valueOperand2);
                break;
            case "*":
                if (valueOperand2 > 0) {
                    System.out.println(valueOperand1 * valueOperand2);
                }
                else {
                    System.out.println("Умножение на '0' выведет в результате '0'. Замените, пожалуйста, число");
                }
                break;
            case "/":
                if (valueOperand2 > 0) {
                    System.out.println(valueOperand1 / valueOperand2);
                } else {
                    System.out.println("Деление на '0' выведет в результате '0'. Замените, пожалуйста, число");
                }
                break;
        }
    }
}
