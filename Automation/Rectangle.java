

class Square
{
	int side;
	Square(int side)
	{
		this.side = side;
	}
	void areaOfSquare()
	{
		System.out.println("Area Of Square="+(side * side));
	}
}
public class Rectangle 
{
	int length;
	int breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	void areaOfRectangle()
	{
		System.out.println("Area Of Rectangle="+(length * breadth));
	}
	void areaOfPerimeter()
	{
		System.out.println("Area Of Perimeter="+(2 *(length + breadth)));
	}
	
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(4, 5);
		r.areaOfRectangle();
		r.areaOfPerimeter();
		
		Square s = new Square(4);
		s.areaOfSquare();
	}

}
