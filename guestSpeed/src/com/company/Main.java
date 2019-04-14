package com.company;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {
        int k = 0;
        int o=0;
        int max = 0;
        int min = 1000;
        String mass1[] = {"Рубан", "Ткаченко", "Соловей", "Гончаренко", "Степаненко", "Коваль", "Шевченко", "Романюк", "Котовский", "Огневич"};

        System.out.println("Скорость чтения учеников 4-Б класса (слов в мининуту): ");
        int mass2[];
        mass2 = new int[10];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = (int) (random() * 250) + 50;
            System.out.println(mass2[i]);

                for (int a = 1; a < 11; a++) {
                    if (mass2[i] > max) {
                        max = mass2[i];
                        k = i;
                    }
                    if (mass2[i] < min) {
                        min=mass2[i];
                        o=i;
                    }
                }
        }

        System.out.println();
        System.out.println("Наибольшая скорость чтения у учинека(ученицы) по фамилии "+ mass1[k] + " - " +max + " слов в минуту");
        System.out.println("Наименьшая скорость чтения у ученика(ученицы) по фамилии "+ mass1[o]+ " - " + min+ " слов в минуту ");

    }
}
