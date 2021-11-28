package com.pb.yakimaschenko.hw10;

public class Main {
    public static void main(String[] args) throws Exception {
        NumBox<Integer> numBox = new NumBox<>(3);

        try {
            numBox.add(0,1);
            numBox.add(1,2);
            numBox.add(2,3);
            numBox.add(3,4);
            numBox.add(4,5);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Недостаточно места для наполнения массива!"  + e);
            e.printStackTrace();
        }
        System.out.println(numBox.get());


        System.out.println(numBox.length());
    }
}
