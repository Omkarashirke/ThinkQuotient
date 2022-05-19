

public class CopyValue 
{
	int id;
	String name;
	
	public void details(int cid, String cname)
	{
		id = cid;
		name = cname;
	}
	
	public void display()
	{
		System.out.println(id+"   "+name);
	}

	public static void main(String[] args) 
	{

		CopyValue cv = new CopyValue();
		cv.details(103, "Vijay");
		cv.display();
		
		CopyValue cv1 = new CopyValue();
		cv1.details(cv.id, cv.name);
		cv1.display();
	}

}
