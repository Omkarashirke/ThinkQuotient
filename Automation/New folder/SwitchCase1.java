

import java.util.Scanner;

public class SwitchCase1 
{

	public static void main(String[] args) 
	{
		int add, sub, mul, div;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number a = ");
		int a = sc.nextInt();
		
		System.out.print("Enter the first number b = ");
		int b = sc.nextInt();
		
		System.out.print("Enter the Operation = ");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a': 
					System.out.println("Addition = " +(a + b));
					break;
		case 's': 	
					System.out.println("Addition = " +(a - b));
					break;
		case 'm': 	
					System.out.println("Addition = " +(a * b));
					break;
		case 'd': 	
					System.out.println("Addition = " +(a / b));
					break;
					
		}

	}

}
