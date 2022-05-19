

public class Student1 
{
	int id;
	String name;
	int marks;
	boolean isPlaced=true;
	
	public void setId(int id)
	{
		this.id = id; 
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public void setIsPlace(boolean isPlaced)
	{
		this.isPlaced = isPlaced;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public  int getMarks()
	{
		return marks;
	}
	public boolean getIsPlaced()
	{
		return isPlaced;
	}

}
