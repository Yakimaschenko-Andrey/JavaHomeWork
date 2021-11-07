package com.pb.yakimaschenko.hw6;


public class Animal {
    private String food;
    private String location;
    private String name;

    //    public Animal() {
//    }

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public String getName() {
//        return name;
//    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
//        System.out.println( "Животное по имени " + getName() );
    }
    public void eat(){
//        System.out.println( "Животное по имени  " + getName() + " сейчас решил перекусить...");
    }
    public void sleep(){
//        System.out.println( "Животное по имени  " + getName() + " сейчас спит и набирается сил...");
    }


    public void food() {
        System.out.println( "Обычно ест " + this.food);
    }
    public String getAnimalName(){
        return name;
    }


}
