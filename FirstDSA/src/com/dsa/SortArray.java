package com.dsa;

import java.util.Arrays;

public class SortArray {
	
	public static int[] sortArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 58, 45, 65, 4, 44, 54};
		
		int[] sortedArray = sortArray(arr);
		
		System.out.println("Sorted array: " + Arrays.toString(sortedArray));
	}
}
