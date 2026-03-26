package Exception_handling;

public class finally_block {

	void test1() {
		
		try {
//			int x = 10/0;
			int x = 10/2;
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("hii");
		}
	}
	
	public static void main(String[] args) {
		
		finally_block f = new finally_block();
		f.test1();
	}
}
