

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size=");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements=");
		int a[] = new int[size];
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int max = a[0], min = a[0];
		for(int i=0; i<size; i++)
		{
			if(a[i]>max)
				max = a[i];
			
			
			else if(a[i]<min)
				min = a[i];
			
		}System.out.println(max);System.out.println(min);

	}

}
