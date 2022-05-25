

import java.util.Scanner;

public class SkipDuplicate {

	public static void main(String[] args) 
	{
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for a=");
		int sizea = sc.nextInt();
		
		System.out.println("Enter the first Values=");
		int a[] = new int[sizea];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size for b=");
		int sizeb = sc.nextInt();
		System.out.println("Enter the Second Values=");
		int b[] = new int[sizeb];
		
		for(int i=0; i<b.length; i++)
		{
			b[i] = sc.nextInt();
		}
		
		int c[] = new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
		{
			boolean f=false;
			  for(int k=count-1;k>=0;k--)
			  {
				  if(a[i]==c[k])
				  {
					  f=true;
					  break;
				  }
			  }
			  if(f==false)
			  {
				  c[i] = a[i];
				  count++;
			  }
		}

		for(int i=0; i<b.length; i++)
		{
		boolean f=false;
		  for(int k=count-1;k>=0;k--)
		  {
			  if(b[i]==c[k])
			  {
				  f=true;
				  break;
			  }
		  }
		  if(f==false)
		  {
			
			
			c[count++] = b[i];
		  }
		}
		for(int i=0; i<count; i++)
		{
				System.out.print("  "+c[i]);
		}

	}

}
