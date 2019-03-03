package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int u = num.nextInt();
        for (int k = 1; k <= u ; k++) {
            boolean l = u % k == 0;
            int summ = 0;
            if (l) {
                summ = summ + 1;
                System.out.println( summ );
            }
        }

    }
}
