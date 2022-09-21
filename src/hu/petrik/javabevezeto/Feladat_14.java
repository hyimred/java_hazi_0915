package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String szoveg = sc.nextLine();
        String menuPont = "";
        while (!menuPont.equals("f")) {
            System.out.println("Kérem adja meg mit szeretne elvégezni a szöveggel:");
            System.out.println("\ta - Nagy betűssé alakítani");
            System.out.println("\tb - Kis betűssé alakítani");
            System.out.println("\tc - Lekérdezni a hosszát");
            System.out.println("\td - Összehasonlítani egy másik szöveggel");
            System.out.println("\te - Egy részét kiiratni a szövegnek");
            System.out.println("\tf - Kilépni");
            System.out.print("Kérem adja meg az elvégzendő művelet betűjelét: ");
            menuPont = sc.nextLine().toLowerCase();
            switch (menuPont) {
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.printf("A szöveg hossza %d karakter\n", szoveg.length());
                    break;
                case "d":
                    System.out.print("Kérem adja meg a másik szöveg: ");
                    String masikSzoveg = sc.nextLine();
                    int osszehasonlitasEredmenye = szoveg.compareTo(masikSzoveg);
                    if (osszehasonlitasEredmenye == 0) {
                        System.out.println("A két szöveg megegyezik");
                    } else if (osszehasonlitasEredmenye < 0) {
                        System.out.println("Az első szöveg előrébb van az ABC-ben");
                    } else {
                        System.out.println("A második szöveg előrébb van az ABC-ben");
                    }
                    break;
                case "e":
                    System.out.print("Kérem adja meg az első kiiratandó karakter sorszámát: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Kérem adja meg az utolsó kiiratandó karakter sorszámát: ");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(szoveg.substring(a - 1, b));
                    break;
                case "f":
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Ilyen menüpont nem létezik");
                    break;
            }
        }
    }
}