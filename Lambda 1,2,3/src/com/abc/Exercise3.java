package com.abc;

public class Exercise3 {
	public static void main(String[]args)
	{
		String name="Abhi";
		String pasw="Abhi@123";
		Authentication p=((username,password)->{if(username.equals(name)&&password.equals(pasw))
				return true;
		else
			return false;
		});
		System.out.println(p.checkIdentity("Abhi","Abhi@123"));
		
	}

}
interface Authentication
{
	boolean checkIdentity(String username,String password);
}
