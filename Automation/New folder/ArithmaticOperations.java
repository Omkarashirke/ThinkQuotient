//1.  Write a program to perform all arithmatic operations.



import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Value of a =");
		int a = sc.nextInt();
		System.out.print("Value of b=");
		int b = sc.nextInt();
	
		int add, sub, mul;
		float div=0.0f;
		
		add = a + b;
		System.out.println(" Addition of two numbers " + add);;

		sub = a - b;
		System.out.println(" Addition of two numbers " + sub);

		mul = a * b;
		System.out.println(" Addition of two numbers" + mul);

		div = a / b;
		System.out.println(" Addition of two numbers" + div);


	}

}
