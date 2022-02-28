/**
 * Java 1. Homework #5
 * @author Aleksey Grechushkin
 * @version 28.02.2022
 */
package com.company;

public class HW_5 {
    public static void main(String[] args) {
        Sotrudnik[] sotrudniki = {
                new Sotrudnik("Alekseev Aleksey", "TeamLead", "AlAlekseev@gmail.com", "89991234567", 200000, 35 ),
                new Sotrudnik("Petrov Petr", "Analitics", "PePetrov@gmail.com", "89992345678", 100000, 33 ),
                new Sotrudnik("Sergeev Sergey", "IOS-Dev", "IOS_COOL@gmail.com", "89991122337", 150000, 25 ),
                new Sotrudnik("Foster Jane", "Andr-Dev", "JF@gmail.com", "89993212121", 150000, 26 ),
                new Sotrudnik("Thor Odinson", "QA", "Hammer@gmail.com", "89997777777", 100000, 41 ),
        };
        for (Sotrudnik i:sotrudniki){
            if (i.getAge()>40){
                System.out.println(i);
            }
        }
    }
}
