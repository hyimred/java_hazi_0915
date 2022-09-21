package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;
public class Feladat_13 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        int random = new Random().nextInt(100) + 1;
        int counter = 0;

        while (true) {
            System.out.print("Tippelj egy számot 1 és 100 között : ");

            Scanner sc = new Scanner(System.in);
            int tipp = sc.nextInt();

            counter++;

            if (tipp > random) {
                System.out.println("A szám kissebb, mint " + tipp);
            } else if (tipp < random) {
                System.out.println("A szám nagyobb, mint " + tipp);
            } else {
                System.out.println("Gratulálok, nyertél! Tippek száma: " + counter);
                break;
            }
        }
    }
}
