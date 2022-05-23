
interface Cake 
{
	void bake();
}
class Strawberry implements Cake
{

	public void bake()
	{
		System.out.println("Baking Strawberry");
	}
}
class BlackForest  implements Cake
{

	public void bake()
	{
		System.out.println("Baking BlackForest ");
	}
}

public class Main {

	public static void main(String[] args)
	{
		
		Strawberry s = new Strawberry();
		s.bake();
		BlackForest b = new BlackForest();
		b.bake();

	}

}
