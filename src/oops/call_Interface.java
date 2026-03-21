package oops;

public class call_Interface implements datadao , datadao1 {

	@Override
	public void insert() {
		System.out.println("Insert method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		System.out.println("Update method");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		call_Interface ci = new call_Interface();
		ci.insert();
		ci.update();
		ci.delete();
	}

	@Override
	public void delete() {
		System.out.println("Delete method");
		// TODO Auto-generated method stub
		
	}

}
