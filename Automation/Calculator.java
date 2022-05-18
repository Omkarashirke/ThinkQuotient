

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number num1= ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Number num2= ");
		int num2 = sc.nextInt();
		
		int add, sub, mul;
		float div;
		
		add = num1 + num2;
		System.out.println("Addition= "+add);
		
		sub = num1 - num2;
		System.out.println("Substraction= "+sub);
		
		mul = num1 * num2;
		System.out.println("Multiplication= "+mul);
		
		div = num1 / num2;
		System.out.println("Division= "+div);

	}

}
