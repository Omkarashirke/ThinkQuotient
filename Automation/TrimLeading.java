

public class TrimLeading 
{

	public static void main(String[] args) 
	{
		
		String s = "   Omkar Shirke   ";
		
/*---------------------------using string function-----------------------------*/
		System.out.println("using string function: " +s.trim());
		
/*---------------------------without using string function-----------------------------*/
		char ch[] = s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] != ' ')
			{
				System.out.print(ch[i]);
			}
		}

	}

}
