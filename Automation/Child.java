

class Parent
{
	int x;
	void display(int x)
	{
	System.out.println("Qube of Number="+(x * x * x));
	}
}

public class Child extends Parent
{
	
	void display(int x)
	{
		super.display(x);
		int sum = 0;
		for(int i=1; i<=x; i++)
		{
			int count = 0;
			{
				if (x % i == 0)
				{
					count += i; 
					sum+=i;
				} 
	        }    
		}System.out.print("   "+sum);
	}

	public static void main(String[] args)
	{
		
		Child c = new Child();
		c.display(5);

	}

}
