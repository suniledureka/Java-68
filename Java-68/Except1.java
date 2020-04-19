class Except1 
{
	public static void main(String[] args) 
	{
		try{
		 int n1 = Integer.parseInt(args[0]);
		 int n2 = Integer.parseInt(args[1]);
		 int n3 = n1/n2;
		 System.out.println(n1+" / "+n2+" = "+n3);
		}
		catch(ArithmeticException ex){
			System.out.println("Cannot divide a number by zero");
		}
		System.out.println("--- DONE ---");
	}
}


