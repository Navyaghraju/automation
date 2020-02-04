package p1;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class nav {
	public  WebDriver myD;
	public  String vurl ="https://www.yahoo.com";
	 String ux;
	
	public  String func() throws IOException
	{ 
		myD.manage().window().maximize();
		
		myD.get(vurl);
		ux =myD.getCurrentUrl();
		
		if(ux.equals(vurl))
		{
			return "PASS";
		}
		else
		{
			File scrFile=(File)((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile,new File("C:\\Users\\slk\\Desktop\\xyz\\abcd.jpg"));
			return "FAIL";
		}
		
	}
	

	public void abc(String sa) throws IOException
	{

		if(sa.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");	
			myD=new ChromeDriver();
			System.out.println(func());
		}

		else if(sa.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars\\geckodriver.exe");	
			myD=new FirefoxDriver();
			System.out.println(func());	
		}

	}
	public  String closeApp()
	{ 
		String vFlag="FAIL";
		myD.close();
		vFlag="closeApp test case PASS";
		return vFlag;
	}
}
	


