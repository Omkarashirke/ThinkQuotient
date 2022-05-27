
import java.util.Scanner;
import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		String s = "Omkar";
		System.out.println("Forward:  "+s);
		char ch[] = s.toCharArray();
		System.out.println("Reverse:  ");
		for(int i=ch.length-1; i>=0; i--)	
		{
			
			System.out.print(" "+ ch[i]);
			
		}
	}

}
