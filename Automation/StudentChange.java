

public class StudentChange 
{
	int id;
	String name;
	
	public void info()
	{
		id = 105;
		name = "Omkar";
	}
	public void display()
	{
		System.out.println((id=106)+"   "+(name="Amol"));
	}
	
	public static void main(String[] args) 
	{
		StudentChange sc = new StudentChange();
		sc.info();
		sc.display();

	}

}
