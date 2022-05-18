

public class CarInfo {

	public static void main(String[] args) 
	{

		Car c = new Car();
		c.setModelNumber(658);
		c.setCarName("Ertica");
		c.setCarColour("Black");
		c.setPrice(500000);
		c.setSpeed(150);
		
		System.out.println(" ModelNumber: "+c.getModelNumber()+"\n CarName: "+c.getCarName()+"\n CarColour: "+c.getCarColour()+
							"\n Price: "+c.getPrice()+"\n Speed: "+c.getSpeed());

	}

}
