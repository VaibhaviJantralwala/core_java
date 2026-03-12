package oops;

public class functions {

	// no param no return type
	void test() {
		System.out.println("No param no return type");
	}
	
	//param , no return type
	void test(int i) {
		System.out.println(i);
	}
	
	// with return no param
	int test1() {
		return 1;
	}
	
	// with param with return type
	int test2(int i) {
		return i;
	}
	
	
	
	public static void main(String[] args) {
		
		functions fun = new functions();
		
		fun.test();
		
		fun.test(22);
		
		System.out.println(fun.test1());
		
		System.out.println(fun.test2(20));
		
	}
	
	
}
