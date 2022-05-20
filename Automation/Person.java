

class JoiningDate
{
	int day;
	String month;
	int year;
	JoiningDate(int day, String month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
}

class Job
{
	int jobId;
	String profile;
	JoiningDate joiningDate;
	Job(int jobId, String profile, JoiningDate joiningDate)
	{
		this.jobId = jobId;
		this.profile = profile;
		this.joiningDate = joiningDate;
	}
	public String toString()
	{
		return jobId+"  "+profile+"  "+joiningDate;
	}
}



public class Person 
{
	int id;
	String name;
	Job job;
	Person(int id, String name, Job job)
	{
		this.id = id;
		this.name = name;
		this.job = job;
	}
	public String toString()
	{
		return id+"  "+name+"  "+job;
	}

	public static void main(String[] args) 
	{
		
		Person p = new Person(101, "Omkar S", new Job(11, "Developer", new JoiningDate(12, "Jan", 2022)));
		System.out.println(p);

	}

}
