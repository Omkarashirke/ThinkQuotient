

import java.util.Arrays;
import java.util.Scanner;

public class Stud 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		String a[] = new String[size];
		
		for(int i=0; i<a.length; i++)
		{
				System.out.println("Enter the elements:");
				a[i] = sc.next();
		}
		System.out.println("Name when insert:"+"\n");
		for(int i=0; i<a.length; i++)
		{
				System.out.println("  "+a[i]);
		}
		
		System.out.println("Sorted output:"+"\n");
		String temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
					
			}
		}
		for(String i:a)
		{
			System.out.print("   "+i);
		}
		
	}

}
