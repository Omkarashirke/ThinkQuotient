

public class FindSubstring 
{

	public static void main(String[] args) 
	{
		
		String s = "Avinash is a cricket player and he is a captain of the";
		String a[] = s.split("\\s");
		int is = 0, of = 0;
		
		is = s.indexOf("is");
		of = s.indexOf("of");
		
		System.out.println("  " + s.substring(is, of));

	}

}
