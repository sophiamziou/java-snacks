package org.lessons.java;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Snack8 {
	public static void main(String[] args) {
		Random N = new Random();
		
		int numRnd = 0;
		ArrayList<Integer> pari = new ArrayList<Integer>();
        ArrayList<Integer> dispari = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			numRnd = N.nextInt(100) + 1;
			if (numRnd % 2 == 0) {
				pari.add(numRnd);
			}else {
				dispari.add(numRnd);
			}
		}
	    System.out.println(Arrays.toString(pari.toArray()));
	    System.out.println(Arrays.toString(dispari.toArray()));
	}
}