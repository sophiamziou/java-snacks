package org.lessons.java;

import java.util.Arrays;

public class snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] arr1New = new Integer[arr1.length];
		Integer[] arr2New = new Integer[arr2.length];
		
		
		for(int i=1; i<arr1.length; i++) {
			arr1New[0] =arr2[0];
			arr1New[i] = arr1[i];
		}
		for(int i=1; i<arr2.length; i++) {
			arr2New[0] =arr1[0];
			arr2New[i] = arr2[i];
		}
		
		System.out.println(Arrays.asList(arr1New));
		System.out.println(Arrays.asList(arr2New));
	}
}
