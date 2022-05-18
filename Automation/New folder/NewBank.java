

import java.util.Scanner; 

public class NewBank 
{

	int customerId;
	String customerName;
	long accountNumber;
	int balance, credited, newCredited, debited, newDebited;
	
	public void accountDetails(int customerId, String customerName, long accountNumber, int balance)
	{
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void credited(int credited)
	{
		newCredited = this.balance + credited;
		System.out.println("Dear customer "+customerName+" Rs."+credited+" credited @ SBI Account number:-"+accountNumber+
				". Now your New Balance is "+newCredited+".");
		
	}
	public void debited(int debited)
	{
		newDebited = this.balance - debited;
		System.out.println("Dear customer "+customerName+" Rs."+debited+" debited @ SBI Account number:-"+accountNumber+
				". Now your New Balance is "+newDebited+".");
	}
	public void displayAccount()
	{
		System.out.println(" Customer ID      : "+customerId);
		System.out.println(" Customer Name    : "+customerName);
		System.out.println(" Account Number   : "+accountNumber);
		System.out.println(" Balance          : "+balance);
	}
	

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		NewBank nb = new NewBank();
		
		System.out.println("Welcome to State Bank of India");
		System.out.println("  ");
		nb.accountDetails(1545, "Omkar Shirke", 1684456236, 50000);
		
		System.out.println(" 1. View Details \n 2. Credited \n 3. Debited");
		System.out.print("Enter Choice :");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: nb.displayAccount();;
				break;
		case 2: System.out.print("Enter Credited Balance :");
				int credited = sc.nextInt();
				nb.credited(credited);
				break;
				
		case 3: System.out.print("Enter Debited Balance :");
				int debited = sc.nextInt();
				nb.debited(debited);
				break;
		}
		
	}

}
