

public class FullName {

	public static void main(String[] args) 
	{
		
		String s ="Omkar Anil Shirke";
		String a[] = s.split("\\s");
		String name = "";
		String word ="";
		for(int i=0; i<a.length-1; i++)
		{
			word = word + a[i].charAt(0)+".";
			name = word  +a[a.length-1];
		}
		System.out.print(name);

	}

}
