package com.pb.yakimaschenko.hw6;

import com.pb.yakimaschenko.hw5.Book;
import com.pb.yakimaschenko.hw5.Reader;

public class VetСlinic {
    public static void main(String[] args){


        Cat cat = new Cat(); //("Васыль","Вискас","Дом");
        Dog dog = new Dog(); //("Шарко","Корм для собак","Вольер");
        Horse horse = new Horse(); //("Буцефал","Сено","Загон");

        Animal[] animals = new Animal[]{cat,dog,horse};

//        for(Animal x : animals){
//            System.out.println(x.getName());
//        }

        dog.sleep();
        dog.makeNoise();
        horse.makeNoise();
        dog.eat();
        cat.eat();
        horse.eat();

        System.out.println("eq cat horse " + cat.equals(horse));
        System.out.println("eq cat dog " + cat.equals(dog));
        System.out.println("eq horse dog " + horse.equals(dog));

        System.out.println("toString " + cat.toString());
        System.out.println("toString " + dog.toString());
        System.out.println("toString " + horse.toString());

        System.out.println("hashCode cat: " + cat.hashCode());
        System.out.println("hashCode dog: " + dog.hashCode());
        System.out.println("hashCode horse: " + horse.hashCode());



    }
}
