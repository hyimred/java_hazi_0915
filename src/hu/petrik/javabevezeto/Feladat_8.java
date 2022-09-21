package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fej vagy írás? (0 - fej || 1 - írás): ");
        int tipp = sc.nextInt();
        int gepDobas = (int)(Math.random() * 2);
        /*
        Egész szám generálása 'min' és 'max' között:
        (int)(Math.random() * (max-min+1))+min
         */
        System.out.printf("Dobás eredménye: %s\n", gepDobas == 0 ? "fej" : "írás");
        /*
        Háromlábú operátor
        (logikai_feltétel) ? értek_ha_a_feltétel_igaz : érték_ha_a_feltétel_hamis
         */
        if (gepDobas == tipp) {
            System.out.println("Gratulálok ön nyert");
        } else {
            System.out.println("Most nem nyert, próbálkozzon újra");
        }
    }
}