

public class Separate {

	public static void main(String[] args) 
	{
		
		int count = 0;
		int a[] = {12, 0, 7, 0, 8, 0, 3};
		int b[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				b[i] = a[i];
				count++;
				System.out.print("   "+b[i]);
			}
			
		}
		
		for(int i=count; i<a.length; i++)
		{
			b[count++]=0;
			System.out.print("   "+b[i]);
		}
		
	}

}
