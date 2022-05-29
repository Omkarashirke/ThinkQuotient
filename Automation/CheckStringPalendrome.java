

public class CheckStringPalendrome {

	public static void main(String[] args)
	{

		StringBuffer sb = new StringBuffer("nain");
//		 sb.reverse();
		 String forw = sb.toString();
		
		StringBuffer reverse = sb.reverse();
		 String rev = reverse.toString();
		
		if(forw.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
		

	}

}
