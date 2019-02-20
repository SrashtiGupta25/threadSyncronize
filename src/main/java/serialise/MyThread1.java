package serialise;

public class MyThread1 implements Runnable{
	static int i = 1;
	int r;
  static Object lock = new Object();
	MyThread1(int r)
 {
	 this.r=r;
 }
	public void run() {
		
		while(i < 12) {
			synchronized (lock)
			{
			
			 while (i%3 != r) {
				 try {
					 
					lock.wait();
				 } 
				 catch (Exception e){
					 e.printStackTrace();
				 }
				 
				 
			 }
					 System.out.println(Thread.currentThread().getName() + " :" + i);
					 i++ ;
					 lock.notifyAll();
					
				 }
			 
				 }
		
	}
}


