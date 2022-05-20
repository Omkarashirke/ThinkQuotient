
class TwoWheelers
{
	String colour = "Black";
}

class Bike extends TwoWheelers
{
	void show()
	{
		colour = "Red";
		System.out.println("Bike Colour = " + colour);
	}
}

public class Suzuki extends Bike
{

	public static void main(String[] args) 
	{

		Suzuki s = new Suzuki();
		s.show();

	}

}
