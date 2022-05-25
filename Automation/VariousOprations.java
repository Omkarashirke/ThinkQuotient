

import java.util.Scanner;

public class VariousOprations {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int a[] = new int[20];
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		int positive[] = new int[20];
		System.out.println("Positive Numbers:");
		for(int i=0; i<positive.length; i++)
		{
			if(a[i]>0)
			{
				if(a[i] != 0)
				System.out.print("  "+a[i]);
			}
		}
		int negative[] = new int[20];
		System.out.println("\n Negative Numbers:");
		for(int i=0; i<negative.length; i++)
		{
			if(a[i]<0)
			{
				if(a[i] != 0)
				System.out.print("  "+a[i]);
			}
		}
		int zero[] = new int[20];
		System.out.println("\n Zero Numbers:");
		for(int i=0; i<zero.length; i++)
		{
			if(a[i]==0)
			{
				if(a[i] != 0)
				System.out.print("  "+a[i]);
			}
		}
		int even[] = new int[20];
		System.out.println("\n Even Numbers:");
		for(int i=0; i<even.length; i++)
		{
			if(a[i]%2 == 0)
			{
				if(a[i] != 0)
				System.out.print("  "+a[i]);	
			}
			
		}
		int odd[] = new int[20];
		System.out.println("\n Odd Numbers:");
		for(int i=0; i<odd.length; i++)
		{
			if(a[i]%2 != 0)
			{
				if(a[i] != 0)
				System.out.print("  "+a[i]);	
			}
			
		}

	}

}
