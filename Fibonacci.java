//7.	WAP to print Fibonacci series up to 20 terms.



public class Fibonacci {

	public static void main(String[] args) 
	{
		
		int a=0, b=1, c=0, i, count=20;
		
		System.out.println(a+"    "+b);
		
		for(i=0; i<count; i++)
		{
		c = a + b;
		System.out.print(" "+c);
		
		a = b;
		b = c;
		}
		
	}

}
