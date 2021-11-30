package com.pb.yakimaschenko.hw10;

public class Main {
    public static void main(String[] args) throws Exception {
        NumBox<Integer> numBoxInt = new NumBox<Integer>(5);

        try {
            numBoxInt.add(1);
            numBoxInt.add(3);
            numBoxInt.add(4);
            numBoxInt.add(5);
            numBoxInt.add(6);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Недостаточно места для наполнения массива. Заполнено в массиве: "  + numBoxInt.length() + " элемента");
            e.printStackTrace();
               }

        System.out.println("Демонстрация работы с Integer: ");
        System.out.println("Длина массива: " + numBoxInt.length());
        System.out.println("Элемент по индексу 2: " +numBoxInt.get(2));
        System.out.println("Текущее количество элементов: " +numBoxInt.length());
        System.out.println("Сумма всех элементов массива: " +numBoxInt.sum());
        System.out.println("Среднего арифметическое элементов массива: " + numBoxInt.average());
        System.out.println("Максимальный элемент массива: " + numBoxInt.max());

        System.out.println("-------------------------------------");

        NumBox<Float> numBoxFlt = new NumBox<Float>(5);

        try {
            numBoxFlt.add(1.2F);
            numBoxFlt.add(3.5F);
            numBoxFlt.add(4.2F);
            numBoxFlt.add(5.1F);
            numBoxFlt.add(6.9F);
            numBoxFlt.add(7.2F);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Недостаточно места для наполнения массива. Заполнено в массиве: "  + numBoxFlt.length() + " элемента");
            e.printStackTrace();
        }
        System.out.println("Демонстрация работы с Float: ");
        System.out.println("Длина массива: " + numBoxFlt.length());
        System.out.println("Элемент по индексу 2: " +numBoxFlt.get(2));
        System.out.println("Текущее количество элементов: " +numBoxFlt.length());
        System.out.println("Сумма всех элементов массива: " +numBoxFlt.sum());
        System.out.println("Среднего арифметическое элементов массива: " + numBoxFlt.average());
        System.out.println("Максимальный элемент массива: " + numBoxFlt.max());





    }
}
