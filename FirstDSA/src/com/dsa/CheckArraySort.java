package com.dsa;

public class CheckArraySort {
	
	public static boolean checkArraySorted(int[] arr) {
		
		boolean flag = true;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				flag = false;				
			}
		}
		
		return flag;
		
	}
	
	public static void main(String[] args) {
//		int arr[] = {1,2,3,4,5,6};
		int arr[] = {1,22,13,41,5,16};
		
		boolean checkArraySorted = checkArraySorted(arr);
		
		if (checkArraySorted) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}
		
	}

}
