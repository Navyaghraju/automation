package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task 
{
	
	
	public static String []a1= {"100","200","300"};
	public static String []a2 = {"10","20","30"};
	public static String []a3= {"50","75","100"};
	public static String []a4= {"500","100","400"};
	public static String []a5= {"50","20","10"};
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("http://www.youcandealwithit.com//");
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"))).build().perform();
		Thread.sleep(2000);
		myD.findElement(By.partialLinkText("Calculators & Resources")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		myD.findElement(By.partialLinkText("Budget Calculator")).click();
		Thread.sleep(2000);
		
		for (int i=0;i<3;i++)
		{
		Thread.sleep(1000);	
		myD.findElement(By.id("food")).sendKeys(a1[i]);
		Thread.sleep(1000);
		myD.findElement(By.id("clothing")).sendKeys(a2[i]);
		Thread.sleep(1000);
		myD.findElement(By.id("shelter")).sendKeys(a3[i]);
		Thread.sleep(1000);
		myD.findElement(By.id("monthlyPay")).sendKeys(a4[i]);
		Thread.sleep(1000);
		myD.findElement(By.id("monthlyOther")).sendKeys(a5[i]);
		
		
		String re=myD.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("Monthly Expense is::"+re);
		Thread.sleep(1000);
		String ri=myD.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println("Monthly Income is::"+ri);
		
		float expense=Float.parseFloat(re);
		float income=Float.parseFloat(ri);
		
		if(expense>income)
		{
			System.out.println("Very Poor in Saving.....");
		}
		else
		{
			System.out.println("You are Warren Buffet....");
			
		}
		Thread.sleep(5000);
		System.out.println();
	    myD.findElement(By.className("reset")).click();
	    Thread.sleep(5000);
		}
		Thread.sleep(3000);
		myD.quit();
		
}
}
