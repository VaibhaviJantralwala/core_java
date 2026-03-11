package basics;

public class patterns {

	public static void main(String[] args) {
		
//		pattern1
//		for(int i=1 ; i<=5 ; i++) {
//			
//			for(int j=1 ; j<=i ; j++) {
//				
//				System.out.print("*"+" ");
//			}
//			
//			System.out.println();
//		}
		
//		pattern2
//		for(int i=5 ; i>=1 ; i--) {
//			
//			for(int j=1 ; j<=i ; j++) {
//				
//				System.out.print("*"+" ");
//			}
//			
//			System.out.println();
//		}
		
//		pattern3
//		for(int i=1 ; i<=5 ; i++) {
//			
//			for(int j=5 ; j>=i ; j--) {
//				
//				System.out.print("*"+" ");
//			}
//			
//			System.out.println();
//		}
		
//		pattern4
		int count = 0;
		for(int i=1 ; i<=5 ; i++) {
			
			for(int j=1 ; j<=i ; j++) {
				
				System.out.print((++count)+" ");
			}
			
			System.out.println();
		}
	}
	
}
