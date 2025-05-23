package com.dsa;

import java.util.Scanner;

public class CountElement {
	
	public static int countArrayElement(int[] arr, int target) {
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter array size : ");
		int size = scanner.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter element : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();			
		}
		
		System.out.println("Enter your target element : ");
		int target = scanner.nextInt();
		
		
		int countElement = countArrayElement(arr, target);
		System.out.println("Element "+ target +" in array are " + countElement + " time.");
		
	}

}
