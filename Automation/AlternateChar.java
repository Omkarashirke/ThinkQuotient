

public class AlternateChar {

	public static void main(String[] args)
	{
		
		char ch[]= {'a', 'b', 'D','T', 'X', 'Z'};
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]<='A' && ch[i]<='Z')
			{
				
				ch[i]=(char)(ch[i]+2);
		
				if(ch[i]=='Z')
				{
					ch[i]=(char)(ch[i]-25);
				}
			}
			else 
			{
				if(ch[i]=='z' || ch[i]=='y')
				{
					ch[i]=(char)(ch[i]-24);
				}
				ch[i]=(char)(ch[i]+2);
				
			}
			System.out.println("  "+ch[i]);
		}
		
	}

}
