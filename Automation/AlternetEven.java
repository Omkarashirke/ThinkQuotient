//Print Alternet Even Number.


import java.util.Scanner;

public class AlternetEven {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Nmuber = ");
		
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i=i+2)
		{
			if(i%2==0)
				System.out.print("  " +i);
		
				i = i+ 2;
			
			//System.out.print("  " +i);
				
		}

	}

}
