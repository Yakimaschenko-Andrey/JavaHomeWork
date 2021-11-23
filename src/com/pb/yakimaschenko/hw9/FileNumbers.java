package com.pb.yakimaschenko.hw9;

import java.io.*;

public class FileNumbers {

    public static void main(String[] args) throws Exception {

       createNumbersFile();


    }

    public static void createNumbersFile() throws Exception{

        try(Writer writer = new FileWriter("D:\\Users\\dn260392jan1\\Desktop\\JAVA instal\\CURS\\HOME WORK\\numbers.txt")) {
            int[][] array = new int[10][10];
            for (int i = 0; i< array.length; i++,
                    System.out.println()){
                for (int j = 0; j < array.length; j++){
                    array[i][j] = ((int) (Math.random() * 99 + 1));
                    System.out.println(array[i][j] + " ");
                    writer.write(array[i][j] + " ");
                }
                writer.write("\n");
            }

        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: "+ e);
        }
    }

    public static void createOddNumbersFile() throws Exception{
        try(Reader reader = new FileReader("D:\\Users\\dn260392jan1\\Desktop\\JAVA instal\\CURS\\HOME WORK\\numbers.txt")) {

        }catch (Exception e) {
            System.out.println("Ошибка при чтении файла: "+ e);
        }

    }
}
