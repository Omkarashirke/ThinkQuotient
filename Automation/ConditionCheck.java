
public class ConditionCheck {

	public static void main(String[] args)
	{
		
		String s = "123321";
		char ch[] = s.toCharArray();
		int a[] = new int[s.length()/2];
		int b[] = new int[s.length()/2];
		int temp = 0, temp1 = 0;
		for(int i=0; i<a.length; i++)
		{
			temp=ch[i];
			a[i] += Character.getNumericValue(ch[i]);
			System.out.println(a[i]);
		}
		for(int i=b.length-1; i>=0; i--)
		{
			temp1=ch[i];
			b[i] += Character.getNumericValue(ch[i]);
			System.out.println(b[i]);
		}
		for(int i=b.length-1; i<=b.length-1; i++)
		{
			if(a[i]==b[i])
				System.out.println("Match");
			else
				System.out.println("NotMatch");
		}

	}

}
