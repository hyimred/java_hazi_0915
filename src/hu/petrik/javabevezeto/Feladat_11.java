package hu.petrik.javabevezeto;

import java.util.Scanner;
public class Feladat_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy pozitív egész számot: ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < N+1; i+=2) {
            sum += i;
        }

        System.out.println("Összeg: " + sum);
    }
}
