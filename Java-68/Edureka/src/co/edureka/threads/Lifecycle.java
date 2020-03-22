package co.edureka.threads;

public class Lifecycle {

	public static void main(String[] args)throws Exception {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(2000); //2000ms
			if(i==4)
				t.stop();
		}
	}
}
