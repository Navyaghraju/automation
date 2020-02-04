package p1;
class Animal {
	void Eat()
	{
	
	}
	void Sleep()
	{
	}
}
class cat extends Animal
{
	void Eat()
	{
		System.out.println("cat");
	}
	void Sleep()
	{
		System.out.println(" cat sleeping");
	}
}
	class Lion extends Animal
	{
		void Eat()
		{
			System.out.println("lion");
		}
		void Sleep()
		{
			System.out.println(" Lion sleeping");
		}
	}
	class Forest
	{
		void take(Animal a)
		{
			a.Eat();
			a.Sleep();
		}
	}
	
public class Sample3
{
	public static void main(String[] args) 
	{
		cat c=new cat();
		Lion l=new Lion();
		Forest f=new Forest();
		f.take(c);
		f.take(l);
	}
}



