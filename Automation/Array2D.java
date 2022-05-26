
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row:");
		int row = sc.nextInt();
		System.out.println("Enter the column:");
		int col = sc.nextInt();
		
		int a[][] = new int [row][col];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println("Enter the Elements:");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
//		for(int x[]:a)
//		{
//			for(int y:x)
//			{
//				System.out.print("  "+y);
//			}
//			System.out.println();
//		}
		
//System.out.println("///////////////////////////////////////////////////////////////////////");	
//		int [][]a1 = new int [row][col]; 
//		for(int i=0; i<a1.length; i++)
//			{
//				for(int j=0; j<a1[i].length; j++)
//				{
//					System.out.println("Enter the Elements:");
//					a1[i][j] = sc.nextInt();
//				}
//			}
//
//		for(int i=0; i<a1.length; i++)
//		{
//			for(int j=0; j<a1[i].length; j++)
//			{
//				System.out.print("  "+a1[i][j]);
//			}
//			System.out.println();
//		}
//		for(int x[]:a1)
//		{
//			for(int y:x)
//			{
//				System.out.print("  "+y);
//			}
//			System.out.println();
//		}


//System.out.println("///////////////////////////////////////////////////////////////////////");	
//
//int []a2[] = new int [row][col]; 
//for(int i=0; i<a2.length; i++)
//	{
//		for(int j=0; j<a2[i].length; j++)
//		{
//			System.out.println("Enter the Elements:");
//			a2[i][j] = sc.nextInt();
//		}
//	}

//for(int i=0; i<a2.length; i++)
//{
//	for(int j=0; j<a2[i].length; j++)
//	{
//		System.out.print("  "+a2[i][j]);
//	}
//	System.out.println();
//}
//for(int x[]:a2)
//{
//	for(int y:x)
//	{
//		System.out.print("  "+y);
//	}
//	System.out.println();
//}
		

		
//System.out.println("///////////////////////////////////////////////////////////////////////");			
		
	}

}
