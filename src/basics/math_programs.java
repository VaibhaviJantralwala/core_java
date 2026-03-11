package basics;

public class math_programs {

	public static void main(String args[]) {
	
//		Armstrong number check
//		int num = 378;
//		int temp = num;
//		int armNum = 0;
//		
//		while( num != 0 ) {
//			int digit = num % 10;
//			armNum += digit * digit * digit;
//			num = num / 10;
//		}
//		if( armNum == temp ) {
//			System.out.println("Armstrong Number");
//		}else {
//			System.out.println("Not Armstrong Number");
//		}
		
//		reverse num and palindrome
		int num = 121;
		int rev = 0;
		int temp = num;
		while( num != 0 ) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println(rev);
		if( rev == temp ) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
}
