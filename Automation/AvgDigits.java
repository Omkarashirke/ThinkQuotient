

public class AvgDigits {

	public static void main(String[] args) 
	{
		
		String s = "a5i9gfj4tabc";
		
		int sum = 0, count = 0;
		char a[] = s.toCharArray();
		float avg = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>='0' && a[i]<='9')
			{
				sum += Character.getNumericValue(a[i]);
				count++;
			}
		}
		System.out.println("Sum: " +sum);
		System.out.println("Average: " +(sum/count));
		
	}

}
