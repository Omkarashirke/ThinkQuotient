
abstract class AbstractParent1
{
	abstract void display();
	
	void display1()
	{
		System.out.println("This is Concrete Method.....");
	}
}

public class AbstractChild1 extends AbstractParent1
{
	void display()
	{
		System.out.println("This is Child class.....");
	}
	
	
	public static void main(String[] args) 
	{
		
		AbstractChild1 a = new AbstractChild1();
		a.display();
		a.display1();

	}

}
