package com.dsa;

public class SumElement {
	
	public static int findTheSumOfElement(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int result = findTheSumOfElement(arr);
		
		System.out.println("Sum of element : " + result);
	}

}
