package com.dsa;

public class ArrayOperation {
	
	public static void main(String[] args) {
		ADTarray adt = new ADTarray(5);
		
		adt.insertData(10);
		adt.insertData(20);
		adt.insertData(30);
		adt.insertData(40);
		
		System.out.println("Size of array : " + adt.getSize());
		
		adt.traverse();
		
		adt.updateData(0, 100);
		
		adt.traverse();
	
		
	}

}
