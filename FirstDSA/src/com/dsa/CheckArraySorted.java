package com.dsa;

public class CheckArraySorted {
	
	public static boolean arrayIsSorted(int []arr) {
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,22,3,4,5,6,7,8,9};
		boolean result = arrayIsSorted(arr);
		System.out.println("Is an array sorted : " + result);
		
	}

}
