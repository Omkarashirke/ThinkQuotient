

public class FacedatingNum {

	public static void main(String[] args) 
	{
		
		int num =192;
		int n = num; int count = 0;
		int digit = 0; int mul = 1;
		String s = "";
		
		while(n>0)
		{
			digit = n%10;
//			System.out.println(digit);
			count++;
			n = n/10;
		}
//		System.out.println(count);
		
		for(int i=1; i<=count; i++)
		{
			mul = i * num;
//			System.out.println(mul);
			s += mul;
		}
		System.out.println("Concat Numbers:"+s);
		
		int count1 = 0;
		char a[] = s.toCharArray();
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count1++;
				}
			}
		}
		if(count1==0)
		{
			System.out.println("Number is Fascinating");
		}
		else
		{
			System.out.println("Number is Not Fascinating");
		}

	}

}
