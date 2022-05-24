

public class Elements {

	public static void main(String[] args)
	{
		
int a[] = {-1,22,-5,65,-44,-4,3,-66};
		
		int j=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				if(i!=j)
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
				j++;
			}
		}
	}
}
