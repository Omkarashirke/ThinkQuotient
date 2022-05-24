

import java.util.Scanner;

public class Average 
{
	public static int average(int[] array)
	{
		int sum = 0, count = 0;
		for(int s : array)
		{
			sum += s;
			++count;
		}
		int avg = sum/count;
		return avg;
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the values:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();		
		}
		System.out.println("Average : "+average(arr));
		
		sc.close();
	}

}
