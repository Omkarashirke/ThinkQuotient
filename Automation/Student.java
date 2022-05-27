

import java.util.Scanner;

public class Student
{
	int id;
	String name;
	int marks;
	
	Student(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;
		this.marks=marks;
	}
	public String toString()
	{
		return "id="+id+", name="+name+", marks="+marks;
	}
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		Student s[] = new Student[2];
		
	   
	    for(int i=0; i<s.length; i++)
	    {
	    	System.out.println("Enter Id:");
	    	int id = sc.nextInt();
	    	System.out.println("Enter Name:");
	    	String name = sc.next();
	    	System.out.println("Enter Marks:");
	    	int marks = sc.nextInt();
	    	
	    	s[i] = new Student(id, name, marks);
	    }
	    for(int i=0;i<s.length; i++)
	    {
	    	System.out.println(s[i]);
	    }
	    
	}

}
