package com.pb.yakimaschenko.hw6;

public class Cat extends Animal{
    private String laziness;  //лень
    private String arrogance; // надменность


    //    public Cat(String name, String feed, String home) {
//        this.name = name;
//        this.feed = feed;
//        this.home = home;
//    }
    public Cat(){
        super("корм для котов","дом","Васыль");
    }
//    @Override
//    public String getAnimalName() {
//        return "Cat " + name;
//    }
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Кот " + getName() + " сейчас спит и набирается сил...");

    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Кот " + getName() + " начал мяукать...");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Кот " + getName() + " решил перекусить " + getFood());
    }

}
