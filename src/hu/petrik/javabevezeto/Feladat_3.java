package hu.petrik.javabevezeto;

import java.util.Scanner;
public class Feladat_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy pozitív valós számot: ");
        double szam = sc.nextDouble();

        int szam_kozelebb = 0;
        int szam_le = (int)Math.floor(szam);
        int szam_fel = (int)Math.floor(szam)+1;
        double szam_tort = szam-Math.floor(szam);

        if (szam - Math.floor(szam) < 0.5){
            szam_kozelebb = szam_le;
        } else {
            szam_kozelebb = szam_fel;
        }

        System.out.printf("A megadott szám a %d és a %d egész számok között van,\nés ezek közül a %d számhoz van közelebb.\nA szám egész része: %d \nA szám törtrésze: %.2f", szam_le, szam_fel, szam_kozelebb, szam_le, szam_tort);
    }

}
