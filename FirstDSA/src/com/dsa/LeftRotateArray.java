package com.dsa;

import java.util.Arrays;

public class LeftRotateArray {

	public static int[] leftRotateOnePosition(int[] arr) {
		int letf = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = letf;

		return arr;
	}

	public static int[] leftRotateArrayByGivenPosition(int arr[], int k) {
		int n = arr.length;
	    k = k % n;  
	    
	    int[] rotated = new int[n];
	    
	    
	    for (int i = 0; i < n - k; i++) {
	        rotated[i] = arr[i + k];
	    }
	    
	    
	    for (int i = 0; i < k; i++) {
	        rotated[n - k + i] = arr[i];
	    }
	    
	    return rotated;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int[] leftRotateOnePosition = leftRotateOnePosition(arr);
		System.out.println("left Rotate One Position : "+Arrays.toString(leftRotateOnePosition));
		
		
		int[] rotatedArr = leftRotateArrayByGivenPosition(arr, 2);
	    System.out.print("Rotated Array: ");
	    for (int num : rotatedArr) {
	        System.out.print(num + " ");
	    }
	}

}
