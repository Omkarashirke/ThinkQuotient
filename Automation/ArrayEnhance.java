
import java.util.Scanner;

public class ArrayEnhance {

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
		for(int i : a)
		{
			System.out.print("  "+i);
		}

	}

}
