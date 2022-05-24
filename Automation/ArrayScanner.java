
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size=");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements=");
		
		int a[] = new int[size];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print("  "+a[i]);
		}
		System.out.print("\n///////// \n ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print("  "+a[i]);
		}

	}

}
