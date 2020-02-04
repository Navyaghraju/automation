package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		myD.manage().window().maximize();
		myD.get("http://demo.automationtesting.in/Alerts.html");
	myD.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
	myD.switchTo().alert().accept();
	myD.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	myD.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
	myD.switchTo().alert().dismiss();	
	myD.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
	myD.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
	myD.switchTo().alert().sendKeys("Testing");
	myD.switchTo().alert().accept();
	myD.close();
	
	
	}
}
