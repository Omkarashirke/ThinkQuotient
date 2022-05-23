// Single Inheritance


class Fruit
{
	String name = "Hapus";
}

public class Mango extends Fruit
{
	void show()
	{
		System.out.println("Fruit is = " +name);
	}

	public static void main(String[] args) 
	{
		
		Mango m = new Mango();
		m.show();

	}

}
