
import java.util.Scanner;

public class Avg {

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
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
		
		
		//Row wise sum
//		int sum = 0;
//		float avg = 0;
//        for (int i = 0; i < a.length; i++) {
//            int rSum = 0;
//            for (int j = 0; j < a.length; j++) {
//                sum += a[i][j];
//                rSum += a[i][j];
//                avg = rSum/row;
//            }
//            System.out.println("Row " + (i + 1) + " sum = " + rSum);
//            
//            System.out.println("Avg " + (i + 1) + " Avg = " + avg);
//            
//        }
      float avg =0; int sum1 = 0;
        for(int i[]:a)
        {
        	int sum = 0;
        	for(int j:i)
        	{
        		sum += j;
//        		sum1 = sum;
        		System.out.println(" S = " + sum);
        		avg = sum/i.length;
        	}
        	
        	  System.out.println(" Avg = " + avg);
        }
        System.out.println();
	}

}
