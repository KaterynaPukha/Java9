package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите длину: ");
        int x = ch.nextInt();
        System.out.println("Введите ширину: ");
        int y = ch.nextInt();
        boolean a = x == y;
        if (a){
            System.out.println("Это квадрат");
        }
        else{
            System.out.println("Это прямоугольник");
        }

    }
}
