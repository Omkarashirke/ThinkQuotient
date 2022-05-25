

import java.util.Scanner;

public class Sum123 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size=");
		int size  = sc.nextInt();
		
		System.out.println("Enter the elements=");
		int a[] = new int[size];
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i : a)
		{
			sum += i;
		}
		System.out.println("Sum=" +sum);

	}

}
