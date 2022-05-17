

import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number= ");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Given Number Is positive= " +num);
		}
		else if(num<0)
		{
			System.out.println("Given Number Is Negative= " +num);
		}
		else
		{
			System.out.println("Given Number Is Zero= " +num);
		}

	}

}
