

public class Car
{
	int modelNumber;
	String carName;
	String carColour;
	double price;
	int speed;
	
	public void setModelNumber(int modelNumber)
	{
		this.modelNumber = modelNumber;
	}
	public void setCarName(String carName)
	{
		this.carName = carName;
	}
	public void setCarColour(String carColour)
	{
		this.carColour = carColour;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setSpeed(int speed)
	{
		if(speed<100)
			System.out.println(this.speed = speed);
		else
			System.out.println("Error: Wrong Speed Written. Please change speed.");
		System.out.println("  ");
	
	}
	
	public int getModelNumber()
	{
		return modelNumber;
	}
	public String getCarName()
	{
		return carName;
	}
	public String getCarColour()
	{
		return carColour;
	}
	public double getPrice()
	{
		return price;
	}
	public int getSpeed()
	{
		return speed;
	}
	
}
