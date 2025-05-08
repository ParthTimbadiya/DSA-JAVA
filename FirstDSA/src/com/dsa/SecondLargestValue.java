package com.dsa;

public class SecondLargestValue {
	
	private static int secondLargestElement(int[] arr) {
		
		int largest = arr[0];
		int secondLargest = arr[1];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
				
			}
		}
		
		
		return secondLargest;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,33,40,5,6};
		
		int secondLargestElement = secondLargestElement(arr);
		System.out.println(secondLargestElement);
	}

	

}
