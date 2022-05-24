

public class ArrayEle 
{

	public static void main(String[] args) 
	{

		int a[] = {1,2,3,4,4,3,2,1};
		int b[] = new int[a.length/2];
		int c[] = new int[a.length/2];
		for(int i=0; i<b.length; i++)
		{
			b[i] = a[i];
			//System.out.print("  "+b[i]);
			for(int j=(a.length-1)/2; j>=0; j--)
			{
				c[j] = a[i];
				//System.out.print("  "+c[i]);
				
			}
			if(c[i]==b[i])
			{
				System.out.print(" Match ");
			}
			else
			{
				System.out.print(" NotMatch ");
			}
		}


	}

}
