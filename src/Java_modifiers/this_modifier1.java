package Java_modifiers;

//to make java memory efficient
//constructor chaining

public class this_modifier1 {

	public this_modifier1() {
		System.out.println("default constructor");
	}
	
	this_modifier1(int i){
		this();
		System.out.println(i);
	}
	
	this_modifier1(String s){
		this(7);
		System.out.println(s);
	}
	
	this_modifier1(double d){
		this("java");
		System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		
		this_modifier1 th = new this_modifier1(12.12);
		
	}
	
}
