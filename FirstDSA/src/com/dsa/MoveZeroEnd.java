package com.dsa;

import java.util.Arrays;

public class MoveZeroEnd {
	
	public static int[] moveZeroEndArray(int[] arr) {
		int n = arr.length;
		int index = 0; 

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}

		while (index < n) {
			arr[index++] = 0;
		}

		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {0, 52, 5, 6, 0, 48};
		
		int[] result = moveZeroEndArray(arr);
		System.out.println(Arrays.toString(result));
	}
}
