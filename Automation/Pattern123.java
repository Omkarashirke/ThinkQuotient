

public class Pattern123 {

	public static void main(String[] args) 
	{
		
		int a[][] = {{1,2,3,4},
					{6,8,5,3},
					{2,7,8,1},
					{6,8,9,2}};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(i==0 || i==a.length-1 || i + j==a.length-1)
					System.out.print("  "+a[i][j]);
				else 
					System.out.print( "   ");
			}
			System.out.println();
		}
					

	}

}
