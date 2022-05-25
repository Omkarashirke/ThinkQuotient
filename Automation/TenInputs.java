
import java.util.Scanner;

public class TenInputs {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values=");
		int a[] = new int[10];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i:a)
		{
			System.out.print("  "+i);
		}

	}

}
