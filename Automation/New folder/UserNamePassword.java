import java.util.Scanner;

class  PasswordLengthExceededException extends Exception
{
	String msg;
	
	PasswordLengthExceededException()
	{
		System.out.println("Password Length Should be Less than 8");
	}
	PasswordLengthExceededException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

class  PasswordLengthFailedException extends Exception
{
	String msg;
	
	PasswordLengthFailedException()
	{
		System.out.println("Password Length Should be Greater than 6");
	}
	PasswordLengthFailedException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

public class UserNamePassword 
{
	private static void passwordCheck(String password) throws PasswordLengthExceededException, PasswordLengthFailedException
	{
		if(password.length()>8)
		{
			throw new PasswordLengthExceededException("Password Length Should be Less than 8");
		}
		else if(password.length()<6)
		{
			throw new PasswordLengthFailedException("Password Length Should be Greater than 6");
		}
		else
		{
			System.out.println("Valid Password");
		}
	}


	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username:");
		String userName = sc.next();
		
		System.out.println("Enter the Password:");
		String password = sc.next();
		
		try
		{
			passwordCheck(password);
		}
		catch(PasswordLengthExceededException i)
		{
			System.out.println(i);
		}
		
		catch(PasswordLengthFailedException e)
		{
			System.out.println(e);
		}

	}

}
