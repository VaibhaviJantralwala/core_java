package Java_modifiers;

//static -> no need to create object to call static properties
//variables , methods , nested class , static block 


public class static_modifiers {

	static String clg = "ADIT";
	String name;
	int id ;
	
	public static_modifiers(int id , String name) {
		
		this.id = id;
		this.name = name;
		
	}
	
	void display() {
		
		System.out.println(id+" "+name+" "+clg);
		
	}
	
	// static method can call static methods only
	static void s_display() {
		
		System.out.println(clg);
		
	}
	
	
	
	public static void main(String[] args) {
		
		static_modifiers s = new static_modifiers(1,"abc");
		s.display();
		
		static_modifiers s1 = new static_modifiers(2,"xyz");
		s1.display();
		
		s_display();
		
		
	}
	
	
}
