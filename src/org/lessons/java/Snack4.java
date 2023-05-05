package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
    	
        String parola = scanner.next();
        String parolaInvertita = palindroma(parola);
        
        if (parolaInvertita.equals(parola)) {
            System.out.println("La parola è palindroma");
        } else {
            System.out.println("La parola non è palindroma");
        }
        
        scanner.close();
    }

    public static String palindroma(String parl) {
        String parola2 = new StringBuilder(parl).reverse().toString();
        return parola2;
    }
}
