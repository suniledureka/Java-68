package co.edureka.threads;

class Table{
	//public void printTable(int n) {
	synchronized public void printTable(int n) {	
		for(int i=1;i<=10;i++) {
			int p = n*i;
			System.out.println(n+" * "+i+" = "+p);
			try {
				Thread.sleep(500);
			}
			catch(Exception ex) {}
		}
		System.out.println("---------------------");
		try {
			Thread.sleep(4000);
		}
		catch(Exception ex) {}
	}
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(6);
	}
}

public class SynchroTest {

	public static void main(String[] args) {
		Table table = new Table();
		MyThread1 mt1 = new MyThread1(table);
		MyThread2 mt2 = new MyThread2(table);
		mt1.start();
		mt2.start();
	}
}
