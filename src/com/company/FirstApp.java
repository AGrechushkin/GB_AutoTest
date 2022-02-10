package com.company;
public class FirstApp {
    public static void main (String[] args){
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a=326;
        int b=100;
        System.out.println(a+b>=0? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor(){
        int value=6;
        if (value <=0) {
            System.out.println("Красный");
        }
        if (value >0 && value<=100) {
            System.out.println("Желтый");
        }
        if (value >100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a=16;
        int b=190;
        System.out.println(a>=b? "a>=b" : "a<b");
    }
}