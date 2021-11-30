package com.pb.yakimaschenko.hw10;

import static java.lang.Double.sum;

public class NumBox <T extends Number>{
    private T[] numbers;
    private int size = 0;

    public NumBox(int col) {
        if (col <= 0) { //throw new ArrayIndexOutOfBoundsException ("Количество єлементов должно быть больше 0 ");
        }
        this.numbers = (T[]) new Number[col];

    }


    public void add(T num) {
       if (size >= numbers.length) {
            throw new ArrayIndexOutOfBoundsException ("Недостаточно места для наполнения массива. Количество элементов в массиве: " + size);
        } else numbers[size] = num;
       size++;
    }


    public T get(int index) {
//        return numbers;
        if (index>=size){
           return null;
        }
        return numbers[index];
    }

    public int length(){
        int i = 0;
        for(T n : numbers){
            if(!(n == null)){
                i++;
            } else i+=0;
        }
        return i;
    }


    public double sum() {
        double sum = 0;
        for (T n : numbers ){
              sum += n.doubleValue();
        }
        return sum;
    }

    public double average(){
        double avеrage = (sum()/length());

        return avеrage;
    }


    public T max(){
        T maX = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].doubleValue() > maX.doubleValue()) {
                maX = numbers[i];
            }
        }
        return maX;
    }



}


