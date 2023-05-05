package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] numeri = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };

        int somma = 0;
        for (int i = 0; i < numeri.length; i += 2) {
            somma += numeri[i];
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + somma);
    }
}
