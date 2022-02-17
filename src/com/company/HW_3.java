/**
 * Java 1. Homework #3
 * @author Aleksey Grechushkin
 * @version 17.02.2022
 */
package com.company;
import java.util.Arrays;

public class HW_3 {
    public static void main(String[] args) {
        invMass();
        System.out.println();
        emptyMass ();
        System.out.println();
        compareMass ();
        System.out.println();
        matMass ();
        System.out.println();
        System.out.println(Arrays.toString(omeMass (10,4)));
        System.out.println();
        minMaxMass ();
    }

    static void invMass (){
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Task 1");
        System.out.println(Arrays.toString(mass)); //Массив в исходном состоянии
        for (int i=0; i<mass.length; i++){
            if (mass[i] == 1) {
                mass[i]=0;
            }
            else{
                mass[i]=1;
            }
        }
        System.out.println(Arrays.toString(mass)); //Инвертированный массив
    }

    static void emptyMass (){
        int[] massive = new int [100];
        System.out.println("Task 2");
        System.out.println(Arrays.toString(massive)); //Массив в исходном состоянии
        for (int i=0; i<massive.length; i++){
            massive[i]=i+1;
        }
        System.out.println(Arrays.toString(massive)); //заполненый массив
    }

    static void compareMass (){
        int[] c_mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Task 3");
        System.out.println(Arrays.toString(c_mass)); //Массив в исходном состоянии
        for (int i=0; i<c_mass.length; i++){
            if (c_mass[i] < 6) {
                c_mass[i]=c_mass[i]*2;
            }
        }
        System.out.println(Arrays.toString(c_mass)); //Массив после сравнени и умножения всех чисел меньше 6 на 2
    }

    static void matMass (){
        int n=5;
        int[][] matrix = new int[n][n];
        System.out.println("Task 4");
        for (int i=0; i<n; i++){
            matrix[i][i]=1;
            matrix[i][n-1-i]=1;
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[] omeMass (int len, int initialValue){
        int[] arr = new int[len];
        System.out.println("Task 5");
        Arrays.fill(arr, initialValue);
        return arr;
    }

    static void minMaxMass (){
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int min=array[0], max=array[0];
        System.out.println("Task 6");
        System.out.println(Arrays.toString(array)); //Массив в исходном состоянии
        for (int i=1; i<array.length; i++){
            if (array[i] < min) {
                min=array[i];
            }
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Минимальное значение в массиве: "+min);
        System.out.println("Максимальное значение в массиве: "+max);
    }
}