

public class Construstor1 
{
	Construstor1()
	{
		this(125);
		System.out.println("Default");
	}
	Construstor1(int a)
	{
		this("Omkar");
		System.out.println("Para==" +a);
	}
	Construstor1(String name)
	{
	//	this(123);
		System.out.println(name);
	}
	

	public static void main(String[] args)
	{

		Construstor1 c = new Construstor1();
		
	}

}
