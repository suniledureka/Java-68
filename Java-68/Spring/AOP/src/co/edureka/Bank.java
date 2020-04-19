package co.edureka;

public class Bank {
 public void deposit() {
	 System.out.println("A generic deposit method");
 }
 public void deposit(String acno, float amt) {
	 System.out.println("Withdrawing Rs."+ amt+ " from A/C: "+acno);
 }
}
