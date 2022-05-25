

import java.util.Scanner;

public class TenNum {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("First 10 values:");
	
		int c[] = new int[10];
		
		int a[] = new int[10];
		
		int b[] = new int[10];
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Second 10 values:");
		for(int i=0; i<b.length; i++)
		{
			b[i] = sc.nextInt();
		}
		System.out.println("Common Number: ");
		for(int i=0; i<c.length;i++)
		{
			if(a[i]==b[i])
			{
				c[i]=b[i];
			}
			if(c[i] != 0)
			System.out.print("   "+c[i]);		
		}

	}

}
