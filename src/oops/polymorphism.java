package oops;

// what is polymorphism?
// one form has many methods
// 2 types :
// compile time : real time eg : method overloading
// run time : real time eg : method overriding

// method overloading 
// one class has many methods with same name but different parameter

// method overiding 
// define same method with same parameters in different classes

public class polymorphism {

	// find area of different shapes
	
	void area(double r) {
		System.out.println("area of circle : "+(3.14*r*r));
	}
	
	void area(int l,int b) {
		System.out.println("area of rectangle : "+(l*b));
	}
	
	void area(double h,double b) {
		System.out.println("area of triangle : "+(0.5*h*b));
	}
	
	void area(int l) {
		System.out.println("area of square : "+l*l);
	}
	
	
	public static void main(String[] args) {
		
		polymorphism poly = new polymorphism();
		
		poly.area(5.0);
		poly.area(5,4);
		poly.area(4.0,2.0);
		poly.area(5);
		
	}
	
	
}
