

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) 
	{
		
		StringBuffer sb = new StringBuffer("Keesp");
		StringBuffer sb1 = new StringBuffer("Peek");
		String s = sb.toString();
		String s1 = sb1.toString();
		String str1 = s;
		String str2 = s1;
		
		str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();


	    if(str1.length() == str2.length()) 
	    {
/*------------------convert strings to char array---------------------*/
	      char ch[] = str1.toCharArray();
	      char ch1[] = str2.toCharArray();
	      int count = 0;
/*-------------------sort the char array---------------------*/
	      for(int i=0; i<ch.length; i++)
	      {
	    	 
	    	  for(int j=0; j<ch.length; j++)
	    	  {
	    		  if(ch[i] == ch1[j]) 
			      {
			        count = 1;	
			        break;
			      }
	    	  }
	    	  
	      }
	      if(count == 1) 
	      {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else
	      {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	  
	    }
	    else
	    {
	      System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }
		

	}

}
