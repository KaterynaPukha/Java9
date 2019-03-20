package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        do {
            while (b < 11) {
                System.out.print(b + " ");
                b++;
            }
            a++;
            System.out.println();
            b=1;
        }
        while (a < 5);
    }
}
