
import java.util.Scanner;

public class StudentMarks 
{
	int id;
	String name;
	int marks;
	
	StudentMarks(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public String toString()
	{
		return "Id="+id+",Name="+name+",Marks="+marks;
	}
	void display()
	{
		if(marks>=60)
			System.out.println("Id="+id+",Name="+name+",Marks="+marks);
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size=");
		int size = sc.nextInt();
		
		StudentMarks sm[] = new StudentMarks[size];
		
		for(int i=0; i<sm.length; i++)
		{
			System.out.println("Enter Id:");
	    	int id = sc.nextInt();
	    	System.out.println("Enter Name:");
	    	String name = sc.next();
	    	System.out.println("Enter Marks:");
	    	int marks = sc.nextInt();
	    	
	    	sm[i] = new StudentMarks(id, name, marks);
		}
		
//		for(int i=0; i<sm.length; i++)
//		{
//			sm[i].display();
//		}
		for(StudentMarks s:sm)
		{
			s.display();
		}

	}

}
