
public class LargeWordLength {

	public static void main(String[] args) 
	{
		
		String s = "This is an umbrella";
		String a[] = s.split("\\s");
		String largest = "", smallest = ""; 
		int large = 0, small = 0;
		
		for(int i=0; i<a.length; i++)
		{
			
			if(a[i].length()>large)
			{
				large = a[i].length();
			}
			if(a[i].length()<small)
			{
				small = a[i].length();
			}
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i].length()==large)
			{
				System.out.println("Largest Word: " + a[i]);
			}
			if(a[i].length()==small)
			{
				System.out.println("Smallest Word: " + a[i]);
			}
		}

	}

}
