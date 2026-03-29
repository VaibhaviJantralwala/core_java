package MultiThreading;

class Task {
	
	synchronized void Multiply(int num) {
		
		for(int i=1 ; i<=10 ; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(num*i+" "+Thread.currentThread().getName());
		}
		
	}
}

class Thread_4 implements Runnable{
	
	Task task;
	int num;
	public Thread_4(Task task , int num) {
		this.task = task;
		this.num = num;
	}
	
	public void run() {
		task.Multiply(num);
	}
}

class Thread_5 implements Runnable{
	
	Task task;
	int num;
	public Thread_5(Task task , int num) {
		this.task = task;
		this.num = num;
	}
	
	public void run() {
		task.Multiply(num);
	}
}

public class Thread_3 {
public static void main(String[] args) {
	
	Task task = new Task();
	
	Thread_4 th4=new Thread_4(task,2);
	Thread t1=new Thread(th4);
	t1.setName("process1");
	t1.start();
	
	Thread_5 th5=new Thread_5(task,5);
	Thread t2=new Thread(th5);
	t2.setName("process2");
	t2.start();


}
}
