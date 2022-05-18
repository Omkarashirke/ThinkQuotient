//8.	WAP to check no is Krishnamurthy or not (Using while loop) i.e. 153 = 1! + 5! + 3! = 153



public class NoIsKrishnamurthy {

	public static void main(String[] args) 
	{
		int num = 153;
		int a= num;
		int b=num;
		int digit=b%10;
		int count, sum = 0;
		while(a>0)
		{
		count = a % 10;	//showing last digit of a;
		sum += Math.pow(count, digit); 	//take power of base and store into sum;
		a = a/10;	//removing last digit;
		}
		
		if(sum == num)
	         System.out.println(" Number is Krishnamurthy = "+sum);
	    else
	         System.out.println(" Number is Not Krishnamurthy = "+sum);
	}

}
