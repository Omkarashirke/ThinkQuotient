

public class StudentClass 
{

	int id;
	String name;
	
	public void getId()
	{
		id = 101;
		name = "Sandesh";
	}
	
	
	
	public void displayData()
	{
		getId();
		System.out.println(id+"   "+name);
	}
	
	public static void main(String[] args)
	{
		
		StudentClass s = new StudentClass();
		//s.getid();
		s.displayData();

	}

}
