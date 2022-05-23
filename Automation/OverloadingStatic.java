

public class OverloadingStatic 
{
	static int n;
	public static void OverloadingStatic()
	{
		System.out.println("OverloadingStatic");
	}
	
	public static void OverloadingStatic(int n)
	{
		System.out.println("New OverloadingStatic");
	}
	void show()
	{
		System.out.println(n);
	}

	public static void main(String[] args) 
	{

		OverloadingStatic o = new OverloadingStatic();
		o.show();
		o.OverloadingStatic();
//		o.OverloadingStatic(500);
		OverloadingStatic(500);

	}

}
