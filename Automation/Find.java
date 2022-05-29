

public class Find {

	public static void main(String[] args) 
	{
		
		int count = 0, count1 = 0, count2 = 0, count3 = 0;
		String s = "Java is coding language 100";
		char ch[] = s.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || 
					ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' ||ch[i] == 'U')
			{
				count++;
			}
			
			else if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
			{
				count1++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				count2++;
			}
			else
			{
				count3++;
			}
		}
		System.out.println("Vowels:  "+count);
		System.out.println("Consonants:  "+count1);
		System.out.println("Digits:  "+count2);
		System.out.println("White Space:  "+count3);

	}

}
