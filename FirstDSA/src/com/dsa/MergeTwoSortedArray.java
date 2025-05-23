package com.dsa;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	public static int[] mergeTwoSortedArray(int[][] arr) {
		
		int a[] = arr[0];
		int b[] = arr[1];
		int merge[] = new int[a.length + b.length];
		
		int i = 0,j = 0,k = 0;
		
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				merge[k++] = a[i++];
			}else {
				merge[k++] = b[j++];
			}
			
		}
		
		
		while(i < a.length) {
			merge[k++] = a[i++];
		}
		
		while(j < b.length) {
			merge[k++] = b[j++];
		}
		
		return merge;
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {{1,3,5},{2,4,6}};
		
		int[] mergeTwoSortedArray = mergeTwoSortedArray(arr);
		System.out.println("Merge Two Array in Sorted Order : " + Arrays.toString(mergeTwoSortedArray));
		
	}

}
