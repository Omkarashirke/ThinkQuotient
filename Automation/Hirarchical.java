//Hirarchical


class Tree
{
	String name = "Hapus";
}

class Hapus extends Tree
{
	void show()
	{
		System.out.println("Name of Tree ="+name);
	}
}

class Ratna extends Tree
{
	void change()
	{
		name = "Ratna";
		System.out.println("Change Name="+name);
	}
}

public class Hirarchical {

	public static void main(String[] args) 
	{
		
		Hapus h = new Hapus();
		h.show();
		
		Ratna r = new Ratna();
		r.change();

	}

}
