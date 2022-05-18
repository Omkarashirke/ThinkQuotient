

public class AccessModifier1 {

	public static void main(String[] args) 
	{
		
		AccessModifier am = new AccessModifier();
		System.out.println("Num = "+am.num);
		System.out.println("Public Num1 = "+am.num1);
		//System.out.println("private Num2 = "+am.num2);		////Error- cant access
		System.out.println("protected Num3 = "+am.num3);
	}

}
