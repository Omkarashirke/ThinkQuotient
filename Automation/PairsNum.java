
import java.util.Scanner;

public class PairsNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		System.out.println("Enter the elements:");
		int a[] = new int[size];
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		int n = 10;
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=0; j<a.length; j++)
			{
				b[i] = a[i]+a[j];
				if(b[i]==n)
				{
					c[i]=a[i];
				}
				
			}
			System.out.print("   "+c[i]);
			
		}
		sc.close();

	}

}
