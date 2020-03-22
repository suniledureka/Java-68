class BankTest 
{
	public static void main(String[] args) 
	{
		Bank ba = null;
		ba = new SBI();
		System.out.println(ba.n);
		System.out.println(Bank.n);
		System.out.println(SBI.n);
		ba.deposit(2500);
		ba.withdraw(2500);
		System.out.println("------------------------");

		/*ICICI*/
		ba = new ICICI();
		System.out.println(ICICI.n);
		ba.deposit(2500);
		ba.withdraw(2500);
	}
}
