
class Final
{
	final void display()
	{
		System.out.println("Print FinalMethod");
	}
}

public class FinalMethod extends Final
{
//	final void display()
//	{
//		System.out.println("Print FinalMethod with Final");
//	}

	public static void main(String[] args) 
	{
		FinalMethod fm = new FinalMethod();
		fm.display();
	}

}
