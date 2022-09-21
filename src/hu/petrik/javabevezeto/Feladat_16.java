package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;
public class Feladat_16 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] tomb = {0,0,0,0,0};

        for (int i = 0; i < 5; i++) {
            System.out.print("Adjon meg öt számot: ");
            tomb[i] = sc.nextInt();
        }
        System.out.print("Növekvő: " );
        for (int i = 0; i < 5; i++) {
            System.out.print(tomb[i] + ", ");
        }
        System.out.print("\nCsökkenő: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(tomb[i] + ", ");
        }
        System.out.print("\nMinden második: ");
        for (int i = 0; i < 5; i+=2) {
            System.out.print(tomb[i] + ", ");
        }
        System.out.println();
        System.out.print("Adja meg a sorszámot: ");
        int beker = sc.nextInt();
        System.out.println(beker + ". szám: " + tomb[beker-1]);

    }
}
