
public class StringReverseWord {

	public static void main(String[] args) 
	{
		int count = 0;
		String s = "I Like India Country";
		String a[] = s.split("\\s");
		for(int i=0; i<s.length(); i++)
		{
			count++;
		}
		String b = null;
		for(int j=0; j<a.length; j++)
		{
			b = s.substring(2, 4);
			
//			System.out.println("  "+s.substring(j, count));
		}
		System.out.println("  "+b);
	}

}
