package oops;

public class Encapsulation {

	private int id;
	private String userName , password ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if( id > 0 ) {
			this.id = id;
		}
		else {
			
			System.out.println("Please enter valid ID");
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
