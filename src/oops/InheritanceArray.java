package oops;

import java.util.Scanner;

class Admin{
	Scanner sc = new Scanner(System.in);
	int admin_arr_size ;
	int adminId[] ;
	String adminName[] ;
	
	public Admin() {
		System.out.println("Enter admin Array size : ");
		admin_arr_size = sc.nextInt();
		adminId = new int[admin_arr_size];
		adminName = new String[admin_arr_size];
		
		System.out.println("Enter Admin ID and Admin Name : ");
		
		for(int i=0 ; i<admin_arr_size ; i++) {
			
			adminId[i] = sc.nextInt();
			adminName[i] = sc.next();
			
		}
	}
	
	void display() {
		
		for(int i=0 ; i<admin_arr_size ; i++) {
			System.out.println(adminId[i]+" : "+adminName[i]);
		}
	}
	
}

class Teacher extends Admin{
	
	int teacher_arr_size;
	int teacherId[];
	String teacherName[];
	
	public Teacher() {
		
		System.out.println("Enter teacher Array size : ");
		teacher_arr_size = sc.nextInt();
		teacherId = new int[teacher_arr_size];
		teacherName = new String[teacher_arr_size];
		
		System.out.println("Enter Teacher ID and Teacher Name : ");
		
		for(int i=0 ; i<teacher_arr_size ; i++) {
			
			teacherId[i] = sc.nextInt();
			teacherName[i] = sc.next();
			
		}
	}
	
	void display() {
		super.display();

		for(int i=0 ; i<teacher_arr_size ; i++) {
			System.out.println(teacherId[i]+" : "+teacherName[i]);
		}
	}
	
}




public class InheritanceArray {

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.display();
	}
		
	
	
	
}
