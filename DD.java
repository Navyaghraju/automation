package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://register.rediff.com/register/register.php?FormName=user_details");
		myD.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Navya");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("Navya@rediffmail.com");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Navya123*");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[contains(@name,'confirm')]")).sendKeys("Navya123*");
		Thread.sleep(2000);
		myD.findElement(By.className("nomargin")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("//*[@src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("//*[text()='USA / Canada (+1)']")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[@type='radio' and @value='f']")).click();
		Thread.sleep(2000);
		
		Select s=new Select(myD.findElement(By.id("country")));
		s.selectByIndex(6);
		Thread.sleep(2000);
		s.selectByValue("9");
		Thread.sleep(2000);
		s.selectByVisibleText("India");
		Thread.sleep(4000);
	
		Select c=new Select(myD.findElement(By.xpath("//select[contains(@name,'city')]")));
		c.selectByIndex(3);
		Thread.sleep(2000);
		c.selectByVisibleText("Bangalore");
		Thread.sleep(4000);
		myD.close();
}
}
