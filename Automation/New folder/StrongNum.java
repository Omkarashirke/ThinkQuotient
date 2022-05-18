import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num;
		int digit=0, sum = 0;
		int n = 1;
		while(temp != 0)
		{
			digit=temp%10;
            
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact*=i;
            }
           
            sum+=fact;
            temp=temp/10;
			
		}

		if(sum == num)
			System.out.println(" is a strong number");
			else
			System.out.println(" is not a strong number");
			System.out.println();
	}

}
