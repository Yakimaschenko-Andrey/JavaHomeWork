package com.pb.yakimaschenko.hw7;

public class Tie extends Clothes implements ManClothes {


public Tie(){
    super("M","black","1200","Галстук");
};


    @Override
    public void dressMan() {
        System.out.println("одеть мужчину ");
    }

    @Override
    public String toString() {
        return "Галстук {" + " бренд: " + getName() +
                ", цвет: " + getColor() +
                ", стоимость: " + getCoast() +
                ", размер: " + getSize() + "}"
                ;
    }


}
