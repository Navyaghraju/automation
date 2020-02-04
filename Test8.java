package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
	WebDriver myD = new ChromeDriver();
	myD.manage().window().maximize();
	myD.get("https://www.amazon.com/");
	
	myD.findElement(By.xpath("//*[text(),'Return']")).click();
	Thread.sleep(2000);
	//myD.findElement(By.name("submit")).click();
	
	//Thread.sleep(5000);
	myD.quit();
	

}
}