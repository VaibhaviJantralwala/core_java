package oops;

abstract class ab_test1{
	abstract void test1();
	abstract int test();
}

public class abstract_program extends ab_test1 {
	
	

	public static void main(String[] args) {
		
		abstract_program ab = new abstract_program();
		ab.test1();
		ab.test();
	}

	@Override
	void test1() {
		System.out.println("Mathod 1");
		// TODO Auto-generated method stub
		
	}

	@Override
	int test() {
		System.out.println("Method 2");
		// TODO Auto-generated method stub
		return 0;
	}
}
