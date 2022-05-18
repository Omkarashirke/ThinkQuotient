

public class EmpInfo {

	public static void main(String[] args) 
	{
		
		Employee e = new Employee();
		e.setID(105);
		e.setName("Amol");
		e.setSalary(50000);
		
		int id = e.getId();
		System.out.println("id="+id);
		
		String name = e.getName();
		System.out.println("Name="+name);
		
		double salary = e.getSalary();
		System.out.println("Salary="+salary);

	}

}
