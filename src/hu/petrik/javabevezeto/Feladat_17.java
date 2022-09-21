package hu.petrik.javabevezeto;

import java.util.Scanner;
public class Feladat_17 {
    public static void main(String[] args) {
        double[] tomb1 = {26.3,11.4,91.0,34.2,76.9};
        double[] tomb2 = {32.1,10.5,83.7,3.6,99.99};
        double[] tomb3 = {0,0,0,0,0};

        for (int i = 0; i < 5; i++) {
            tomb3[i] = tomb1[i]+tomb2[i];
            System.out.print(tomb3[i] + ", ");
        }

    }
}

