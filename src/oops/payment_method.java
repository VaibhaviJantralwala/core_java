package oops;

public class payment_method {

	void payment() {
		int amount = 1000;
		System.out.println("Payment through cash . Amount : "+amount);
	}
	
	void payment(int code,int amount) {
		System.out.println("Payment through card , CODE : "+code+" , Amount : "+amount);
	}
	
	void payment(String upiId,int amount) {
		System.out.println("Payment through UPI , UPI ID : "+upiId+" , Amount : "+amount);
	}
	
	public static void main(String[] args) {
		
		payment_method pay = new payment_method();
		
		pay.payment();
		
		pay.payment(345, 5000);
		
		pay.payment("xyzohdfc.com", 7000);
		
	}
}
