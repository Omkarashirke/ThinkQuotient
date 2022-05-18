

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		
		int num = 371;
		int a = num;
		
		int c;
		
		int sum = 0;
		
		while(num>0)
		{
			c = num % 10;
			num = num /10;
			
			sum = sum + c * c* c;
			
		}
		
		if(a==sum)
			   System.out.println(" Number is Armstrong  = ");
	    else
	         System.out.println(" Number is Not Armstrong = ");
	


	}

}
