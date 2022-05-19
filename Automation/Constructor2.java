

public class Constructor2 
{
//	Constructor2 get()
//	{
//		Constructor2 c = new Constructor2();
//		return this;
//		
//	}

	void input(Constructor2 c)
	{
	System.out.println(c);
	}

	void get() 
	{
		Constructor2 c2= new Constructor2();
		this.input(c2);
		input(new Constructor2());
		input(this);
	}

	public static void main(String[] args) 
	{
		
		Constructor2 c = new Constructor2();
		System.out.println(c);
		
		Constructor2 c2 = new Constructor2();
		//c.input(c2);
		System.out.println(c2);
	}

}
