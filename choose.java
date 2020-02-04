package p2;
import java.util.Scanner;
public class choose 
{
	public static void main(String[] args) {
		float res;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter no1");
		float n1=scn.nextFloat();
		System.out.println("enter no2");
		float n2=scn.nextFloat();
		System.out.println("enter opt");
		int opt=scn.nextInt();
		if(opt==1)
		{
			res=n1+n2;
			System.out.println("res="+res);
		}
		else if(opt==2)
		{
			res=n1-n2;
			System.out.println("res"+res);
		}
		else if(opt==3)
		{
			res=n1*n2;
			System.out.println("res"+res);
		}
		else if(opt==4)
		{
			res=n1/n2;
			System.out.println("res"+res);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	
}


