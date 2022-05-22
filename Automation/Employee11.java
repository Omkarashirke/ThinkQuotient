



class Department
{
	int dId;
	String dName;
	Department(int dId, String dName)
	{
		this.dId = dId;
		this.dName= dName;
	}
	public String toString()
	{
		return dId+ "   " +dName;
	}
	
}


public class Employee11
{
	int id;
	String eName;
	int salary;
	Department dept;
	Employee11(int id, String eName, int salary, Department dept)
	{
		this.id = id;
		this.eName = eName;
		this.salary = salary;
		this.dept = dept;
	}
//	void display()
//	{
//		System.out.println(id+"  "+eName+"  "+salary+"  "+dept.dId+"  "+dept.dName);
//	}
	public String toString()
	{
		return id+"   "+eName+"   "+salary+"   "+dept; 
	}

	public static void main(String[] args)
	{
//		
//		Department d = new Department(100, "EJ");
//		Employee11 e = new Employee11(1000, "Omkar", 25000, d);
//		e.display();
		Employee11 e = new Employee11(1000, "Omkar", 25000, new Department(100,"EJ"));
		System.out.println(e);

	}

}
