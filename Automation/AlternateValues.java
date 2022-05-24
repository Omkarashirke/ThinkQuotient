

import java.util.Scanner;

public class AlternateValues {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size=");
		int size = sc.nextInt();
		
		System.out.println("Enter the values=");
		int a[] = new int[size];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Alternate Number=");
//		for(int i=0; i<a.length; i++)
//		{
//			if(i%2==0)
//				System.out.print(" "+a[i]);
//		}
		for(int i:a)
		{
			i+=2;
			System.out.print(" "+i);
		}
	}

}
