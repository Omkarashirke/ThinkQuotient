
class JoiningDate1
{
	int day;
	String month;
	int year;
	public void setDay(int day)
	{
		this.day = day;
	}
	public void setMonth(String month)
	{
		this.month = month;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getDay()
	{
		return day;
	}
	public String getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
}

class Job1
{
	int jobId;
	String profile;
	JoiningDate1 joiningDate;
	public void setJobId(int jobId)
	{
		this.jobId = jobId;
	}
	public void setProfile(String profile)
	{
		this.profile = profile;
	}
	public void setJoiningDate(JoiningDate1 joiningDate)
	{
		this.joiningDate = joiningDate;
	}
	public int getJobId()
	{
		return jobId;
	}
	public String getProfile()
	{
		return profile;
	}
	public JoiningDate1 getJoiningDate()
	{
		return joiningDate;
	}
}

public class Person1 
{
	int id;
	String name;
	Job1 job;
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setJob(Job1 job)
	{
		this.job = job;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Job1 getJob()
	{
		return job;
	}

	public static void main(String[] args) 
	{

		Person1 p = new Person1();
		p.setId(120);
		p.setName("Omkar S");
		
		p.setJob(new Job1());
		p.getJob().setJobId(111);
		p.getJob().setProfile("Developer");
		
		p.getJob().setJoiningDate(new JoiningDate1());
		p.getJob().getJoiningDate().setDay(25);
		p.getJob().getJoiningDate().setMonth("Sept");
		p.getJob().getJoiningDate().setYear(2022);
		
		System.out.println(p.getId()+"  "+p.getName()+"  "+p.getJob().getJobId()+"  "+p.getJob().getProfile()+"  "
				+p.getJob().getJoiningDate().getDay()+"/"+p.getJob().getJoiningDate().getMonth()+"/"+p.getJob().getJoiningDate().getYear());

	}

}
