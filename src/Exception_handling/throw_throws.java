package Exception_handling;

//throw is used to explicitly throw an exception in code.
//throws is used to declare exceptions in method signature.
//We can throw both checked and unchecked exceptions.
//But checked exceptions must be handled or declared using throws, while unchecked do not require it.


public class throw_throws  {

	int i=-1;
	
	void test1() throws Exception {
	
		if( i > 0 ) {
			System.out.println(i);
		}else {
			throw new Exception("Please enter positive number");
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		throw_throws tt = new throw_throws();
		tt.test1();
		
	}
}
