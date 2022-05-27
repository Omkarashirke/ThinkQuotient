

import java.util.Scanner;

public class Transpose 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		
		System.out.println("Enter element of a:");
		int a[][] = new int[row][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("a:"+"\n");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print("  "+y);
			}
			System.out.println();	
		}
		System.out.println("output element of b:");
		int b[][] = new int[row][col];
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				b[j][i] = a[i][j];
			}
		}
		System.out.println("b:"+"\n");
		for(int x[]:b)
		{
			for(int y:x)
		{
			System.out.print("  "+y);
		}
		System.out.println();	
		}

	}

}
