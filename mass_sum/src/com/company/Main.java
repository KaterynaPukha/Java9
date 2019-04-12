package com.company;

import static java.lang.Math.incrementExact;
import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        int k=0;
        int mass[];
        mass = new int[10];
        for (int i = 0; i < mass.length ; i++) {
            mass[i]= (int)(random()*200)-100;
            System.out.print(i +" ");

            if (mass [i]<0){
            k++;
            }
        }
        System.out.println();
        System.out.println("Сумма отрицательных чисел равна "+ k);
    }
}
