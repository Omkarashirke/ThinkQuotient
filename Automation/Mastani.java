

interface IceCream
{
	void eat();
	
}

interface Juice
{
	void drink();
}

public class Mastani implements IceCream, Juice
{
	public void eat()
	{
		System.out.println("I am eating IceCream");
	}
	public void drink()
	{
		System.out.println("I am drinking Juice");
	}

	public static void main(String[] args) 
	{
		
		Mastani m = new Mastani();
		m.eat();
		m.drink();

	}

}
