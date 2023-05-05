package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("scegli un numero");
		
		Random random = new Random();
		
		int N = scanner.nextInt();
		
		scanner.close();
		
		int sommaTotale = 0;
	    int sommaPari = 0;
	    int dispariLng = 0;
	    int minimo = Integer.MAX_VALUE;
	    int massimo = Integer.MIN_VALUE;
	    int sommaDispari = 0;
		
		System.out.println("numero scelto: " + N);
		int[] numeriCasuali = new int[N];
		for (int i = 0; i < N; i++) {
		    numeriCasuali[i] = random.nextInt(100) + 1;
		    
		    System.out.println("numero: " +numeriCasuali[i]);
		    
		    sommaTotale += numeriCasuali[i];
		    
		    if (numeriCasuali[i] % 2 == 0) {
                sommaPari += numeriCasuali[i];
            }
		    
            if (numeriCasuali[i] % 2 != 0) {
                dispariLng++;
                sommaDispari += numeriCasuali[i];
            }
            
            if (numeriCasuali[i] < minimo) {
                minimo = numeriCasuali[i];
            }
            
            if (numeriCasuali[i] > massimo) {
                massimo = numeriCasuali[i];
            }
		}
		
		System.out.println(dispariLng);
		
		double media = sommaTotale / N;
		
		if(dispariLng > 0) {
			double mediaDispari = sommaDispari / dispariLng;
			System.out.println("Media dei valori dispari: " + mediaDispari);
		}else {
			System.out.println("Non ci sono numeri dispari");
		}
		
		System.out.println("Somma di tutti i valori: " + sommaTotale);
        System.out.println("Somma dei valori pari: " + sommaPari);
        System.out.println("Media di tutti i valori: " + media);
        System.out.println("Minimo di tutti i valori: " + minimo);
        System.out.println("Massimo di tutti i valori: " + massimo);
	}
	

}
