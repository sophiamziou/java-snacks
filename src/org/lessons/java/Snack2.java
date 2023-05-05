package org.lessons.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
        String[] nomi = { "Marco", "Sophia", "Maria", "Antonio", "Luigi", "Alessandro", "Federico", "Claudio" };
        String[] cognomi = { "Rossi", "Russo", "Battaglia", "Mastromartello", "Di Maggio", "Renzi", "Salvini", "Fontana"};

        Random random = new Random();

        System.out.println("Lista degli invitati:");
        for (int i = 0; i < 10; i++) {
            int nomeIndex = random.nextInt(nomi.length);
            int cognomeIndex = random.nextInt(cognomi.length);

            String nome = nomi[nomeIndex];
            String cognome = cognomi[cognomeIndex];

            System.out.println(nome + " " + cognome);
        }
    }
}
