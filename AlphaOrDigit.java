

import java.util.Scanner;

public class AlphaOrDigit {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Input Value=");
		
		char val = sc.next().charAt(0);
		
		if(val>='0' && val<='9')
		{
			System.out.println("Given Value Is Digit= " +val);
		}
		else if(val>='a' && val<='z')
		{
			System.out.println("Given Value Is Alphabet= " +val);
		}
		else 
		{
			System.out.println("Given Value Is Spacial Symbol= " +val);
		}
		
	}

}
