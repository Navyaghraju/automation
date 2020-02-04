package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Times
{
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
	WebDriver myD = new ChromeDriver();
	myD.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	myD.manage().window().maximize();
	myD.get("https://www.gmail.com/");
	myD.getTitle();
	Thread.sleep(2000);
	myD.findElement(By.linkText("Help")).click();
	WebDriverWait wait=new WebDriverWait (myD,30);
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Help")));
	myD.findElement(By.linkText("Help")).click();
}
}