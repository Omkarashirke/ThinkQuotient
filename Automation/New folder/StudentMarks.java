

public class StudentMarks {
	int id;
	String name;
	int s1;
	int s2;
	int s3;
	float per;
	
	public void get(int sid, String sname, int phy, int chy, int maths)
	{
		id = sid;
		name = sname;
		s1 = phy;
		s2 = chy;
		s3 = maths;
		
	}
	
	public void get1()
	{
		
		int sum = s1 + s2 + s3;
		per= (sum * 100f)/300;
	}
	
	public void show()
	{
		System.out.println(id+"  " +name+ "  " +s1+ "  " +s2+"  "+s3+ "  "+per);
	}

	public static void main(String[] args)
	{
		StudentMarks s = new StudentMarks();
		s.get(001, "Amol", 65, 70, 85);;
		s.get1();
		s.show();

	}

}
