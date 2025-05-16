package com.dsa;

public class MaxSubArray {
	
	public static int maxSubArray(int[] arr) {
		int maxSoFar = arr[0];
		int maxEndHear = arr[0];
		
		for(int i =1; i < arr.length; i++) {
			
			maxEndHear = Math.max(arr[i],maxEndHear + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndHear);
		}
		
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int maxSubArray = maxSubArray(arr);
		
		System.out.println("Maximum contiguous subarray sum is: "+maxSubArray);
	}

}
