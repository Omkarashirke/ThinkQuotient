

public class Compare {

	public static void main(String[] args) 
	{
		
		String s = "Omkar";
		String s1 = s.intern();
		System.out.println(s1 == s);
		
		String name = new String("Omkar");
		String name1 = name.intern();
		System.out.println(name1 == name);

	}

}
