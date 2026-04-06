package Exception_handling;

class Vaibhavi extends Exception{
	
	public Vaibhavi(String s) {
		super(s);
	}
	
}


public class customExcpPractice  {
	int a = 5 , b= 0;
	void div() throws Vaibhavi {
		if( b != 0 ) {
			System.out.println(a/b);
		}else {
			throw new Vaibhavi("Custom Exception--Vaibhavi");
		}
		
		
	}
	
		
public static void main(String[] args) throws Vaibhavi {
	
	customExcpPractice cp = new customExcpPractice();
	cp.div();
}
}
