

class Nib
{
	String materialTyape;
	int price;
	Nib(String materialTyape, int price)
	{
		this.materialTyape = materialTyape;
		this.price = price;
	}
	public String toString()
	{
		return materialTyape+"  "+price;
	}
}

class Pen
{
	String colour;
	int price;
	Nib nib;
	Pen(String colour, int price, Nib nib)
	{
		this.colour = colour;
		this.price = price;
		this.nib = nib;
	}
	public String toString()
	{
		return colour+"  "+price+"   "+nib;
	}
}

public class Bag
{
	String bradName;
	String bagColour;
	int price;
	Pen pen;
	Bag(String bradName, String bagColour, int price, Pen pen)
	{
		this.bradName = bradName;
		this.bagColour = bagColour;
		this.price = price;
		this.pen = pen;
	}
	public String toString()
	{
		return bradName+"  "+bagColour+"  "+price+"  "+pen;
	}
	
	public static void main(String[] args)
	{

		Bag b = new Bag("Huwai", "Black", 5000, new Pen("Red", 1000, new Nib("Plastic", 100)));
		System.out.println(b);

	}

}
