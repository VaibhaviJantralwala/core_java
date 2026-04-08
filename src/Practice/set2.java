package Practice;

import java.util.Scanner;

class BankAcc extends Exception{
	public BankAcc(String s) {
		super(s);
	}	
}

class StudentException extends Exception{
	public StudentException(String s) {
		super(s);
	}
}

class Student{
	int rollno,age;
	String name,course;
	public Student(int rollno,int age,String name,String course) throws StudentException {
		this.rollno = rollno;
			if( !(age > 15 && age<21) ) {
				throw new StudentException("AgeNotWithinRangeException");
			}
		this.age = age;		
			if(!name.matches("[a-zA-Z]+")) {
				throw new StudentException("NameNotValidException");
			}
		this.name = name;
		this.course = course;
	}
}


public class set2 {

	public static void q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			int div = n1 / n2;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void q2() {
		int n1 = 10;
		int n2 = 0;
		int[] a = new int[3];
		try {
			a[4] = 89;
			int div = n1 / n2;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
	public static void q3() {
		int n1 = 10;
		int n2 = 0;
		int[] a = new int[3];
		try {
			try {
				a[4] = 89;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			int div = n1 / n2;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers ( > 10 and < 40 ) : ");
		for(int i=1 ; i<=10 ; i++) {
			int n = sc.nextInt();
				if( n < 10 || n > 40) {
					try {
					throw new Exception("Invalid number");
					}catch(Exception e) {
						System.out.println(e);
					}
				}else {
					System.out.println(n);
				}
		}
	}
	
	public static void q5() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			if(num < 18) {
				throw new ArithmeticException("Invalid Age");
			}else {
				System.out.println("Welcome to vote");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}
	
	public static void q6() {
		int balance = 2000;
		Scanner sc = new Scanner(System.in);
		int am = sc.nextInt();
		try {
			if( am > balance ) {
				throw new BankAcc("Sorry, insufficient balance");
			}else {
				balance -= am;
				System.out.println("Remaining balance : "+balance);
			}
		}
		catch(BankAcc e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
//		q1();
//		q2();
		
		//q3
//		try {
//			int n1 = Integer.parseInt(args[0]);
//			int n2 = Integer.parseInt(args[1]);
//			System.out.println(n1/n2);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
		
//		q4();
		
		try {
			Student s1 = new Student(2, 20, "vaibhavi", "java");
			Student s = new Student(1, 22, "vid@h", "java");
		}
		catch(StudentException e) {
			System.out.println(e.getMessage());
		}
		
//		q5();
		
//		q6();
		
		
		
	}
}
