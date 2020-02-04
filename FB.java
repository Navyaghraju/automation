package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.facebook.com/");
		myD.findElement(By.id("email")).sendKeys("navya@gmail.com");
		myD.findElement(By.id("pass")).sendKeys("1234");
		myD.findElement(By.id("u_0_b")).click();
		myD.findElement(By.partialLinkText("<a href=\"https://www.facebook.com/recover/initiate/?ars=facebook_login\" target=\"\">Forgotten password?</a>")).click();
		Thread.sleep(5000);
		
		myD.quit();

}
}