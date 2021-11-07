package com.pb.yakimaschenko.hw6;

public class Horse extends Animal{
    private String strong; //сила
    private String speed;  //скорость

    //    public Horse(String name, String feed, String home) {
//        this.name = name;
//        this.feed = feed;
//        this.home = home;
//    }
    public Horse(){
        super("сено","загон","Буцефал");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Конь " + getName() + " сейчас спит и набирается сил...");

    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Конь " + getName() + " начал ржать...");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("Конь " + getName() + " решил перекусить " + getFood());
    }

}
