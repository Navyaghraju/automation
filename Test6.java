package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.amazon.com/");
		myD.findElement(By.id("twotabsearchtextbox")).sendKeys("Fossil watches for men");
		myD.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		myD.findElement(By.xpath("//*[text()='Fossil']")).click();
		Thread.sleep(2000);
		//myD.findElement(By.xpath("//*[contains(text(),'Gen 5')]")).click();
		//myD.findElement(By.xpath("(//*[contains(text(),'Gen 5')])[2]")).click();
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.xpath("//*[@id='nav-link-accountList']"))).build().perform();
		myD.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(4000);
		myD.quit();
}
}