package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static String t="Shinchan";
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.google.com/");
	    myD.findElement(By.name("q")).sendKeys(t);
		Thread.sleep(2000);
		myD.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		
		String s=myD.findElement(By.id("resultStats")).getText();
		System.out.println(s);
		String r=myD.findElement(By.name("q")).getAttribute("value");
		System.out.println(r);
		if(r.equals(t))
				{
			System.out.println("Yes");
				}
		else
		{
			System.out.println("FAIL");
		}
		myD.findElement(By.partialLinkText("Image")).click();
		
		myD.findElement(By.partialLinkText("El huracán Crayon Shin-chan, parte 4")).click();
		Thread.sleep(10000);
		myD.quit();

	}

}
