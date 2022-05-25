
import java.util.Scanner;

public class Toggel {

	public static void main(String[] args)
	{

		char ch[] = {'A', 'f','D','g','h','L'};
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]= (char) (ch[i]+32);
			}
			else 
			{
				ch[i]=(char)(ch[i]-32);
			}
			System.out.print("  "+ch[i]);
		}

	}

}
