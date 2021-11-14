package com.pb.yakimaschenko.hw7;

public class Skirt extends Clothes implements WomenClothes{
    //


    public Skirt(){
        super("S","red","1500","Zara");
    };

    @Override
    public void dressWomen() {
        System.out.println("одеть женщину ");
    }
    @Override
    public String toString() {
        return "Юбка {" + " бренд: " + getName() +
                ", цвет: " + getColor() +
                ", стоимость: " + getCoast() +
                ", размер: " + getSize() + "}"
                ;
    }
}
