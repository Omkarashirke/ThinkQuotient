

import java.util.Scanner;

public class Array2D1 
{
	int b1[][], x1;
	
	Array2D1(int row, int col)
	{
		b1 = new int [row][col];
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		int b1[][] = new int[row][col];
		for(int i=0; i<b1.length; i++)
		{
			for(int j=0; j<b1[i].length; j++)
			{
				System.out.println("Enter the Elements:");
				b1[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<	b1.length; i++)
		{
			for(int j=0; j<b1[i].length; j++)
			{
				System.out.print("  "+b1[i][j]);
			}
			System.out.println();
		}

	}

}
