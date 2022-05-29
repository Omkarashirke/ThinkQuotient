

public class DecendingOrder 
{

	public static void main(String[] args) 
	{

		String s = "I Like Love Java program";
		String a[] = s.split("\\s");
		
		for(int i=0; i<a.length; i++)
		{
			String temp = "" ;
			char[] word;
			for(int j=i+1; j<a.length; j++)
			{
			
				if(a[i].length()<a[j].length())
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
				else if(a[i].length()==a[j].length())
				{
//					}
					if(a[i].compareTo(a[j])<0)
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.print(a[i]+" ");
		}
		
		
	}

}
