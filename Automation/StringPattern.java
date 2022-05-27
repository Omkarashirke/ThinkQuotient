
public class StringPattern 
{
	

	public static void main(String[] args) 
	{
/*--------------Print Pattern of "India"---------------*/		
		String s = new String("India");
		char ch[] = s.toCharArray();
		for(int i=0; i<=ch.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  "+ch[j]);
			}
			System.out.println();
		}
		
	}

}
