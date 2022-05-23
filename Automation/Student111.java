

public class Student111 
{
	int id;
	String name;
	Student111(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id+"   " +name;
	}
	

	public static void main(String[] args) 
	{
		
		Student111 s1 = new Student111(11, "Omkar");
		Student111 s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
//		Student111 s2 = new Student111(12, "Amit");
//		System.out.println(s2);

	}

}
