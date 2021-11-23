package com.pb.yakimaschenko.hw9;

import java.io.*;
import java.util.Scanner;

public class FileNumbers {

    public static void main(String[] args) throws Exception {

       createNumbersFile();
       createOddNumbersFile();


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
        try (Scanner in = new Scanner(new File("D:\\Users\\dn260392jan1\\Desktop\\JAVA instal\\CURS\\HOME WORK\\numbers.txt"))) {
            PrintWriter printWriter = new PrintWriter(new File("D:\\Users\\dn260392jan1\\Desktop\\JAVA instal\\CURS\\HOME WORK\\odd-numbers.txt"));
            System.out.println("Заменить все четные числа на 0:");
            while (in.hasNextLine()) {
                Scanner scan = new Scanner(in.nextLine());
                while (scan.hasNextInt()) {
                    int change = scan.nextInt();
                    if (change % 2 == 0) {
                        System.out.println("0");
                        change = 0;
                    } else
                        System.out.println(change + " ");
                    printWriter.println(change + " ");
                }
                scan.close();
               // printWriter.println();

            }
            System.out.println();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e);
        }

    }
}
