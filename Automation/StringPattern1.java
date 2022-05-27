
public class StringPattern1 {

	public static void main(String[] args)
	{
/*--------------Print Pattern of "I Like India Country"---------------*/
		String s = "I Like India Country";
		String a[] = s.split("\\s");

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("  "+a[j]);
			}
			System.out.println();
		}

	}

}
