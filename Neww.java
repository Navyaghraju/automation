package p1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neww
{
	public static WebDriver myD;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");	
	     myD=new ChromeDriver();
	     myD.manage().window().maximize();
	     myD.get("www.google.com");
	     String url=(myD.getCurrentUrl());
	     System.out.println("Title is:"+myD.getTitle());
	     System.out.println("URL is:"+myD.getCurrentUrl());
	     if(url.equals("www.google.com"))
	     {
	    	 System.out.println("Test pass");
	     }
	     else
	     {
	    	 System.out.println("Test fail");
	     }
	     
	     myD.close();
	}

}
