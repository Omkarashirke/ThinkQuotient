

public class ReverseSecntence {

	public static void main(String[] args) 
	{
		String s = "I Love India";
		String a[] = s.split("\\s");
/*-------------Original String--------------------*/
		
		System.out.print("Original Code: "+"\n");
		System.out.print(s);
/*-------------Reverse Order Code------------------*/		
		System.out.println();
		System.out.print("\n"+"Reverse Code: "+"\n");
		String stringCode="";
		for(int i=0; i<a.length; i++)
		{
			char ch[] = a[i].toCharArray();
			String stringWord="";
			for(int j=ch.length-1; j>=0; j--)
			{
				stringWord=stringWord+ch[j];
			}
			stringCode=stringCode+stringWord+" ";
		}
		System.out.println(stringCode);
	}

}
