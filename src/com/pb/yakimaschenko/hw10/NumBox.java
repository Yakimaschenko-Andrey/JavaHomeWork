package com.pb.yakimaschenko.hw10;

public class NumBox <T extends Number>{
    private T[] number;

    public NumBox(int size) {
        this.number = (T[]) new Number[size];

    }

    public void add(int index, int number) {
//        number.(index,number);
    }


    public T[] get() {
        return number;
    }

    public void set(int index, T number) {
        this.number[index] = number;
    }

    public int length(){
        int count = 0;
        for(T i : number){
            if(!(i == null)){
                count++;
            } else count+=0;
        }
        return count;
    }
}
