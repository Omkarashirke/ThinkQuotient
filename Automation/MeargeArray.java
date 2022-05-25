
import java.util.Scanner;

public class MeargeArray 
{

	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for a=");
		int sizea = sc.nextInt();
		
		System.out.println("Enter the first Values=");
		int a[] = new int[sizea];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size for b=");
		int sizeb = sc.nextInt();
		System.out.println("Enter the Second Values=");
		int b[] = new int[sizeb];
		
		for(int i=0; i<b.length; i++)
		{
			b[i] = sc.nextInt();
		}
		
		int c[] = new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i] = a[i];
			count++;
		}

		for(int i=0; i<b.length; i++)
		{
			c[count++] = b[i];
		}
		for(int i : c)
		{
			System.out.print("  "+i);
		}
		
//		for(int i=0; i<c.length; i++)
//		{
//			System.out.print("  "+c[i]);
//		}

	}

}
