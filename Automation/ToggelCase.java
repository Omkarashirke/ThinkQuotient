package com.Day7;

import java.util.Scanner;

public class ToggelCase {

	public static void main(String[] args)
	{
	 String str;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string= ");
	 str=sc.nextLine();
	 char a[]=str.toCharArray();
	     for(int c=0;c<a.length;c++)
	     {
	         if(a[c]>='A' && a[c]<='Z')
	         {
	             a[c]=(char)((int)a[c]+32);
	         }
	         else if(a[c]>='a' && a[c]<='z')
	         {
	             a[c]=(char)((int)a[c]-32);
	         }
	     }
	       System.out.println("The toggled string= ");
	 for(int c=0;c<a.length;c++)
	     System.out.print(a[c]);	
	}

}
