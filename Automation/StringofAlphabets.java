

public class StringofAlphabets
{

	public static void main(String[] args) 
	{

		String s = "abcdadabca";
		char ch[] = s.toCharArray();
		int  temp = 0, temp1= 0;
		char a = ' ';
		char b = ' ';
		for(int i=0; i<ch.length; i++)
		{
			int count = 0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
				}
				a = ch[i];
				temp = count;
				
			}
			System.out.println("Word  "+ a + "  occure   "+temp);
			
			if(temp>temp1)
			{
				b = ch[i];
				temp1 = temp;
			}
		}
		System.out.println("Alphabet with maximum occurrence: " +"Word  " + b +"  occure  "+temp1);
	}

}
