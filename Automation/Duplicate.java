

import java.util.Scanner;

public class Duplicate {

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
		
		int count = 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
					System.out.print(" "+a[i]);
					break;
				}
			}
		}
		System.out.print("\nTotal Number of Duplicate Elements= "+count);
		
	}

}
