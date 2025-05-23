package com.dsa;

public class LinearSearch {

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int result = linearSearch(arr, 50);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(result + " element found in array");
        }
    }
}
