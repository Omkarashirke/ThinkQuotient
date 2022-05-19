

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
		/*System.out.println("State Bank of India");
		System.out.println("   ");
		System.out.println("_______________________________");
		System.out.println(" Customer ID    : "+customerId);
		System.out.println(" Customer Name  : "+customerName);
		System.out.println(" Account Number : "+accountNumber);
		System.out.println(" Balance        : "+balance);
		System.out.println(" Deposite       : "+credited);
		System.out.println(" New Balance    : "+newbal);
		System.out.println(" withdrawal     : "+debited);
		System.out.println(" New Balance    : "+deb);
		*/
		
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
