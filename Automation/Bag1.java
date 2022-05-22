

class Nib1
{
	String materialTyape;
	int price;
	public void setMaterialType(String materialTyape)
	{
		this.materialTyape = materialTyape;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public String getMaterialType()
	{
		return materialTyape;
	}
	public int getPrice()
	{
		return price;
	}
}

class Pen1
{
	String colour;
	int price;
	Nib1 nib;
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setNib(Nib1 nib)
	{
		this.nib = nib;
	}
	public String getColour()
	{
		return colour;
	}
	public int getPrice()
	{
		return price;
	}
	public Nib1 getNib()
	{
		return nib;
	}
}


public class Bag1 
{
	String bradName;
	String bagColour;
	int price;
	Pen1 pen;
	public void setBradName(String bradName)
	{
		this.bradName = bradName;
	}
	public void setBagColour(String bagColour)
	{
		this.bagColour = bagColour;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setPen(Pen1 pen)
	{
		this.pen = pen;
	}
	public String getBradName()
	{
		return bradName;
	}
	public String getBagColour()
	{
		return bagColour;
	}
	public int getPrice()
	{
		return price;
	}
	public Pen1 getPen()
	{
		return pen;
	}

	public static void main(String[] args) 
	{
		Bag1 b = new Bag1();
		b.setBradName("Huwai");
		b.setBagColour("Black");
		b.setPrice(6000);
		
		b.setPen(new Pen1());
		b.getPen().setColour("Red");
		b.getPen().setPrice(1500);
		
		b.getPen().setNib(new Nib1());
		b.getPen().getNib().setMaterialType("Metal");
		b.getPen().getNib().setPrice(150);
		
		System.out.println(b.getBradName()+"  "+b.getBagColour()+"  "+b.getPrice()+"  "+b.getPen().getColour()+"  "
				+b.getPen().getPrice()+"  "+b.getPen().getNib().getMaterialType()+"  "+b.getPen().getNib().getPrice());

	}

}
