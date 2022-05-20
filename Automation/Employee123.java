

class Department3
{
	int dept_id;
	String dept_name;
	public void setDept_Id(int dept_id)
	{
		this.dept_id = dept_id;
	}
	public void setDept_Name(String dept_name)
	{
		this.dept_name = dept_name;
	}
	public int getDept_Id()
	{
		return dept_id;
	}
	public String getDept_Name()
	{
		return dept_name;
	}
}
class MyDate1
{
	int day;
	String month;
	int year;
	public void setDay(int day)
	{
		this.day = day;
	}
	public void setMonth(String month)
	{
		this.month = month;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getDay()
	{
		return day;
	}
	public String getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
}

public class Employee123
{
	int id;
	String name;
	int salary;
	Department3 dept;
	MyDate1 mydate;
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public void setDept(Department3 dept)
	{
		this.dept = dept;
	}
	public void setMyDate(MyDate1 mydate)
	{
		this.mydate = mydate;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public Department3 getDept()
	{
		return dept;
	}
	public MyDate1 getMyDate()
	{
		return mydate;
	}

	public static void main(String[] args) 
	{
		
		Employee123 e = new Employee123();
		e.setId(110);
		e.setName("Omkar S");
		e.setSalary(30000);
		
		e.setDept(new Department3());
		e.getDept().setDept_Id(1);
		e.getDept().setDept_Name("ENTC");
		
		e.setMyDate(new MyDate1());
		e.getMyDate().setDay(15);
		e.getMyDate().setMonth("Apr");
		e.getMyDate().setYear(2022);
		
		System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary()+"  "+e.getDept().getDept_Id()+"  "
		+e.getDept().getDept_Name()+"  "+e.getMyDate().getDay()+"/"+e.getMyDate().getMonth()+"/"+e.getMyDate().getYear());

	}

}
