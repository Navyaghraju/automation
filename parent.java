package p1;

public class parent 
{
	int a=10;
	void display()
	{
		System.out.println("parent class");
	}
}
class child extends parent
{
	void display()
	{
	System.out.ptintln("child class");
	}
}
public class Sample2{
	public static void main(String[] args) 
	{
		child c=new child();
		c.display();
	}
}

