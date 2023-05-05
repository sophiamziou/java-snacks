package org.lessons.java;

import java.util.Random;

public class Snack7 {
	
	public static void main(String[] args) {
		Random N = new Random();
		
		int numRnd = 0;
		
		do {
			numRnd = N.nextInt(100) + 1;
			System.out.println(numRnd);
		} while (numRnd % 3 != 0 || numRnd % 5 != 0);

	}
	
}
