//4.  Write a program to calculate area of rectangel.


import java.util.Scanner;

public class AreaofRectangle {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The First Value of l = ");
		int l = sc.nextInt();
		
		System.out.print("Enter The First Value of b = ");
		int b = sc.nextInt();
		
		int area=0;
		
		area = l * b;
		
		System.out.println("Show Value of Area = " + area);
	}

}
