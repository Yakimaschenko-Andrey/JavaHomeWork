package com.pb.yakimaschenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //получаю ввод от пользователя
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");

        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите числа которые запишутся в массив:");

        //заполняю массив
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Массив состоит из:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

        // суммирую єлементы массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов массива равна: " + sum);

        //Считаю количество положительных элементов
        int count = 0;
        for(int i = 0; i<size; i++)
            if(array[i] > 0)
                count++;
        System.out.println("Количество положительных элементов массива равно: " + count);

        //Сортировка от меньшего к большему пузырьком.
        boolean isSorted = false;
        int change;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    change = array[i];
                    array[i] = array[i+1];
                    array[i+1] = change;
                }
            }
        }
        System.out.println("Результат сортировки пузырьком: " + Arrays.toString(array));
    }
    }

