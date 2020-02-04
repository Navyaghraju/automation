package p1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3
{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.gmail.com/");
		myPrint(myD.getTitle());
		Thread.sleep(2000);
		myD.findElement(By.linkText("Help")).click();
		Set<String> id=myD.getWindowHandles();
		Iterator<String> it=id.iterator();
		String vParent=it.next();
		String vChild=it.next();
		//myD.switchTo().window(vParent);
		//myPrint(myD.getTitle());
		myD.switchTo().window(vChild);
		myPrint(myD.getTitle());
		
		myD.findElement(By.partialLinkText("Community")).click();
		Thread.sleep(3000);
		myPrint(myD.getTitle());
		Thread.sleep(3000);
		myD.quit();
		
		
}

	private static void myPrint(String title)
	{
	
		System.out.println(title);
	}
}