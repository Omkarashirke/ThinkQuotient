

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s = sc.nextLine();

		String s1 = null;
		int sum = 0;
		int temp = 0;
		String a[] = s.split("\\s");
		
		for(int i=0; i<a.length; i++)
		{
			s1 = a[i].replaceAll("[^0-9]", "0");
			temp = Integer.parseInt(s1);
			sum += temp;
		}
		System.out.println(sum);

	}

}
