package com.pb.yakimaschenko.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String strong; //сила
    private String speed;  //скорость

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
    @Override
    public String toString() {
        return "Конь{" + " по имени: " + getName() +
                ", локация обитания: " + getLocation() +
                ", рацион: " + getFood() + "}"
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getFood(), animal.getFood()) && Objects.equals(getLocation(), animal.getLocation()) && Objects.equals(getName(), animal.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFood(), getLocation(), getName());
    }


}
