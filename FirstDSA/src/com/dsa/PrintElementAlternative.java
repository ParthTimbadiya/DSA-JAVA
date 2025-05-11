package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintElementAlternative {
	
	public static int[] printElementAlternativ(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				list.add(arr[i]);
			}
		}
		
		int result[] = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int[] result = printElementAlternativ(arr);
		
		System.out.println("Print Alternative Array : " + Arrays.toString(result));
		
	}

}
