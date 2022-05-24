

interface I1
{
	void show();
	
	static void read()
	{
		System.out.println("Read 1");
	}
}
interface I2
{
	void show();
	
	static void read()
	{
		System.out.println("Read 2");
	}
}


public class InterfaceChild {

	public static void main(String[] args) 
	{
		
		I1.read();
		I2.read();

	}

}
