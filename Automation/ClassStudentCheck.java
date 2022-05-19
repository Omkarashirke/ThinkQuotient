


public class ClassStudentCheck extends ClassStudent {

	public static void main(String[] args) 
	{
		
		ClassStudentCheck c = new ClassStudentCheck();
		c.doPublic();
		//c.doDefault();		Show error in out side of class;
		c.doProtected();
		//c.doPrivate(); 		Show error in out side of class;

	}

}
