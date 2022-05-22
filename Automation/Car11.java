

class Engine
{
	String engine;
	
	Engine(String engine)
	{
		this.engine = engine;
	}
	public String toString()
	{
		return engine;
	}
}

public class Car11 
{
	int carId;
	String carName;
	int price;
	Engine eng;
	
	Car11(int carId, String carName, int price, Engine eng)
	{
		this.carId = carId;
		this.carName = carName;
		this.price = price;
		this.eng = eng;
	}
	public String toString()
	{
		return carId+"  "+carName+"  "+price+"  "+eng;
	}

	public static void main(String[] args) 
	{
		
		Car11 c = new Car11(105, "Ertica", 100000, new Engine("Disel Car"));
		System.out.println(c);

	}

}
