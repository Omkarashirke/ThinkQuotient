

import java.util.Scanner;

public class AlternateElement {

	public static void main(String[] args) 
	{
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size ");
		int a[] = {1,5,9,3};
		
		for(int i=0; i<a.length; i++)
		{
			a[i]+=2;
			System.out.println("  "+a[i]);
		}

	}

}
