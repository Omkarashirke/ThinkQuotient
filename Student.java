

public class Student {
	
	int id;
	String name;
	double per;

	public static void main(String[] args)
	{

		Student stud = new Student();
		stud.id = 001;
		stud.name = "Snadesh";
		stud.per = 78.26;
		
		System.out.println(stud.id+"   "+stud.name+"   "+stud.per);

		Student stud1 = new Student();
		stud1.id = 002;
		stud1.name = "Vijay";
		stud1.per = 59.36;
		
		System.out.println(stud1.id+"   "+stud1.name+"   "+stud1.per);

	}

}
