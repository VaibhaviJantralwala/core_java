package Exception_handling;

class Tops_exception extends Exception{
	
	public Tops_exception(String string) {
		super(string);
	}
}

public class Custom_exception {

	int i=10 , b = 0;
	
	void test() throws Tops_exception {
		if( b!= 0 ) {
			System.out.println(i/b);
			
		}
		else {
			throw new Tops_exception("Please enter positive num");
		}
	}
	
	public static void main(String[] args) throws Tops_exception  {
		
		Custom_exception ce = new Custom_exception();
		ce.test();
	}
}
