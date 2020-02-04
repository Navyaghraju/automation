package p1;

public class user 
{
private String user;
private int pass;

	public String getUser()
	{
	return user;
}

public void setUser(String user) 
{
	if(user="navya")
	{
	System.out.println("valid name");	
	this.user = user;
}
	else
	{
		System.out.println("invalid name");
	}
}

public int getPass()
{
	return pass;
}

public void setPass(int pass)
{
	if(pass=123) 
	{
	System.out.println("valid password");
		this.pass = pass;
}
	else
	{
		System.out.println("invalid password");
	}
}
}
	public static void main(String[] args) 
	{
		user a=new user();
		u.setuser("navya");
		System.out.println(u.getuser());
		pass p=new pass();
		p.setpass(123);
		System.out.println(p.getpass());
	}

}
