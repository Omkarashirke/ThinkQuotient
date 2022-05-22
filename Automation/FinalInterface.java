

interface Workable
{
	int x = 100;
	void show();
	
	default void read()
	{
		System.out.println("Read Book");
	}
	
	static void get()
	{
		System.out.println("My Static");
	}
}

public class FinalInterface implements Workable
{
	public void show()
	{
		System.out.println("Show");
	}

	public static void main(String[] args) 
	{
		
		FinalInterface fi = new FinalInterface();
		fi.show();
		fi.read();
		Workable.get();

	}

}
