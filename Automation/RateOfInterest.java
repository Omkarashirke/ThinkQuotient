

import java.util.Scanner;

public class RateOfInterest 
{
	//int amount;
	RateOfInterest(int amount, float rate)
	{
	System.out.println("5% rate of interest =" +((amount * rate)/100));
			
	}
	RateOfInterest(int amount, double rate, float c,int month)
	{
		if(month>=1 || month<=6)
		{
			System.out.println("15% rate of interest =" +((amount * rate)/100));
		}
		else
		{
			System.out.println("15% rate of interest =" +((amount * rate*c)/100));
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount=");
		int amount = sc.nextInt();
		
		System.out.print("Enter the Month=");
		int month = sc.nextInt();
		
		//if(month>=1 || month<=6)
		{
			RateOfInterest r = new RateOfInterest(amount, 1.0f);
		}
		//else
		{
			RateOfInterest rr = new RateOfInterest(amount, 1.5f, 1.5f,month);
		}
		//RateOfInterest r = new RateOfInterest(amount, 1.0f);
		//RateOfInterest rr = new RateOfInterest(amount, 1.5f, 1.0f);

	}

}
