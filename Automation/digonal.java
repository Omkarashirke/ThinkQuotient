

import java.util.Scanner;

public class digonal {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println("Enter the Elements:");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array:"+"\n");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
					System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Digonal:"+"\n");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				if(i==j || i==a[i].length-1 && j==0 || i==0 && j==a[i].length-1)
					System.out.print("  "+a[i][j]);
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
