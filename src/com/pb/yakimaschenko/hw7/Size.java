package com.pb.yakimaschenko.hw7;


public enum Size {
    XXS("XXS - Детский размер", 32),
    XS("XS - Взрослый размер",34),
    S("S - Взрослый размер",36),
    M("M - Взрослый размер",38),
    L("L - Взрослый размер",40);

    private String description;
    private Integer euroSize;

    Size(String description, Integer euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }


    public void getDescription(){
    }

    public void getEuroSize(){
    }


//    @Override
//    public String toString() {  return super.toString();
//    }

    @Override
    public String toString() {
        return "size{" +
                "description='" + description + '\'' +
                "euroSize='" + euroSize + '\'' +
                '}';
    }
}
