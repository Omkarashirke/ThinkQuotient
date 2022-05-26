
import java.util.Scanner;
import java.util.Arrays;

class Employee3
{
	int empId;
	String eName;
	int sal;
	Employee3(int empId, String eName, int sal)
	{
		this.empId = empId;
		this.eName = eName;
		this.sal = sal;
	}
	public String toString()
	{
		return empId+"   "+eName+"   "+sal;
	}
}

public class Department1
{
	int deptId;
	String deptName;
	Employee3 emp[];
	Department1(int deptId, String deptName, Employee3 emp[])
	{
		this.deptId = deptId;
		this.deptName = deptName;
		this.emp = emp;
	}

	public String toString()
	{
		return deptId+"   "+deptName+"   "+Arrays.toString(emp);
	}


	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		Department1 d[] = new Department1[size];
		
		for(int i=0; i<d.length; i++)
		{
			System.out.println("Enter the deptId:");
			int deptId = sc.nextInt();
			System.out.println("Enter the deptName:");
			String deptName = sc.next();
			
			Employee3 emp[] = new Employee3[2];
			for(int j=0; j<emp.length; j++) 
			{
				System.out.println("Enter the empId:");
				int empId = sc.nextInt();
				System.out.println("Enter the eName:");
				String eName = sc.next();
				System.out.println("Enter the sal:");
				int sal = sc.nextInt();
				
				emp[j] = new Employee3(empId, eName, sal);
			}
			
			d[i] = new Department1(deptId, deptName, emp);
			
		}
//		for(int i=0; i<d.length; i++)
//		{
//			System.out.println("   "+d[i]);
//		}
		for(int i=0; i<d.length; i++)
		{
			Employee3 e[] = d[i].emp;
			for(int j=0; j<e.length; j++) {
			if(e[j].sal>50000)
//			if(d[i].emp[i].sal>(50000))
			System.out.println(e[i]);
			}
		}

	}

}
