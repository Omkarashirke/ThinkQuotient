//Sum Of Even Numbers.



public class SumAllOfEven {

	public static void main(String[] args)
	{
		
	
		int num = 20;
		int sum = 0;
		for(int i=0; i<=20; i++)
		{
			if(i%2==0)
			{
				sum = sum + i;
				
			}
			
		}
		System.out.println(" " +sum);
	}

}
