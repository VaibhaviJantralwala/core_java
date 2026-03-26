package MultiThreading;

// ways to create threads in java : 
// extend thread class OR
// through Runnable Interface

// thread stages :
// new > runnable > running > waiting > terminated 

class Sample{
	int i=10;
	public void test() {
		System.out.println(i);
	}
}

// Thread through extend Thread class
public class Thread_1 extends Thread{

	public void run() {
		
		for(int i=0 ; i<5 ; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		Thread_1 th = new Thread_1();
		th.start();
		th.join();
		
		Thread_1 th1 = new Thread_1();
		th1.start();
		th1.join();
		
		Thread_1 th2 = new Thread_1();
		th2.start();
		
	}
}
