

public class ParameterizedCon 
{
	 int id;  
	   String name;  
	   
	    public ParameterizedCon(int i,String n)
	    {  
	    id = i;  
	    name = n;  
	    }  
	    
	    public void display()
	    {
	    	System.out.println(id+" "+name);
	    }  
	   

	public static void main(String[] args) 
	{
		 
		ParameterizedCon pc1 = new ParameterizedCon(111,"Omkar");  
	    
	    pc1.display();  
	   

	}

}
