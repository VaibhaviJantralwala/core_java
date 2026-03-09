package basics;

import java.util.Scanner;

public class loopingJava {

	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter number to find sum :");
//		int n = sc.nextInt();
//		
//		int sum = 0;
//		for(int i=1 ; i<=n ; i++) {
//			sum = sum + i;
//		}
//		System.out.println("Sum : "+sum);
//		
//		System.out.println("Enter number to find Factorial :");
//		int n1 = sc.nextInt();
//		
//		int fact = 1;
//		for(int i=1 ; i<=n ; i++) {
//			fact= fact *  i;
//		}
//		System.out.println("Factorial : "+fact);
		
		System.out.println("Enter number to for Fibonacci series :");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1 ; i<=n-2 ; i++) {
			int sum = a + b;
			a = b ;
			b = sum ;
			System.out.print(sum+" ");
		}
	}
	
}
