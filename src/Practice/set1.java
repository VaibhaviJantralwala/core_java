package Practice;

import java.net.PortUnreachableException;

import java.util.Scanner;

class PrintNumber{
	public void printNum(int n) {
		System.out.println("Integer : "+n);
	}
	public void printNum(float n) {
		System.out.println("Float : "+n);
	}
	public void printNum(char n) {
		System.out.println("Character : "+n);
	}
	
	public void Method1(int i,String s) {
		System.out.println(i+" "+s);
	}
	public void Method2(String s,int i) {
		System.out.println(s+" "+i);
	}
}

//class Area{
//	public void area(int length) {
//		System.out.println("Area of Square : "+length*length);
//	}
//	public void area(int length,int breadth) {
//		System.out.println("Area of Rectangle : "+length*breadth);
//	}
//}

class Parent{
	public void method() {
		System.out.println("Parent Class");
	}
}
class child1 extends Parent{
	public void method() {
		System.out.println("Child1 Class");
	}
}

class Member{
	String name;
	int age;
	long phoneNum;
	String Address;
	double salary;
	
	public void printSalary(double salary) {
		this.salary = salary;
		System.out.println("Salary : "+salary);
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Contact Number : "+phoneNum);
		System.out.println("Address : "+Address);
		printSalary(salary);
	}
	
}
class Employee extends Member{
	String specialization;
	public Employee(String name,int age,String Address,long phoneNum,double salary,String specialization) {
		this.name = name;
		this.age = age;
		this.Address = Address;
		this.phoneNum = phoneNum;
		this.salary = salary;
		this.specialization = specialization;
	}
	@Override
	public void display() {
		System.out.println("--- Employee Details ---");
		super.display();
		System.out.println("Speacialization : "+specialization);
	}
}
class Manager extends Member{
	String department;
	public Manager(String name,int age,String Address,long phoneNum,double salary,String department) {
		this.name = name;
		this.age = age;
		this.Address = Address;
		this.phoneNum = phoneNum;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public void display() {
		System.out.println("--- Manager Details ---");
		super.display();
		System.out.println("Department : "+department);
	}
}

//class Rectangle{
//	int length;
//	int breadth;
//	public Rectangle(int len,int breadth) {
//		this.length = len;
//		this.breadth = breadth;
//	}
//	public void area() {
//		System.out.println("Area : "+length*breadth);
//	}
//	public void perimeter() {
//		System.out.println("Perimeter : "+2*(length+breadth));
//	}
//}
//class Square extends Rectangle{
//	public Square(int len) {
//		super(len,len);
//	}
//}
//
//class Triangle{
//	int a,b,c;
//	public void setValues(int a,int b,int c) {
//		this.a = a;
//		this.b= b;
//		this.c = c;
//	}
//	public void area() {
//		double s = ( a + b + c )/2;
//		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c) );
//		System.out.println("Area : "+area);
//	}
//	public void perimeter() {
//		System.out.println("Perimeter : "+(a+b+c));
//	}
//}

class Complex{
	int r1,i1;
	int r2,i2;
	
	public void TakeNumbers() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter real part of complex numbers : ");
		System.out.println("for number 1 : ");
		int r1 = sc.nextInt();
		this.r1 = r1;
		System.out.println("for number 2 : ");
		int r2 = sc.nextInt();
		this.r2 = r2;
		System.out.println();
		
		System.out.println("Enter imaginary part of complex numbers : ");
		System.out.println("for number 1 : ");
		int i1 = sc.nextInt();
		this.i1 = i1;
		System.out.println("for number 2 : ");
		int i2 = sc.nextInt();
		this.i2 = i2;
		
		System.out.println("Complex numbers : ");
		System.out.println(r1+" + "+i1+"i");
		System.out.println(r2+" + "+i2+"i");
	}
	public void sum() {
		int real = r1+r2;
		int imag = i1+i2;
		System.out.println("Sum = "+real+" + "+"i"+imag);
	}
	public void difference() {
		 int real = r1 - r2;
	     int imag = i1 - i2;
	     System.out.println("Difference = " + real + " + i" + imag);
	}
	public void product() {
		int real = (r1 * r2) - (i1 * i2);
        int imag = (r1 * i2) + (r2 * i1);
        System.out.println("Product = " + real + " + i" + imag);
	}
}

abstract class parent{
	public abstract void message();
}
class C1 extends parent{
	@Override
	public void message() {
		System.out.println("Child 1 method");
	}
}
class C2 extends parent{
	@Override
	public void message() {
		System.out.println("Child 2 method");
	}
}

abstract class Bank{
	public abstract void getBalance();
}
class BankA extends Bank{
	int balance = 100;
	@Override
	public void getBalance() {
		System.out.println("Balance in Bank A : "+balance);	
	}
}
class BankB extends Bank{
	int balance = 150;
	@Override
	public void getBalance() {
		System.out.println("Balance in Bank B : "+balance);	
	}
}
class BankC extends Bank{
	int balance = 200;
	@Override
	public void getBalance() {
		System.out.println("Balance in Bank C : "+balance);	
	}
}

abstract class Marks{
	public abstract void getPercentage();
}
class A extends Marks{
	int sub1,sub2,sub3;
	public A(int sub1,int sub2,int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	@Override
	public void getPercentage() {
		double pr = ((sub1+sub2+sub3)/300.0)*100;
		System.out.println("Percentage : "+pr);
	}
}
class B extends Marks{
	int sub1,sub2,sub3,sub4;
	public B(int sub1,int sub2,int sub3,int sub4) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	@Override
	public void getPercentage() {
		double pr = ((sub1+sub2+sub3+sub4)/400.0)*100;
		System.out.println("Percentage : "+pr);
	}
}

//abstract class Shape{
//	public abstract void rectangleArea(int l,int b);
//	public abstract void squareArea(int l);
//	public abstract void circleArea(int r);
//}
//class Area extends Shape{
//	@Override
//	public void rectangleArea(int l, int b) {
//		System.out.println("Area of Rectangle : "+l*b);
//	}
//	@Override
//	public void squareArea(int l) {
//		System.out.println("Area of Square : "+l*l);	
//	}
//	@Override
//	public void circleArea(int r) {
//		 System.out.println("Area of Circle : "+(3.14)*r*r);	
//	}
//}

class Shape{
	public void method() {
		System.out.println("This is a shape");
	}
}
class Rectangle extends Shape{
	@Override
	public void method() {
		System.out.println("This is rectangle");
	}
}
class circle extends Shape{
	@Override
	public void method() {
		System.out.println("This is circle");
	}
}
class square extends Rectangle{
	@Override
	public void method() {
		System.out.println("Square is rectangle");
	}
}


public class set1 {
	
	static void interleave(String s1,String s2,String result) {
		if( s1.length() == 0 && s2.length() == 0 ) {
			System.out.println(result);
			return;
		}
		
		if( s1.length() > 0 ) {
			interleave(s1.substring(1), s2, result+s1.charAt(0));
		}
		
		if( s2.length() > 0 ) {
			interleave(s1, s2.substring(1), result+s2.charAt(0));
		}
	}
	
	static void MostFrequentChar(String s) {
		int max = 0;
		char result = s.charAt(0);
		for(int i=0 ; i<s.length() ; i++) {
			int count = 0;
			char ch = s.charAt(i);
			for(int j=1 ; j<s.length() ; j++) {
				if(ch == s.charAt(j)) {
					count++;
				}
				if( count > max ) {
					max = count;
					result = ch;
				}
			}
		}
		System.out.println(result+" is most Frequent character here.");
	}
	
	static void factorial(int n) {
		int fact = 1;
		for(int i=1 ; i<=n ; i++) {
			fact *= i;
		}
		System.out.println("Factorial = "+fact);
	}
	
	static void grades(int n) {
		if( n > 90 && n < 100 ) System.out.println("Grade : AA");
		else if( n > 80 && n < 91 ) System.out.println("Grade : AB");
		else if( n > 70 && n < 81 ) System.out.println("Grade : BB");
		else if( n > 60 && n < 71 ) System.out.println("Grade : BC");
		else if( n > 50 && n < 61 ) System.out.println("Grade : CD");
		else if( n > 40 && n < 51 ) System.out.println("Grade : DD");
		else System.out.println("Grade : FF");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String s = "Tops Tecnologies";
//		System.out.println("Original String : "+s);
//		System.out.println("Enter index to find character : ");
//		int a = sc.nextInt();
//		System.out.println(s.charAt(a));
		
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//		System.out.println("Concatenation : ");
//		System.out.println(s1+" "+s2);
		
//		String s1 = "topsinit.com";
//		String s2 = "topsinit.com";
//		String s3 = "Topsinit.com";
//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s3));
//		System.out.println(s1.equals(s3));
//		System.out.println(s3.contentEquals(s2));
		
//		String s1 = "Exercises";
//		String s2 = "Exercise";
//		String suffix = "se";
//		System.out.println(s1.endsWith(suffix));
//		System.out.println(s2.endsWith(suffix));
		
//		String s1 = "Red is my favourite color";
//		String s2 = "Orange is my fav color";
//		String prefix = "Red";
//		System.out.println(s1.startsWith(prefix));
//		System.out.println(s2.startsWith(prefix));
		
//		interleave("WX", "YZ", "");
		
//		MostFrequentChar("successes");
		
//		PrintNumber pn = new PrintNumber();
//		pn.printNum('f');
//		pn.printNum(10);
//		pn.printNum(5.0f);
		
//		pn.Method1(0, "abc");
//		pn.Method2("xyz", 1);
		
//		Area a = new Area();
//		a.area(5);
//		a.area(4, 5);
		
//		new Parent().method();
//		new child1().method();
//		Parent p = new child1();
//		p.method();
		
//		Employee emp = new Employee("Vaibhavi", 22, "vip road", 1245789635, 500000.00, "Java full stack");
//		emp.display();
//		
//		Manager m = new Manager("ABC", 25, "Vasna", 459862317, 120000.0, "Administration");
//		m.display();
		
//		System.out.println("--- Rectangle ---");
//		Rectangle r = new Rectangle(10, 5);
//		r.area();
//		r.perimeter();
//		
//		System.out.println("--- Square ---");
//		Square s = new Square(6);
//		s.area();
//		s.perimeter();
		
//		Triangle t = new Triangle();
//		t.setValues(3, 4, 5);
//		t.area();
//		t.perimeter();
		
//		Complex c = new Complex();
//		c.TakeNumbers();
//		c.sum();
//		c.difference();
//		c.product();
		
//		C1 c = new C1();
//		c.message();
//		C2 c1 = new C2();
//		c1.message();
		
//		Bank ba = new BankA();
//		ba.getBalance();
//		Bank bb = new BankB();
//		bb.getBalance();
//		Bank bc = new BankC();
//		bc.getBalance();
		
//		A a = new A(60, 60, 60);
//		a.getPercentage();
//		B b = new B(80, 80, 80, 80);
//		b.getPercentage();
		
//		factorial(5);
		
//		Area a = new Area();
//		a.rectangleArea(5, 9);
//		a.squareArea(8);
//		a.circleArea(2);
		
//		System.out.println("Enter marks out of 100 : ");
//		int n = sc.nextInt();
//		grades(n);
		
		Rectangle r = new Rectangle();
		r.method();
		Rectangle r1 = new square();
		r1.method();
	}
}
