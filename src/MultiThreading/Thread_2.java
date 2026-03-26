package MultiThreading;

// through runnable interface
public class Thread_2 extends Sample implements Runnable{

	public static void main(String[] args) {
			
		Thread_2 t2 = new Thread_2();
		Thread t = new Thread(t2);
		t.start();
		
		t2.test();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);	
		}
		
	}
}
