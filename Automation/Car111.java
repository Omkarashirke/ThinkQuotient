

class Engine1
{
	String engine1;
	
	public void setEngine1(String engine1)
	{
		this.engine1 = engine1;
	}
	public String getEngine1()
	{
		return engine1;
	}
}

public class Car111 
{
	int carId;
	String carName;
	int price;
	Engine1 eng;
	
	public void setCarId(int carId)
	{
		this.carId = carId;
	}
	public void setCarName(String carName)
	{
		this.carName = carName;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setEng(Engine1 eng)
	{
		this.eng = eng;
	}
	public int getCarId()
	{
		return carId;
	}
	public String getCarName()
	{
		return carName;
	}
	public int getPrice()
	{
		return price;
	}
	public Engine1 getEng()
	{
		return eng;
	} 

	public static void main(String[] args) 
	{
		
		Car111 c = new Car111();
		c.setCarId(120);
		c.setCarName("Ertica");
		c.setPrice(1000000);
		
		c.setEng(new Engine1());
		c.getEng().setEngine1("Disel Car");
		
		
		System.out.println(c.getCarId()+"  "+c.getCarName()+"  "+c.getPrice()+"  "+c.getEng().getEngine1());
		

	}

}
