//Number is Spy or Not


public class SpyNumber {

	public static void main(String[] args)
	{
		
		int i = 1236;
		int num;
		int sum= 0, mul=1;
		while(i>0)
		{
			num = i % 10;
			sum += num;
			mul *= num;
			i = i/10;
			
		}
	
		if(sum==mul)
		System.out.println(" Number Is Spy = " +" sum " + sum+ " mul  "+mul);
		else
			System.out.println(" Number Is Not Spy = " + " sum " + sum+ "  mul "+mul);
			
	}

}
