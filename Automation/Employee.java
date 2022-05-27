
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int sal;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSal() {
		return sal;
	}

	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Salary=" + sal;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();

		Employee e[] = new Employee[size];

		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter the Id:");
			int id = sc.nextInt();
			System.out.println("Enter the Name:");
			String name = sc.next();
			System.out.println("Enter the Salary:");
			int sal = sc.nextInt();
//			Employee emp = new Employee();
//			e[i] = emp;
			e[i]=new Employee();
			e[i].setId(id);
			e[i].setName(name);
			e[i].setSal(sal);
		}

		for (Employee emp : e) {
			System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getSal());
		}
		sc.close();
	}

}
