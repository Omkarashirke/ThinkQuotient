


public class AccessModifierCheck extends AccessModifier {

	public static void main(String[] args)
	{
		//AccessModifier amr = new AccessModifier();
		//System.out.println("Num = "+amr.num);         			//Error- cant access
		//System.out.println("Public Num = "+amr.num1);	
		//System.out.println("private Num2 = "+amr.num2);			//Error- cant access
		//System.out.println("protected Num3 = "+amr.num3);			////Error- cant access
		AccessModifierCheck c=new AccessModifierCheck();
		System.out.println("Public Num = "+c.num1);
		System.out.println("protected Num3 = "+c.num3);

	}

}
