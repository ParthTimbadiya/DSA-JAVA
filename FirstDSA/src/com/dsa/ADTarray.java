package com.dsa;

public class ADTarray {
	
	private int arr[];
	private int size;
	private int index;
	
	public ADTarray(int size) {
		this.size = size;
		this.arr = new int[this.size];
		this.index = 0;
		
	}
	
//	insert data
	
	public void insertData(int value) {
		if(index == this.size) {
			System.out.println("Array is full");
			return;
		}
		
		arr[index++] = value;
	}
	
//	delete data
	
	public void deleteData(int deleteIndex) {
		if(deleteIndex < 0 || deleteIndex >= index) {
			System.out.println("Invalid Index");
			return;
		}
		
		for(int i = deleteIndex; i < index - 1; i++) {
			arr[i] = arr[i + 1];
		}
	}
	
//	search element
	
	public int searchData(int value) {
		int indexResult = -1;
		
		for(int i = 0; i < index; i++) {
			if(arr[i] == value) {
				indexResult = i;
				break;
			}
		}
		return indexResult;
	}
	
//	get data
	
	public int getIndex(int getIndex) {
		
		if(getIndex < 0 || getIndex >= index) {
			System.out.println("Invalid Index");
			return -1;
		}		
		return arr[getIndex];
	}
	
//	traverse Array
	
	public void traverse() {
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
//	update data
	
	public void updateData(int updateIndex, int value) {
		if(updateIndex < 0 || updateIndex >= index) {
			System.out.println("Invalid Inde");
		}
		
		arr[updateIndex] = value;
	}
	
//	get size
	
	public int getSize() {
		return index;
	}

}
