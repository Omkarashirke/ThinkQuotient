

public class CalculateArea {
	
	// no return type no parameter
	public void rectangle()
	{
		System.out.println(" Area Of Rectangle = " +(6 * 3));//Area Of Rectangle=l*b
	}
			
	// no return type with parameter
	public void Square(int x)
	{
		System.out.println(" Area Of Square = " +(x * x));
	}
			
			
	// with return type no parameter
	public float circle()
	{
		float area = 3.14f * 6 *6;
		return area;
	}
			
			
	// with return type with parameter
	public double trangle(int x, int y, float pi)
	{
		double tran = pi * x * y;
		return tran;
	}
			

	public static void main(String[] args) 
	{

		CalculateArea c = new CalculateArea();
		c.rectangle();
		c.Square(4);
		System.out.println(" Area Of Circle = " +c.circle());
		System.out.println(" Area Of Trangle = " +c.trangle(6, 6, 0.5f));
	}

}
