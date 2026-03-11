package basics;

import java.util.Scanner;

public class basics {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter 1st Number :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number :");
		int n2 = sc.nextInt();
		
		int sum = n1+n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		
		System.out.println("Addition : "+sum);
		System.out.println("Subtraction : "+sub);
		System.out.println("Multiplication : "+mul);
		System.out.println("Division : "+div);
		
	}	
}
