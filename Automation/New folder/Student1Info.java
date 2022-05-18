

public class Student1Info {

	public static void main(String[] args)
	{

		Student1 s = new Student1();
		s.setId(105);
		s.setName("Rohit");
		s.setMarks(500);
		s.setIsPlace(true);
		
		System.out.println(" Id: "+s.getId()+"\n Name: "+s.getName()+"\n Marks: "+s.getMarks()+"\n Is Placed: "+s.getIsPlaced());

	}

}
