

import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		int arrcopy[][] = new int[row][col];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter the elements:");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("arr:"+"\n");
		for(int x[]: arr)
			{
				for(int y:x)
				{
					System.out.print("   "+y);
				}
				System.out.println();
			}
		System.out.println("arrcopy:"+"\n");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=arrcopy[i].length-1; j>=0; j--)
			{
				arrcopy[i][j] =  arr[i][j];
				System.out.print("   "+arrcopy[i][j]);
			}
			System.out.println();
		}
		
	}

}
