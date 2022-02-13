/**
 * Java 1. Homework #2
 * @author Aleksey Grechushkin
 * @version 14.02.2022
 */
package com.company;

public class HW_2 {
    public static void main(String[] args){
        System.out.println("Task 1");
        System.out.println();
        System.out.println(isSumBetween10to20(9, 5)); //сумма в пределах от 10 до 20
        System.out.println(isSumBetween10to20(9, 15)); //сумма не в пределах от 10 до 20
        System.out.println();
        System.out.println("Task 2");
        System.out.println();
        isPosOrNeg(19); //положительное
        isPosOrNeg(-4); //отрицательное
        System.out.println();
        System.out.println("Task 3");
        System.out.println();
        System.out.println(isNeg(4)); //положительное
        System.out.println(isNeg(-139)); //отрицательное
        System.out.println();
        System.out.println("Task 4");
        System.out.println();
        StringPerCount( "It's cool task",3);
        System.out.println();
        System.out.println("Task 5");
        System.out.println();
        System.out.println(SpecialYears(1000)); //каждый 100й год
        System.out.println(SpecialYears(2000)); // каждый 400й год
        System.out.println(SpecialYears(2024)); // каждый 4й год
    }
    static boolean isSumBetween10to20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void isPosOrNeg(int a) {
        System.out.println (a>=0 ? "This is positive: "+a : "This is negative: "+ a);
    }

    static boolean isNeg(int a) {
        return a < 0;
    }

    static void StringPerCount(String str, int n) {
        for (int i=0; i<n; i++ ) {
            System.out.println(str);
        }
    }

    static boolean SpecialYears(int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }
}
