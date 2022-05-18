

public class Shopping 
{
	
	String itemName, customerName;
	int quantity;
	int price;
	float bill;
	
	public void acceptDetails(String scn, String sin, int sq, int sp)
	{
		itemName = sin;
		customerName = scn;
		quantity = sq;
		price = sp;
	}
	
	public void calculateBill()
	{
		bill = quantity * price;
	}
	
	public void customerDetails()
	{
		System.out.println("Welcome to Shopping Mall");
		System.out.println(" ");
		System.out.println("Customer name :"+customerName);
		System.out.println("------------------------");
		System.out.println("Purches Item  :"+itemName);
		System.out.println("Quantity      :"+quantity);
		System.out.println("Price Of Item :"+price);
		System.out.println("------------------------");
		System.out.println("Total         : "+bill);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("    !!!Thank You!!!     ");
	}

	public static void main(String[] args)
	{
		
		Shopping sh = new Shopping();
		sh.acceptDetails("Vijay S", "table", 4, 150);
		sh.calculateBill();
		sh.customerDetails();

	}

}
