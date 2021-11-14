package com.pb.yakimaschenko.hw7;

public abstract class Clothes {

    private String size;
//    private String size;
    private String color;
    private String coast;
    private String name;

    public Clothes(String size, String color, String coast, String name) {
        this.size = size;
        this.color = color;
        this.coast = coast;
        this.name = name;

    }


    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getCoast() {
        return coast;
    }

    public String getName() {
        return name;
    }
}
