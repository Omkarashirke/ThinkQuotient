

class Display
{
static  void hello()
	{
		System.out.println("Hello....Word");
	}
}

public class OverridingStatic extends Display
{
	static  void hello()
	{
		
		System.out.println("Hello....Good...Morning");
	///	super.hello();
	}
	public static void main(String[] args)
	{
		
		OverridingStatic o = new OverridingStatic();
		o.hello();
		
//		Display o1 =  new Display();
//		o1.hello();
		
		
	}

}
