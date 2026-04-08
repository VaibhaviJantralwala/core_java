package Practice;

//public class set3 implements Runnable{
//	
//	@Override
//	synchronized public void run() {
//		for(int i=0 ; i<5 ; i++) {
//			try {
//				Thread.sleep(2000);
//				System.out.println(i+1+" "+Thread.currentThread().getName());
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}

public class set3 extends Thread{
	synchronized public void run() {
		for(int i=0 ; i<5 ; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i+1+" "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
//		set3 s1 = new set3();
//		
//		Thread th = new Thread(s1);
//		th.setName("Thread - 1");
//		th.start();
//		
//		Thread th1 = new Thread(s1);
//		th1.setName("Thread - 2");
//		th1.start();
		
//		set3 th = new set3();
//		th.setName("Thread - 1");
//		th.start();
//		set3 th1 = new set3();
//		th1.setName("Thread - 2");
//		th1.start();
		
//		set3 th = new set3();
//		th.start();
//		th.start();
		
//		set3 th1 = new set3();
//		th1.setName("Thread - 1");
//		th1.setPriority(MIN_PRIORITY);
//		th1.start();
//		
//		set3 th2 = new set3();
//		th2.setName("Thread - 2");
//		th2.setPriority(MAX_PRIORITY);
//		th2.start();
		
	}
}
