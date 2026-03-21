package oops;

class A{
	public A() {
		System.out.println("Parent constructor");
	}
	void display() {
		System.out.println("Parent method");
	}
}

class B extends A{
	public B() {
		System.out.println("Child constructor");
	}
	void display() {
		super.display();
		System.out.println("Child Method");
	}
}

class C extends B{
	public C() {
		
		System.out.println("GrandChild Constructor");
	}
	void display() {
		super.display();
		System.out.println("GrandChild Method");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		C c = new C();
		c.display();
		
	}
	
	
}
