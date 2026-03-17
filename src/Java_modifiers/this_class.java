package Java_modifiers;


public class this_class {

	int id = 12;
	
	this_class(this_class t){
		System.out.println(t.id);
	}
	
	public this_class() {
		System.out.println("DC");
		new this_class(this);
	}
	
	public static void main(String[] args) {
		
		this_class t1 = new this_class();
		
	}
	
}
