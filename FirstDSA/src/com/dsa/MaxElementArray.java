package com.dsa;

public class MaxElementArray {
	
	public static int findMaxElement(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,50,46,8,59,70,5};
		int result = findMaxElement(arr);
		
		System.out.println(result + " Max element in array");
	}

}
