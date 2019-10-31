package corejava;

import java.util.Scanner;

public class TestArrays {

	public static void main(String[] args) {
		
		int n=0;
		//array with size  5
		int arr1[]=new int[5];
		//array with initial values
		int[] arr2= {1,2,3,4};
		//array size modified
		int arr3[]= new int[n]; 
		arr3= new int[2];
		//2d array of variable 
		int arr4[][]=new int[3][];
		arr4[0]=new int[1];
		arr4[1]=new int [2];
		arr4[2]=new int[3];
		
		System.out.println("Enter n value : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		System.out.println("First array: \n");
		for(int i=0;i<5;i++) {
			arr1[i]=i+1;
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println(" ");
		
		System.out.println("Second array: \n");
		//Enhanced for loop
		for(int val:arr2)
			System.out.print(val+" ");
		
		System.out.println("Third array length: "+arr3.length);
	
		
		//2d Arrays
		int a[][]=new int [3][2];
		System.out.println(a.length+" "+a[0].length);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter the value: ");
				a[i][j]=s.nextInt();
			}
		}
		
	}

}
