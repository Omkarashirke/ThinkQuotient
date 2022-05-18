// Frequency of digits.


public class FreqDigit
{

	public static void main(String[] args) 
	{

		int num = 3448465;
		int ref, b, c = 0;
		
		for(int i=1; i<=9; i++)
		{
			int count = 0;
			int a = num;
			for(;a>0;a=a/10)
			{
				ref = a % 10;
				if(ref==i)
				{
					count++;
					//b=ref;
				}
				//a = a/10;
			
			}
			if(count>=1)
				System.out.println("Frequency of "+i+" is "+count);
		}
		

	}

}
