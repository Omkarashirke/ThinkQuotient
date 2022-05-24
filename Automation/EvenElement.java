
import java.util.Scanner;

public class EvenElement {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size=");
		int size  = sc.nextInt();
		
		System.out.println("Enter the elements=");
		int a[] = new int[size];

		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println("Even Numbers Is= "+a[i]);
			}
		}
		for(int i:a)
		{
			if(i%2 == 0)
			{
				System.out.println("Even Numbers Is= "+i);
			}
		}
		
	}

}
