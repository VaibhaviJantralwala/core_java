package oops;

public class call_Encapsulation {

	public static void main(String[] args) {
		
		Encapsulation en = new Encapsulation();
		en.setId(-101);
		en.setUserName("abc");
		en.setPassword("1234");
		
		System.out.println(en.getId()+" "+en.getUserName()+" "+en.getPassword());
	}
}
