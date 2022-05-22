

class Laptop
{
	int x=100;
	void show()
	{
		System.out.println("LapTop");
	}
}

public class Dell extends Laptop
{
	int x=300;
	void show()
	{
		System.out.println("Dell");
	}

	public static void main(String[] args) 
	{
		
		Laptop l = new Dell();
		l.show();
		System.out.println(l.x);

	}

}
