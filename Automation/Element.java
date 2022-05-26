

import java.util.Arrays;
import java.util.Scanner;

public class Element 
{
	int a[][];
	Element(int a[][])
	{
		this.a = a;
	}
	public String toString()
	{
		return Arrays.toString(a);
	}

	public static void main(String[] args) 
	{
		
		Element e[] = new Element[2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.println("Enter the Elements:");
				a[i][j] = sc.nextInt();
			}
			e[i] = new Element(a);
		}
		for(int i=0; i<e.length; i++)
		{
			for(int j=0; j<e.length; j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}

	}

}
