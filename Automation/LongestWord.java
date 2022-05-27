

public class LongestWord {

	public static void main(String[] args) 
	{

		StringBuffer sb = new StringBuffer("I love Java");
		String s = sb.toString();
		String a[] = s.split("\\s");
		int large = 0;
		int count = 0;
		String largest = "";
		
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i].length()>large)
			{
				large = a[i].length();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()==large)
			{
				System.out.println(a[i]);
			}
		}

	}

}
