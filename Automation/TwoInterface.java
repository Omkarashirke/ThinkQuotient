
interface First
{
	String name = "Omkar";
}

interface Second extends First
{
	String sirName = "Shirke";
	void display();
}
public class TwoInterface implements Second
{
	public void display()
	{
		System.out.println(name+ "  " +sirName);
	}

	public static void main(String[] args) 
	{
		
		TwoInterface t = new TwoInterface();
		t.display();

	}

}
