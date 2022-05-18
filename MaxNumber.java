//1.	Write a java program to find maximum number from given 3 numbers.



import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number a = ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number b = ");
		int b = sc.nextInt();
		
		System.out.print("Enter First Number c = ");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is Greast Number =" + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Greast Number =" + b);
		}
		else
			System.out.println("C is Greast Number =" + c);


	}

}
