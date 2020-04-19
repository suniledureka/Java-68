package co.edureka.threads;
class Natural extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		  System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

class Even extends Thread{
  public void run() {
	  for(int i=2;i<=20;i+=2) {
		  System.out.println(Thread.currentThread().getName()+" - "+i);
	  }
  }
}

public class ThreadTest3 {
	public static void main(String[] args) {
		Natural nat = new Natural();
		Even eve = new Even();
		
		nat.setName("NAT");
		eve.setName("EVE");
		
		nat.start();
		eve.start();
	}
}
