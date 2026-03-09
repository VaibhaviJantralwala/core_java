package basics;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check if its prime number or not : ");
		int n = sc.nextInt();
		
		int count = 0;
		
//		boolean isPrime = true;
		
		for(int i=1 ; i<=n ; i++) {
			
			if( n % i == 0 ) {
				count++;
//				isPrime = false;
//				break;
				System.out.print(i+" ");
			}
			
		}
		
//		if( isPrime ) {
//			System.out.print("\nIts a prime number");
//		}else {
//			System.out.print("\nNot a prime number");
//		}
		
		System.out.print("\ntotal factors : "+count);
		
		if(count == 2) {
            System.out.print("\nIts a prime number");
        } else {
            System.out.print("\nNot a prime number");
        }
		
		
		
	}
	
}
