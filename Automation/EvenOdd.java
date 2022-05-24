

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements=");
		int a[] = new int[size];
		int even[] = new int[a.length];
		int odd[] = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Even Numbers Is= ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				even[i]=a[i];
				//System.out.println("Even Numbers Is= "+a[i]);			
			}
			if(even[i] != 0)
			System.out.print("  "+even[i]);		
		} 
		System.out.println(" \n ");
		
		System.out.println("Odd Numbers Is= ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 != 0)
			{
				odd[i]=a[i];
				//System.out.println("Odd Numbers Is= "+a[i]);
			}
			if(odd[i] != 0)
			System.out.print("  "+odd[i]);
		}

	}

}
