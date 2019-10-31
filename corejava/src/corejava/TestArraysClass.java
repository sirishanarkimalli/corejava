package corejava;

import java.util.Arrays;

//Testing the Arrays class methods
public class TestArraysClass {

	public static void main(String[] args) {
		int arr[] = { 38, 0, 29, 10, 2 };
		int arr2[] = { 38, 0, 29, 10, 2 };
		System.out.println(Arrays.equals(arr, arr2));
		Arrays.sort(arr);
		// Printing array after sort
		System.out.println("The sorted Array :");
		for (int value : arr)
			System.out.print(value + " ");
		System.out.println();
		// Binary searches the array and returns index
		System.out.println(Arrays.binarySearch(arr, 29));
		System.out.println(Arrays.equals(arr, arr2));
	}

}
