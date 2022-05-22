//Coverient


class Parent1
{
//	public Animal show()
//	{
//		return new Animal();
//	}
//	public Number show()
//	{
//		return 500;
//	}
	public Object show()
	{
		return "Hiiii";
	}
}

public class Child1 extends Parent1
{
//	public Dog show()
//	{
//		return new Dog();
//	}
//	public Float show()
//	{
//		return 56.00f;
//	}
	public String show()
	{
		return "Welcome";
	}
	
	public static void main(String[] args) 
	{
		
		Child1 c =new Child1();
		//c.show();
		System.out.println(c.show());
		

	}

}
