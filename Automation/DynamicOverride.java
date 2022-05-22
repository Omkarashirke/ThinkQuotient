
interface Move
{
	int x = 100;
	void show();
}

public class DynamicOverride implements Move
{
	public static final int x = 200;
	public void show()
	{
		System.out.println("Show");
	}

	public static void main(String[] args)
	{
		
		Move m = new DynamicOverride();
		m.show();
		System.out.println(m.x);

	}

}
