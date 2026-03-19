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
		
		for(int i=0 ; i<size ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<size ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		arrays a = new arrays();
		
		a.arrays();
		
	}
	
	
}
