

import java.util.Scanner;

public class Student1 
{
	int roll;
	String name;
	int age;
	int marks;
	Student1(int roll, String name, int age, int marks)
	{
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String toString()
	{
		return roll+"   "+name+"   "+age+"   "+marks;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		Student1 s[] = new Student1[size];
		for(int i=0; i<s.length; i++)
		{
			System.out.println("Enter the Roll:");
			int roll = sc.nextInt();
			System.out.println("Enter the Name:");
			String name = sc.next();
			System.out.println("Enter the Age:");
			int age = sc.nextInt();
			System.out.println("Enter the Marks:");
			int marks = sc.nextInt();
			
			s[i] = new Student1(roll, name, age, marks);
		}
		for(Student1 i:s)
		{
			if(i.marks>=60 && i.age<15)
				System.out.println("   "+i);
		}

	}

}
