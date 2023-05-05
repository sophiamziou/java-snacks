package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("scegli un numero");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println("----------");
		for (int i=1; i<=num/2; i++) {
			
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(num);
	}
}
