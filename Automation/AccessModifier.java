

public class AccessModifier {
	
	int num = 50;
	public int num1 = 64;
	private int num2 = 32;
	protected int num3 = 100;

	public static void main(String[] args)
	{
		
		AccessModifier a = new AccessModifier();
		System.out.println("Num = "+a.num);
		System.out.println("Public Num1 = "+a.num1);
		System.out.println("private Num2 = "+a.num2);
		System.out.println("protected Num3 = "+a.num3);

	}

}
