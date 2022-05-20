

class Department2
{
	int dId;
	String dName;
	Department2(int dId, String dName)
	{
		this.dId = dId;
		this.dName = dName;
	}
	public String toString()
	{
		return dId+"   "+dName;
	}
}

public class Student100 
{
	int roll;
	String name;
	Department2 dept;
	Student100(int roll, String name, Department2 dept)
	{
		this.roll = roll;
		this.name = name;
		this.dept = dept;
	}
	public String toString()
	{
		return roll+"   "+name+"   "+dept;
	}

	public static void main(String[] args) 
	{
		
		Student100 s = new Student100(105, "Omkar S", new Department2(1, "ENTC"));
		System.out.println(s);
		
		

	}

}
