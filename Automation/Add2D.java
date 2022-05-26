

import java.util.Scanner;

public class Add2D 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		
		System.out.print("A: "+"\n");
		int a[][] = new int[row][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println("Enter the Elements:");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("B: "+"\n");
		int b[][] = new int[row][col];
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				System.out.println("Enter the Elements:");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("C: "+"\n");
		int c[][] = new int[row][col];
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c[i].length; j++)
			{
				c[i][j]=a[i][j] + b[i][j];
				System.out.print("  "+c[i][j]);
			}
			System.out.println();
		}


	}

}
