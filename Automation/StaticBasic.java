

public class StaticBasic 
{
	static int a=10;
	int b=15;
	StaticBasic()
	{
		System.out.println(a++);
	}
	void show()
	{
		System.out.println(a);
	}
	static
	{
		System.out.println("Systic");
	}
	static void get()
	{
		StaticBasic s = new StaticBasic();
		System.out.println(s.b);
	}
	
	public static void main(String[] args) 
	{
		
		StaticBasic sb = new StaticBasic();
		//sb.show();
		StaticBasic.get();

	}

}
