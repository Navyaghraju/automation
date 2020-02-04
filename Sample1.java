package p1;
class A
{ 
private int pgno;
	public int getPgno()
	{
	return pgno;
}

public void setPgno(int pgno)
{
	if(pgno>0)
	{
		System.out.println("valid");
		this.pgno = pgno;
}
	else
	{
		System.out.println("invalid input");
		System.exit(0);
	}
}
}

public class Sample1 
{

	public static void main(String[] args) 
	{
	A a=new A();
	a.setPgno(-100);
	System.out.println(a.getPgno());
		
	}
}
