package oops;

class Parent{
	
	public Parent() {
		System.out.print("Default Constructor -> Parent Class");
	}
	
	Parent(int i){
		System.out.println("Parent Class : "+i);
	}
	
	void display() {
		System.out.println("Parent Class Method");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println("\nDefault Constructor -> Child Class");
	}
	
	Child(int i){
		super(20);
		System.out.println("Child Class : "+i);
	}
	
	void display() {
		super.display();
		System.out.println("Child Class Method");
	}
}


public class singleLevelInheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		Child c1 = new Child(10);
		c1.display();
		
	}
	
}
