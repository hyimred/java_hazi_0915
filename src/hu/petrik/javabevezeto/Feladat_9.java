package hu.petrik.javabevezeto;

public class Feladat_9 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }
}