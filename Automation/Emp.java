
import java.util.Scanner;

class Deptartment
{
	String dName;
	public Deptartment(String dName)
	{
		this.dName = dName;
	}
	public String toString()
	{
		return "Dept="+dName;
	}
	
}

public class Emp 
{
	int id;
	String name;
	int salary;
	Deptartment dept;
	
	Emp(int id, String name, int salary, Deptartment dept)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;	
	}
	public String toString()
	{
		return "id="+id+", name="+name+", salary="+salary+", dept="+dept;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		Emp e[] = new Emp[size];
		for(int i=0; i<e.length; i++)
		{
			System.out.println("Enter Id:");
	    	int id = sc.nextInt();
	    	System.out.println("Enter Name:");
	    	String name = sc.next();
	    	System.out.println("Enter Salary:");
	    	int salary = sc.nextInt();
	    	System.out.println("Enter Dept:");
	    	String dept = sc.next();
	    	
	    	
	    	e[i] = new Emp(id, name, salary, new Deptartment(dept));
	    	
		}
		for(int i=0;i<e.length; i++)
 	    {
			if(e[i].dept.dName.equals("Hr"))
 	    	System.out.println(e[i]);
 	    }

	}

}
