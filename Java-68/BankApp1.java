class BankApp1 
{
	public static void main(String[] args) 
	{
		Bank bank_obj = new Bank(){
			public void deposit(float amt){
			  System.out.println("Depositing....");
			}
			public void withdraw(float amt){
			  System.out.println("Withdrawing....");
			}
		};

		bank_obj.deposit(2450f);
	}
}
