

import java.util.Scanner;

public class DiagonalEle 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the col:");
		int col = sc.nextInt();
		
		int sum = 0;
		int a[][] = new int[row][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					sum += a[i][j];
				}
			}
			System.out.println("Sum= "+sum);
		}


	}

}
