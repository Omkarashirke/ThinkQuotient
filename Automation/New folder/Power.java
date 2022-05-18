

import java.util.Scanner;

public class Power {

	public static void main(String[] args) 
	{
			
		int power=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value of Base =");
		int b = sc.nextInt();
		
		System.out.print("Enter The Value of Exponent =");
		int e = sc.nextInt();
		
		if(b>0)
		{
		while(e>=1)
		{
			
			power= power * b;
			e--;
		}

		System.out.print(" "+power);
		}
		else
			System.out.println(""+b);
	}

}
