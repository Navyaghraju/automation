package p1;
import java.io.IOException;
import java.util.Scanner;

public class Homepage {
	public static void main(String[] args) throws IOException 
	{	nav x =new nav();
		Scanner a=new Scanner(System.in);
		System.out.println("enter browser");
		String s = a.nextLine();
		x.abc(s);
 		System.out.println(x.closeApp());

}
}
