

import java.util.Scanner;
import java.util.Arrays;

class StudInfo
{
	int id;
	String name;
	int marks;

	StudInfo(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public String toString()
	{
		return id+"   "+name+"   "+marks;
	}
	

}
class Student4
{
	StudInfo temp;
	StudInfo sInfo[];
	Student4(StudInfo sInfo[])
	{
		this.sInfo = sInfo;
	}
	public String sortRecords()
	{
		for(int i=0; i<sInfo.length; i++)
		{
			for(int j=i+1; j<sInfo.length; j++)
			{
				if(sInfo[i].marks>sInfo[j].marks)
				{
					 temp=sInfo[i];
					sInfo[i]=sInfo[j];
					sInfo[j]=temp;
					
				}
			}
		}
		return Arrays.toString(sInfo)+"   ";
	}
	
	public String showRecords()
	{
		return Arrays.toString(sInfo)+"   ";
	}

	
}


public class FiveStudent {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Student4 s[] = new Student4[1];
		System.out.println("Student Information:"+"\n");
		for(int i=0; i<s.length; i++)
		{
			StudInfo si[] = new StudInfo[5];
			for(int j=0; j<si.length; j++) 
			{
				System.out.println("Enter the Id:");
				int id = sc.nextInt();
				System.out.println("Enter the Name:");
				String name = sc.next();
				System.out.println("Enter the Marks:");
				int marks = sc.nextInt();
				
				si[j] = new StudInfo(id, name, marks);
			}
			s[i] = new Student4(si);			
		}
		
		for(int i=0; i<s.length; i++)
			{
				for(int j=0; j<s.length; j++)
				{
					System.out.println("   "+s[i].showRecords());
				}	
			}
		System.out.println("Sort:   "+"\n");
		for(int i=0; i<s.length; i++)
		{
			for(int j=0; j<s.length; j++)
			{
				System.out.println("   " +s[i].sortRecords());
			}	
		}

	}

}
