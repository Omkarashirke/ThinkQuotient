

class Address
{
	int pinCode;
	String city;
	public void setPinCode(int pinCode)
	{
		this.pinCode = pinCode;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public int getPinCode()
	{
		return pinCode;
	}
	public String getCity()
	{
		return city;
	}
	
}

public class Person11
{
	int p_Id;
	String p_Name;
	Address add;
	public void setP_Id(int p_Id)
	{
		this.p_Id = p_Id;
	}
	public void setP_Name(String p_Name)
	{
		this.p_Name = p_Name;
	}
	public void setAdd(Address add)
	{
		this.add = add;
	}
	public int getP_Id()
	{
		return p_Id;
	}
	public String getP_Name()
	{
		return p_Name;
	}
	public Address getAdd()
	{
		return add;
	}

	public static void main(String[] args) 
	{
		
//		Address a = new Address();
//		a.setPinCode(415807);
//		a.setCity("Ratnagiri");
//		
//		Person11 p = new Person11();
//		p.setP_Id(100);
//		p.setP_Name("Omkar");
//		p.setAdd(a);
//		
//		System.out.println(a.getPinCode()+"  "+a.getCity());
//		System.out.println(p.getP_Id()+"  "+p.getP_Name());
		
		Person11 p = new Person11();
		p.setP_Id(100);
		p.setP_Name("Omkar");
		p.setAdd(new Address());
		
		p.getAdd().setPinCode(415807);
		p.getAdd().setCity("ratnagiri");
		
		System.out.println(p.getP_Id()+"  "+p.getP_Name());
		System.out.println(p.getAdd().getPinCode()+"   "+p.getAdd().getCity());

	}

}
