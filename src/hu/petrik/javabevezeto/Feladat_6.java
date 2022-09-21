package hu.petrik.javabevezeto;

import java.util.Scanner;
public class Feladat_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a dolgozat pontszámát: ");
        int pontszam = sc.nextInt();

        if (pontszam < 0 || pontszam > 100) {
            System.out.println("Nincs ilyen pontszám");
        } else if (pontszam < 43) {
            System.out.println("Elégtelen");
        } else if (pontszam < 58) {
            System.out.println("Elégséges");
        } else if (pontszam < 73) {
            System.out.println("Közepes");
        } else if (pontszam < 88) {
            System.out.println("Jó");
        } else if (pontszam <= 100) {
            System.out.println("Jeles");
        } else {
            System.out.println("Nem egész számot írt be");
        }

    }

}
