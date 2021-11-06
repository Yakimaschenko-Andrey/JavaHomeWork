package com.pb.yakimaschenko.hw6;

import com.pb.yakimaschenko.hw5.Book;

public class VetСlinic {
    public static void main(String[] args){


        Cat cat = new Cat("Васыль","Вискас","Дом");
        Dog dog = new Dog("Шарко","Корм для собак","Вольер");
        Horse horse = new Horse("Буцефал","Сено","Загон");

        Animal[] animals = new Animal[]{cat,dog,horse};



//        Cat cat = new Cat();
//        cat.setName("Васыль");
//        cat.setFood("Вискас");
//        cat.setLocation("Дом");

//        Dog dog = new Dog();
//        dog.setName("Шарко");
//        dog.setFood("Корм для собак");
//        dog.setLocation("Вольер");

//        Horse horse = new Horse();
//        horse.setName("Буцефал");
//        horse.setFood("Сено");
//        horse.setLocation("Загон");


        cat.sleep();
//        dog.eat();
//        horse.makeNoise();

    }
}
