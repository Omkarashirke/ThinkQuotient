

interface OneInterface
{
	String fullName = "Omkar Shirke";
}

abstract class OneAbstract implements OneInterface
{
	abstract void display();
}

public class AbsInter extends OneAbstract 
{
	void display()
	{
		System.out.println("My Name Is: " +fullName);
	}

	public static void main(String[] args) 
	{
		
		AbsInter a = new AbsInter();
		a.display();

	}

}
