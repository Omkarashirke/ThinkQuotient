

import java.util.Scanner;

public class RevOrder {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int a[] = new int[5];
		int b[] = new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("\n Forward Order:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print("  "+a[i]);
		}
		System.out.println("\n Reverse Order:");
		for(int i=a.length-1; i>=0; i--)
		{
			b[i] = a[i];
			System.out.print("  "+b[i]);
			
		}
	}

}
