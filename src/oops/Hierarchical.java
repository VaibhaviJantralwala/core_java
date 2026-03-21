package oops;

class parent1{
	public parent1() {
		System.out.println("Parent Constructor");
	}
	
	parent1(int i){
		System.out.println(i);
	}
	
}

class Child1 extends parent1{
	public Child1() {
		System.out.println("Child 1 Constructor");
	}
	
	Child1(int i){
		super(40);
		System.out.println(i);
	}
}

class Child2 extends parent1{
	public Child2() {
		System.out.println("Child 2 Constructor");
	}
	
	Child2(int i){
		super(50);
		System.out.println(i);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		
		Child2 c = new Child2();
		Child2 c1 = new Child2(30);
		
		Child1 c2 = new Child1();
		Child1 c3 = new Child1(20);
	}
	
}
