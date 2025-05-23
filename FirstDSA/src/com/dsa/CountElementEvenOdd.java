package com.dsa;

public class CountElementEvenOdd {
	
	public static int[] countElementEvenOdd(int []arr) {
		int even = 0,odd = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		
		return new int[] {even,odd};
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int[] result = countElementEvenOdd(arr);
		
		System.out.println("Even Number of element : " + result[0]);
		System.out.println("Odd Number of element : " + result[1]);
	}
}
