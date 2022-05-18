

public class MethodDemo {
	
	// no return type no parameter
	
	public void show()
	{
		System.out.println(" Blank show ");
	}
	
	// no return type with parameter
	
	public void add(int x, int y)
	{
		System.out.println(" Addition = " +(x + y));
	}
	
	// with return type no parameter
	
	public int area()
	{
		int x=2*9;
		return x;
	}
	
	// with return type with parameter
	
	public float areaOfCircle(int r, float pi)
	{
		float area = pi * r * r;
		return area;
	}

	public static void main(String[] args) 
	{
		
		MethodDemo d = new MethodDemo();
		d.show();
		d.add(5, 6);
		
		System.out.println(" Area is = " +d.area());
		
		System.out.println("area Of Circle =" +d.areaOfCircle(4, 3.14f));

	}

}
