
public class Pattern 
{
	public static void main(String[] args)
	{
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=1; j--)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=1; j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		int count = 1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		int count1 = 1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(count1+ " ");
				count1 += 2;
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		int count2 = 2;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(count2+ " ");
				count2 += 2;
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(i * j+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(j+ " " + i+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(i+ " " + j+ " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		int k;
		for(int i=1; i<=5; i++)
		{
			k = i;
			for(int j=1; j<=5; j++)
			{
				System.out.print(k+ " ");
				k += 5;
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==1 || i==5 || i==j)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for (int i = 1; i <= 5; i++) 
        { 
			for (int j = 5; j > i; j--)
            {
				System.out.print(" ");
            }
			for (int k1 = 1; k1 <= (i * 2) - 1; k1++) 
            { 
				System.out.print("*"); 
            } 
            System.out.println(); 
        } 
		System.out.println("--------------------------------------");
		
	}
}
