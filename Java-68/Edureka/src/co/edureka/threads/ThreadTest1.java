package co.edureka.threads;
class MyTask1 implements Runnable{
 public void run() {
	 Thread t = Thread.currentThread();
	 System.out.println(t);
 }
}

public class ThreadTest1 {
	public static void main(String[] args) throws Exception{
		System.out.println("No of Active Threads = "+ Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask1 task1 = new MyTask1();
		/*create a child thread for MyTask1 instance*/
		Thread ct = new Thread(task1);
		ct.start();  //calls run()
		
		//Thread.sleep(2000);
		System.out.println("No of Active Threads = "+ Thread.activeCount());
	}
}
