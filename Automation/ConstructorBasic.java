

public class ConstructorBasic 
{
	int rollNum;
	String name;
	
	public void info(int rollNum, String name)
	{
		this.rollNum = rollNum;
		this.name = name;
		this.show();
	}
	public void show()
	{
		
		System.out.println(rollNum+ "  " +name);
	}
	
	public static void main(String[] args)
	{
		
		ConstructorBasic cb = new ConstructorBasic();
		cb.info(111 , "Omkar");
		//cb.show();

	}

}
