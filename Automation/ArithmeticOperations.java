

public class ArithmeticOperations
{
	int num1;
	int num2;
	int addition, substraction, multiplication;
	float division;
	
	public void  number(int anum1, int anum2)
	{
		num1 = anum1;
		num2 = anum2;
	}
	
	public void displayOperations()
	{
		System.out.println(" Addition ="+(num1 + num2));
		System.out.println(" substraction ="+(num1 - num2));
		System.out.println(" multiplication ="+(num1 * num2));
		System.out.println(" division ="+(num1 / num2));
	}

	public static void main(String[] args) 
	{
		
		ArithmeticOperations ao = new ArithmeticOperations();
		ao.number(20, 5);
		ao.displayOperations();

	}

}
