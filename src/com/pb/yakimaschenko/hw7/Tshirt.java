package com.pb.yakimaschenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
//

    public Tshirt(){
        super("M","blue","500","Pull&Bear");
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
        return "Футболка {" + " бренд: " + getName() +
                ", цвет: " + getColor() +
                ", стоимость: " + getCoast() +
                ", размер: " + getSize() + "}"
                ;
    }
}
