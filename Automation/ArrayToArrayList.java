package com.SeleniumWebDriver;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) 
	{
		
		Integer a[] = {65,2,58,45,62,75};
		List<Integer> l = Arrays.asList(a);	
		for (Integer i: l)
		{
			System.out.println(i);
		}

	}

}
