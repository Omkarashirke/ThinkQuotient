
public class ClassStudent 
{
	public int rollNo = 100;
	int admissionNo = 500;
	protected int age = 24;
	private String courseId = "EJ";
	
	public void doPublic()
	{
		System.out.println("Roll Number= "+rollNo);
	}
	void doDefault() 
	{
		System.out.println("Admission No= "+admissionNo);
	}
	protected void doProtected()
	{
		System.out.println("Age= "+age);
	}
	private void doPrivate()
	{
		System.out.println("Course Id= "+courseId);
	}
	
	
	public static void main(String[] args) 
	{
		
		ClassStudent cs = new ClassStudent();
		cs.doPublic();
		cs.doDefault();
		cs.doProtected();
		cs.doPrivate();

	}

}
