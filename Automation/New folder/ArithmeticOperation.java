

public class ArithmeticOperation {
	
		// no return type no parameter
		public void add()
		{
			System.out.println(" Add = " +(4+5));
		}
		
		// no return type with parameter
		public void sub(int x, int y)
		{
			System.out.println(" Sub = "+(x - y));
		}
		
		
		// with return type no parameter
		public int mul()
		{
			int x = 5 * 4;
			return x;
		}
		
		
		// with return type with parameter
		public float div(int x, int y)
		{
			float d = x / y;
			return d;
		}
		

	public static void main(String[] args) 
	{
		
		ArithmeticOperation a = new ArithmeticOperation();
		a.add();
		
		a.sub(75, 60);
		
		System.out.println(" Sub = " +a.mul());
		
		System.out.println(" Sub = " +a.div(6, 3));

	}

}
