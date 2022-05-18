import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Year:");
		int year = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<100; i+=4)
		{
			if(year % 4 == 0)
			{
				System.out.println(year+ ", ");
				year += 4;
			}
			else 
			{
				year += 1;
			}
		}

	}

}
