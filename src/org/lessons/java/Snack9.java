package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("quanto è lunga la base?");
		int b = scanner.nextInt();
		System.out.println("quanto è lunga l'altezza?");
		int h = scanner.nextInt();
		scanner.close();
		System.out.println("la base è di "+b+"cm");
		System.out.println("l'altezza è di "+h+"cm");
		System.out.println("------------");
		
		int Area = b * h;
		System.out.println("l'area del rettangolo è di "+Area+"cm2");
		int Perimetro = 2*b + 2*h;
		System.out.println("il perimetro del rettangolo è di "+Perimetro+"cm");
	}
}
