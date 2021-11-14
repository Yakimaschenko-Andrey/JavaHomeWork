package com.pb.yakimaschenko.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes{
//


    public Pants(){
        super("M","grey","1100","Levice");
    };

    @Override
    public void dressMan() {
        System.out.println("одеть мужчину ");

    }

    @Override
    public void dressWomen() {
        System.out.println("одеть женщину ");

    }
    @Override
    public String toString() {
        return "Штаны {" + " бренд: " + getName() +
                ", цвет: " + getColor() +
                ", стоимость: " + getCoast() +
                ", размер: " + getSize() + "}"
                ;
    }
}
