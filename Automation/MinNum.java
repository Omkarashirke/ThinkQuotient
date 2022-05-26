

import java.util.Scanner;

public class MinNum {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		
		System.out.println("Enter the element:");
		int a[][] = new int[row][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("a: " + "\n");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print("  "+y);
			}
			System.out.println();
		}
		for(int i=0; i<a.length; i++)
		{
			int min = a[0][i];

	        for (int j = 0; j < a[0].length; j++) {

	            if (a[j][i] < min) {
	                min = a[j][i];
	            }
	        }
			System.out.println("Min = "+min);
		}

	}

}
