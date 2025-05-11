package com.dsa;

public class MinElementArray {
	
	public static int findMinElement(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (max > arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,0,20,30,50,46,8,59,70,5};
		int result = findMinElement(arr);
		
		System.out.println(result + " Min element in array");
	}

}
