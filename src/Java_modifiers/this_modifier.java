package Java_modifiers;

//this -> call current class attributes
//you can call variable , class , method 
//make a java program to pass parameter value into global value using this key word

public class this_modifier {

	int id;
	String name;
	
	public this_modifier(int id,String name) {
		 
		this.id = id;
		this.name = name;
		
		System.out.println(id+" "+name);
		
	}
	
	void display() {
		
		System.out.println(id+" "+name);
		
	}
	
	
	public static void main(String[] args) {
		
		this_modifier th = new this_modifier(1,"java");
		
		th.display();
		
		
	}
	
	
}
