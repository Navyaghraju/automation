package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.amazon.com/");
		myD.findElement(By.id("twotabsearchtextbox")).sendKeys("PUMA Shoes for Men");
		myD.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/span/div/div[1]/div/div/div/ol/li[1]/div/div/span/a/div/img")).click();
		Thread.sleep(2000);
		myD.findElement(By.linkText("Back to results")).click();
		myD.quit();


	}

}
