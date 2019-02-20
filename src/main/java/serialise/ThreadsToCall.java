package serialise;

public class ThreadsToCall {

	public static void main(String[] args) {
		MyThread1 obj1 = new MyThread1(1);
		MyThread1 obj2 = new MyThread1(2);
		MyThread1 obj3 = new MyThread1(0);
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		Thread thread3 = new Thread(obj3);
		thread1.setName("t1");
		thread2.setName("t2");
		thread3.setName("t3");
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
