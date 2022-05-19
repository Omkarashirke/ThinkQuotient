

public class DefaultCon 
{
	int id;  
	String name;  
	
	public void display()
	{
		System.out.println(id+" "+name);
	}  
	  

	public static void main(String[] args) 
	{
		DefaultCon df1=new DefaultCon();   
		
		df1.display();  

	}

}
