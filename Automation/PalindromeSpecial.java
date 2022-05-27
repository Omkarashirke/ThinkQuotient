

public class PalindromeSpecial {

	public static void main(String[] args)
	{
		
		String s = "EXISTENCE";
		String s1 = "";
		char ch[] = s.toCharArray();
		char a = ' ', b = ' ';
		for(int i=ch.length-1; i>=0; i--)
		{
			char word = ' ';
			for(int j=0; j<ch.length; j++)
			{
				word = ch[i];
			}
			s1 = s1 + word;
		}
		
		if(s.equals(s1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		for(int i=0; i<ch.length; i++)
		{
			a = ch[0];
			b = ch[i];
		}
		if(a == b)
		{
			System.out.println("Special");
		}
		else
		{
			System.out.println("NOt Special");
		}

	}

}
