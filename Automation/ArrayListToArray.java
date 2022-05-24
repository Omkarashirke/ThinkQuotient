package com.SeleniumWebDriver;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(65);
		al.add(90);
		al.add(75);
		al.add(85);
		al.add(12);
		al.add(15);
		al.add(20);
		
		
		Integer at[]=new Integer[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			at[i]=al.get(i);
		}
		for(Integer i : at)
		{
			System.out.println(i);
		}

	}

}
