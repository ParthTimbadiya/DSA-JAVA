package com.dsa;

public class SecondSmallest {
	
	public static int secondSmallest(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr[1];
	}
	
	public static void main(String[] args) {
		int arr[] = {25,86,45,61,23,15,64};
		
		int secondSmallest = secondSmallest(arr);
		System.out.println("Second largets Element : " + secondSmallest);
	}

}
