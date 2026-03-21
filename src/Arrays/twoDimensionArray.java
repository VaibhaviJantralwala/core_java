package Arrays;

import java.util.Scanner;

public class twoDimensionArray {

	public twoDimensionArray(){
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0 ; i<3 ; i++) {
			
			for(int j=0 ; j<3 ; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
	
	void twoDimInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size : ");
		int row = sc.nextInt();
		
		System.out.println("Enter column size : ");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		for(int i=0 ; i<row ; i++) {
			
			for(int j=0 ; j<col ; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0 ; i<row ; i++) {
			
			for(int j=0 ; j<col ; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		twoDimensionArray t = new twoDimensionArray();
		
		t.twoDimInput();
		
	}
	
}
