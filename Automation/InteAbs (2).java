
abstract class FirstAbstract
{
	abstract void display();
}
//
//interface SecondInterface extends FirstAbstract
//{
//	int n = 100;
//	
//	void Display()
//	{
//		System.out.println("FirstAbstract ");
//	}
//}

public class InteAbs //implements SecondInterface
{
	public void Display()
	{
		System.out.println("FirstAbstract " );
	}

	public static void main(String[] args)
	{
		
		InteAbs i= new InteAbs();
		i.Display();

	}

}
