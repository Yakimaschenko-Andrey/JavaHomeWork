package com.pb.yakimaschenko.hw6;

public class Dog extends Animal{
    private String kindness; //доброта
    private String fun;      //веселье


//    public Dog(String name, String feed, String home) {
//        this.name = name;
//        this.feed = feed;
//        this.home = home;
//    }
    public Dog(){
        super("корм для собак","вольер","Шарко");
    }


    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Пес " + getName() + " сейчас спит и набирается сил...");

    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Пес " + getName() + " начал лаить");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Пес " + getName() + " решил перекусить " + getFood());
    }



}
