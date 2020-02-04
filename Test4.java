package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.amazon.com/");
		//myD.findElement(By.id("twotabsearchtextbox")).sendKeys("Fossil watches for men");
		myD.findElement(By.xpath("//*[contains(@id,'twotabs')]")).sendKeys("Fossil watches for men");
}
}