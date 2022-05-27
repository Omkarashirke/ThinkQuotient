

public class UppercaseLowercase 
{

	public static void main(String[] args) 
	{
		
		String s = "OmkaR";
		char ch[] = s.toCharArray();
		
		String word = "";
		for(int i=0; i<ch.length; i++)
		{
			
			if(ch[i]>='A' && ch[i]<='Z')
			{
				word = word + ((char) ((int)ch[i]+32));
			}
			else
			word  = word + ch[i];		
		}
		System.out.println(word);

	}

}
