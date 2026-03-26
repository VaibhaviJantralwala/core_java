package Exception_handling;

public class nested_try {

	public nested_try() {
		
		try {
			
			try {
				
				try {
					int x = 10 / 0;
					System.out.println(x);
				}
				catch(Exception e) {
					System.out.println(e);
				}
				int arr[] = new int[4];
				arr[4] = 90;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			String s = "Java";
			int x = Integer.parseInt(s);
			System.out.println(x);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		nested_try nt = new nested_try();
		
	}
}
