

public class StringBasicMethod {

	public static void main(String[] args)
	{
		/*	String "Length" Method	*/
		String s = "OmkarShirke";
		System.out.println("Lenght of String: " +s.length());
		
		/*	String "indexOf" Method	*/
		System.out.println("Index of character 'S': " +s.indexOf("S"));
		
		/*	String "charAt" Method */
		System.out.println("Character at position 4: " +s.charAt(4));
		
		/*	String "CompareTo" Method	*/
		//Compare;
		System.out.println("Compare to : " +s.compareTo("omkarshirke"));
		//Ignore;
		System.out.println("Ignorer to : " +s.compareToIgnoreCase("omkarshirke"));
		
		/*	 String "Contain" Method 	*/ 
		System.out.println("Contains the chars: " +s.contains("rke"));
		
		/* 	String "endsWith" Method 	*/
		System.out.println("Ends with char: " +s.endsWith("e"));
		
		/* 	String "replaceAll" & "replaceFirst" Method 	*/
		System.out.println("Replace with: " +s.replace("Omkar", "Saurabh"));
		
		/* 	String Java "tolowercase" & Java "touppercase"	 */
		//tolowercase;
		System.out.println("Lower to Upper: " +s.toLowerCase());
		//touppercase;
		System.out.println("Lower to Upper: " +s.toUpperCase());
		
		/*	 String "Concat" method 	*/
		String s1 = " brother of ";
		String s2 = "SaurabhShirke";
		System.out.println("Concat: " +s2.concat(s1).concat(s));
		
		/*	 String "getBytes" method 	*/
		String alpha = "ABCDabcd";
		byte a[] = alpha.getBytes();
		for(int i=0; i<a.length; i++)
		{
			System.out.println("getBytes: " +a[i]);
		}
		
		/*	 String "intern" method 	*/
		String name = "Omkar";
		String name1 = new String("Omkar");
		String name2 = name.intern();
		System.out.println(name == name1);
		System.out.println(name2 == name1);
		System.out.println(name == name2);
		
		/* 	String "isEmpty" method 	*/
		String sa = "";
		String sa1 = "Omkar";
		System.out.println("isEmpty: " +sa.isEmpty());
		System.out.println("isEmpty: " +sa1.isEmpty());
		
		/* 	String "join" method 	*/
		System.out.println("j: " +s.join("/", "Omkar", "Shirke"));
		
		/* 	String "LastIndexOf" method 	*/
		System.out.println("LastIndexOf " +s.lastIndexOf("r"));
		
		/* 	String "split" method 	*/
		String b ="java string split method by javatpoint";  
		String c[] = b.split("\\s");
		for(int i=0; i<c.length; i++)
		{
			System.out.println("Split: " +c[i]);
		}
		
		/* 	String "toCharArray" method 	*/
		char ch[] = s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			System.out.println("toCharArray: " +ch[i]);
		}
		
		/* 	String "subString" method 	*/
		System.out.println("subString: " +s.substring(2, 10));
	}

}
