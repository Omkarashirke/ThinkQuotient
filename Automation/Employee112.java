

class Department
{
	int dept_id;
	String dept_name;
	Department(int dept_id, String dept_name)
	{
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	public String toString()
	{
		return dept_id+"   " +dept_name;
	}
}

class MyDate
{
	int day;
	String month;
	int year;
	MyDate(int day,	String month,	int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
}

public class Employee112 
{
	int id;
	String name;
	int salary;
	Department dept;
	MyDate mydate;
	Employee112(int id, String name, int salary, Department dept, MyDate mydate)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.mydate = mydate;
	}
	public String toString()
	{
		return id+"  "+name+"  "+salary+"  "+dept+"  "+mydate;
	}

	public static void main(String[] args) 
	{
		
		Employee112 e = new Employee112(110, "Omkar S", 40000, new Department(1, "ENTC"), new MyDate(10, "March", 2022));
		System.out.println(e);

	}

}
