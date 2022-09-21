package hu.petrik.javabevezeto;

import java.util.Scanner;
public class Feladat_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a háromszög 'a' oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Kérem adja meg a háromszög 'b' oldalát: ");
        double b = sc.nextDouble();
        System.out.print("Kérem adja meg a háromszög 'c' oldalát: ");
        double c = sc.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double kerulet = a+b+c;
            System.out.printf("A háromszög kerülete: %f", kerulet);
        } else {
            System.out.println("Hibás adatokat adott meg");
        }

    }
}