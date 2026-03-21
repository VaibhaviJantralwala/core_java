package Arrays;

import java.util.Scanner;

public class arrays {

	public arrays() {
		
		int arr[] = {1,2,3,4,5,6};
		
		for(int i=0 ; i<arr.length ; i++) {
			
			System.out.println(arr[i]);
		}
		
	}
	
	void arrays() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		// copy array
		int arr1[] = new int[size];
		
		for(int i=0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
			arr1[i] = arr[i];
		}
		
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//max
		int max = arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("\nmax : "+max);
		System.out.println();
		
		//rev
		for(int i=size-1 ; i>=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
		
		//sum of all elements
		int sum = 0;
		for(int i=0 ; i<size ; i++) {
			sum += arr[i];
		}
		System.out.println("\nSum of array elements : "+sum);
			
	}
	
	
	public static void main(String[] args) {
		
		arrays a = new arrays();
		
		a.arrays();
		
	}
	
	
}
