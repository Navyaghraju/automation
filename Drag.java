package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag 
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		//myD.switchTo().frame(0);
		//myD.switchTo().frame("name");
		myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//myD.findElement(By.id("draggable")).getText();
		Thread.sleep(2000);
		WebElement source=myD.findElement(By.id("draggable"));
		WebElement dest=myD.findElement(By.id("droppable"));
		Actions act =new Actions(myD);
		act.dragAndDrop(source,dest).build().perform();
		Thread.sleep(2000);
		
		myD.switchTo().defaultContent();
		myD.quit();
		
		
		
	}

	public static void myPrint(String vString) {
		System.out.println(vString);
		
	}
}
