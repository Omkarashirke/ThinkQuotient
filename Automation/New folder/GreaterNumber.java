

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number a= ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number b= ");
		int b = sc.nextInt();
		
		if (a>b)
		{
			System.out.println("A is Greater Than B=" +a);
		}
		else
		{
			System.out.println("B is Greater Than A=" +b);
		}

	}

}
