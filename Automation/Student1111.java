

class Department1
{
	int dId;
	String dName;
	public void setDId(int dId)
	{
		this.dId = dId;
	}
	public void setDName(String dName)
	{
		this.dName = dName;
	}
	public int getDId()
	{
		return dId;
	}
	public String getDName()
	{
		return dName;
	}
}
public class Student1111 
{
	int roll;
	String name;
	Department1 dept;
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDept(Department1 dept)
	{
		this.dept = dept;
	}
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
	public Department1 getDept()
	{
		return dept;
	}

	public static void main(String[] args) 
	{
		
		Student1111 s = new Student1111();
		s.setRoll(150);
		s.setName("Omkar S");
		s.setDept(new Department1());
		
		s.getDept().setDId(1);
		s.getDept().setDName("ENTC");
		
		System.out.println(s.getRoll()+"  "+s.getName()+"  "+s.getDept().getDId()+"  "+s.getDept().getDName());

	}

}
