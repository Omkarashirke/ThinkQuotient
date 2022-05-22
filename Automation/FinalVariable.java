
class FinalVariable 
{
	final int n=100;
	
	/* cannot assign a value to final variable n
    n = 45;
    ^*/
	
	
//	void display()
//	{
//		n= 45;
//		System.out.println("Num=" +n);
//		//n=200;
//	}
	

	public static void main(String[] args) 
	{
		
		FinalVariable f = new FinalVariable();
		System.out.println("Num=" +f.n);
		//f.run();
	}

}
