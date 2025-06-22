package com.dsa.stack;

public class ReverseStringInStack {
	
	public static String reverseString(String str) {
		
		StackwithArray stack = new StackwithArray(str.length());
		
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		String s1 = "";
		while(!stack.isEmpty()) {
			int as = stack.pop();
			s1 += (char) as;
		}
		
		return s1;
	}
	
	public static void main(String[] args) {
		String reverseString = reverseString("parth");
		System.out.println(reverseString);
	}

}
