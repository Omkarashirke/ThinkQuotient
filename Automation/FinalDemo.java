
public class FinalDemo 
{
//	final int x;	//blank final
//	FinalDemo()
//	{
//		x=100;
//	}
	static final int x;
	static
	{
		x=100;
	}
	FinalDemo()
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		
		FinalDemo fd = new FinalDemo();
//		System.out.println(fb.x);

	}

}
