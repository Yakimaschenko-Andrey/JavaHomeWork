package com.pb.yakimaschenko.hw7;

import com.pb.yakimaschenko.hw6.*;

import java.util.Arrays;

public class Atelier {
    public static void main(String[] args) {

        Tie tie = new Tie();
        Tshirt tshirt = new Tshirt();
        Skirt skirt = new Skirt();
        Pants pants = new Pants();
        Clothes[] clothes = new Clothes[]{tie,tshirt,skirt,pants};
        for(Clothes x : clothes){
            System.out.println(x);
        }



        System.out.println("Одеть мужчину: " + tie.toString());
        System.out.println("Одеть женщину: " + tshirt.toString());

        Size[] sizes = Size.values();
        System.out.println("All size: ");
        for (Size size:sizes){
            System.out.println(size);
        }
//        System.out.println(Arrays.toString(Size.values()));



        dressMan(clothes);
        dressWomen(clothes);


    }
   public static void dressMan(Clothes[] clothes){
       System.out.println("----------------------------------------");
       System.out.println("К мужской одежде относятся: " );
        for (Clothes clothes1: clothes){
            if (clothes1 instanceof Tie){
                System.out.println(clothes1);
            }
            if (clothes1 instanceof Tshirt){
                System.out.println(clothes1);
            }
            if (clothes1 instanceof Pants){
                System.out.println(clothes1);
            }
        }

        }


    static void dressWomen(Clothes[] clothes){
        System.out.println("----------------------------------------");
        System.out.println("К женской одежде относятся: ");
        for (Clothes clothes1: clothes){
            if (clothes1 instanceof Pants){
                System.out.println(clothes1);
            }
            if (clothes1 instanceof Tshirt){
                System.out.println(clothes1);
            }
            if (clothes1 instanceof Skirt){
                System.out.println(clothes1);
            }
        }
    }
}
