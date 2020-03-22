package co.edureka.threads;

class MyTask2 extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}

public class ThreadTest2 {
	public static void main(String[] args) throws Exception {
		System.out.println("No of Active Threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);

		/* create a child thread for MyTask1 instance */
		MyTask2 task2 = new MyTask2();
		task2.start(); // calls run()

		// Thread.sleep(2000);
		System.out.println("No of Active Threads = " + Thread.activeCount());
	}
}
