
public class Immutable
{

	public static void main(String[] args) 
	{
		
		String s = "Omkar";
		String s1 = s.intern();
		System.out.println(s1 == s);
		
		s = s + "  " + "Shirke";
		System.out.println("New Value of s: "+s);
		System.out.println("Value of s1: "+s1);

	}

}
