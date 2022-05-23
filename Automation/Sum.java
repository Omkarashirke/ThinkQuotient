

interface Parent2
{
	int m = 200;
}

abstract class Parent1
{
	abstract void display();
	int n = 100;
	
}

public class Sum extends Parent1 implements Parent2
{
	void display()
	{
		System.out.println("Sum=" + (n+m));
	}
	

	public static void main(String[] args) 
	{
		
		Sum s = new Sum();
		s.display();

	}

}
