package Exception_handling;

// errors -> detected on compile time 
// exceptions -> detected on runtime

// exceptions are of 2 types :
// checked and unchecked 
// checked : Exception , IO Exception , SQL Exception
// Unchecked : ArrayIndexOutOfBound , NullPointer , NumberFormat , ArithmaticException

public class ExceptionHandling1 {

	void Arithmaticexceptions() {
		try {
			int x = 10/0;
			System.out.println(x);
			
		}catch(Exception e) {
			System.out.println(e);
		}		
	}
	
	void ArrayIndex() {
		try {
			int arr[] = new int[4];
			arr[4] = 90;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	void NullPtr() {
		try {
			String s = "Java";
			int x = Integer.parseInt(s);
			System.out.println(x);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	void Example() {
		try {
			String s = "Java";
			int x = Integer.parseInt(s);
			System.out.println(x);
			
			int a = 10/0;
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		
		ExceptionHandling1 e = new ExceptionHandling1();
//		e.Arithmaticexceptions();
//		e.ArrayIndex();
//		e.NullPtr();
		
		e.Example();
		
	}
}
