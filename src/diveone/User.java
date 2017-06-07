package diveone;
import java.util.*;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		String password;
		boolean result;
		System.out.println("user name");
		Scanner s=new Scanner(System.in);
		username=s.nextLine();
		System.out.println("password");
		password=s.nextLine();
		result=login(username,password);
		System.out.println(result);
	}
		
	public static boolean login(String username,String password)
	{
		if(username.equals("admin") && password.equals("admin"))
		{
	return true;
		}
		
		else
		{
			return false;
		}
	}
}

