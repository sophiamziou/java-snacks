package org.lessons.java;
import java.util.Random;
import java.util.Scanner;
public class Snack6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dimmi il valore limite:");
		int limite = scanner.nextInt();
		scanner.close();

		int somma = 0;
		
		Random random = new Random();
		
		while (somma < limite) {
			
			int numeriCasuali = random.nextInt(100) + 1;
			System.out.println(numeriCasuali);
			
			somma += numeriCasuali;
		}

		System.out.println("somma: " + somma);
	}
}
