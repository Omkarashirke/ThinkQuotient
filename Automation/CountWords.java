

public class CountWords {

	public static void main(String[] args)
	{
		int count = 0;
		String s ="java string split method by Core Java";  
		String c[] = s.split("\\s");
		for(int i=0; i<c.length; i++)
		{
			count++;
		}
		System.out.println("Count: " +count);

	}

}
