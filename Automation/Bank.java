

public class Bank 
{

	int customerId;
	String customerName;
	long accountNumber;
	int balance, credited, newbal , debited, deb;
	
	
	public void acceptDetails(int bid, String bn, long bac, int bb)
	{
		customerId = bid;
		customerName = bn;
		accountNumber = bac;
		balance = bb;
	}
	
	public void deposite()
	{
		credited = 10000;
		newbal = balance + credited;
	}
	
	public void withdrawal()
	{
		debited = 5000;
		deb = newbal - debited; 
	}
	
	public void details()
	{
	
	
	System.out.println(" Dear customer "+customerName+" Rs."+credited+" credited @ SBI Account number:-"+accountNumber+
			". Now your New Balance is "+newbal+".");

	System.out.println(" Dear customer "+customerName+" Rs."+debited+" debited @ SBI Account number:-"+accountNumber+
			". Now your New Balance is "+deb+".");
	}


	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.acceptDetails(100, "OMKAR SHIRKE", 111201525, 50000);
		b.deposite();
		b.withdrawal();
		b.details();
	}

}
