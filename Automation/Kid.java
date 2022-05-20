

public class Kid 
{
	void readBook() 
	{
		System.out.println("Kid Read Book");
	}
	void readBook(String a, String b) 
	{
		System.out.println(a+"   "+b);
	}
public static void main(String[] args)
	{
		
		BigKid b = new BigKid();
		b.readBook();
		b.readBook("Marathi", "English");
	
		Kid k1 = new Kid();
		k1.readBook();
		k1.readBook("Marathi", "English");
//		Teenager k2 = new Teenager();
//		k2.readBook("Marathi", "Hindi");
	}
}	

//class Teenager extends Kid
//{
//	void readBook() 
//	{
//		System.out.println("Teenager Read Book");
//	}
//	void readBook(String a, String b) 
//	{
//		System.out.println(a+"   "+b);
//	}
//}
class BigKid extends Kid
{
	void readBook() 
	{
		System.out.println("Big Kid Read Book");
	}
	void readBook(String a, String b) 
	{
		System.out.println(a+"   "+b);
	}
	

}
