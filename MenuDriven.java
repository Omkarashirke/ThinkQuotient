

import java.util.Scanner;

public class MenuDriven 
{
	public void addition(int n1, int n2)
	{
		System.out.println("Addition="+(n1 + n2));
	}
	public void substraction(int n1, int n2)
	{
		System.out.println("substraction="+(n1 - n2));
	}
	public void multiplication(int n1, int n2)
	{
		System.out.println("multiplication="+(n1 * n2));
	}
	public void division(int n1, int n2)
	{
		if(n1>n2)
			System.out.println("division="+(n1 / n2));
		else
			System.out.println("n1 is less than n2");	
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		MenuDriven md = new MenuDriven();
		char ch;
		do
		{
			System.out.print("Enter the 1st number = ");
			int n1 = sc.nextInt();
			System.out.print("Enter the 2nd number = ");
			int n2 = sc.nextInt();
			
			System.out.println("  1. Addition  \n  2. Substraction  \n  3. Multiplication  \n  4. Division");
			System.out.print("Enter the choice from menu = ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: md.addition(n1, n2);
						break;
				case 2: md.substraction(n1, n2);
						break;
				case 3: md.multiplication(n1, n2);
						break;
				case 4: md.division(n1, n2);
						break;
				default: System.out.println("Invalid Choice");
			}
			System.out.println("!!!Do you want to continue!!!");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');

	}

}
