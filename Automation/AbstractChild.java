
abstract class AbstractParent
{
	abstract void show();
}

public class AbstractChild extends AbstractParent
{
	void show()
	{
		System.out.println("Class Is Abstract");
	}

	public static void main(String[] args) 
	{
		
		AbstractChild a = new AbstractChild();
		a.show();

	}

}
