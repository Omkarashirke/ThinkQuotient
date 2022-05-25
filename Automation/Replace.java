

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[a.length];
		System.out.println("Enter the element:");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			b[i] = a[i]%10;
			if(b[i]==9)
			{
				b[i] = 0;
			}
			else 
			{
				b[i]=a[i];
			}
			System.out.print("   "+b[i]);
		}
		sc.close();
	}

}
