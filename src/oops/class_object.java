package oops;

public class class_object {
	
	public class_object() {
		System.out.println("Default constructor");
	}
	
	public class_object(int i,int j) {
		System.out.println("parameterized constructor");
		System.out.println(i+j);
	}
	
	public static void main(String[] args) {
		
		class_object co = new class_object();
		class_object co1 = new class_object(12,12);
		
	}
}
