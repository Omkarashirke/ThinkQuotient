

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Numer= ");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given Number Is Even= " +num);
		}
		else
		{
			System.out.println("Given Number Is Odd= " +num);
		}

	}

}
