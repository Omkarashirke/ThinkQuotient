

public class DeleteChar {

	public static void main(String[] args) 
	{
		String s = "I Love Java";
		String s1 = "I Like Sql";
		
		char a[] = s.toCharArray();
		char b[] = s1.toCharArray();
		String code = "";
		for(int i=0; i<a.length; i++)
		{
			String word ="";
			for(int j=0; j<b.length; j++)
			{
				if(a[i] == b[j])
				{
					a[i] = ' ';
					word = word + a[i];
				}
				code = code + word ;
				
			}
			System.out.print(a[i]);
		}

	}

}
