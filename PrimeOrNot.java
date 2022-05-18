//Check Number is Prime or Not.


import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter The Value Of Num = ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i<=num; i++)
		{

				if(num%i==0)
				
					count++;
		}
		if(count==2)
			System.out.println( " Number Is Prime =  " +num);
		else 
			System.out.println( " Number Is Not Prime = " +num);

	}

}
