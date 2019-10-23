package corejava;

import java.util.Scanner;

public class ArraySearchingTechniques {

	int arr[] = new int[10];

	public void initArray() {
	}

	public int linearSearch(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public int binarySearch(int[] arr, int n, int mid, int l, int r) {
		if (arr[mid] == n)
			return mid;
		else if (n < arr[mid]) {
			int m = (mid - 1) / 2;
			binarySearch(arr, n, m, 0, mid - 1);
		} else {
			int m = (mid - 1) / 2;
			binarySearch(arr, n, m, m + 1, r);
		}

		return -1;
	}

	public static void main(String[] args) {
		ArraySearchingTechniques ast = new ArraySearchingTechniques();

		Scanner s = new Scanner(System.in);
		int arr[] = new int[6];
		int n;

		// Initializing the array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value: ");
			arr[i] = s.nextInt();
		}

		System.out.println("Enter the value to search: ");
		n = s.nextInt();

//		// linearSearch
//		int index = ast.linearSearch(arr, n);
//		if (index != -1) {
//			System.out.println(n + " is found at " + index);
//		} else
//			System.out.println("Match Not Found");
//		
		//BinarySearch
		int mid =arr.length/2;
		System.out.println(mid);
//		int index=ast.binarySearch(arr, n, mid, mid-1, n-1);
//		if (index != -1) {
//			System.out.println(n + " is found at " + index);
//		} else
//			System.out.println("Match Not Found");
	}

}
