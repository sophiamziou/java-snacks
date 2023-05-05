package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("quanto è lungo il raggio?");
		int r = scanner.nextInt();
		scanner.close();
		
		System.out.println("il raggio è di "+r+"cm");
		System.out.println("------------");
		
		float Area = r * r * 3.14f;
		System.out.println("l'area del cerchio è di "+Area+"cm2");
		float Perimetro = 2 * r + 3.14f;
		System.out.println("il perimetro del cerchio è di "+Perimetro+"cm");
	}
}
