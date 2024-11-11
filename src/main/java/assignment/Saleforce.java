package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Saleforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notificatons");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://login.salesforce.com/");
	    driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
	    driver.findElement(By.id("password")).sendKeys("leaf@2024");
	    driver.findElement(By.id("Login")).click();
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    
	    WebElement oppur = driver.findElement(By.xpath("//p[text()='Opportunities']"));
	    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	    executor1.executeScript("arguments[0].click();", oppur);

	    WebElement element = driver.findElement(By.xpath("//table[contains(@class,'slds-table forceRecordLayout')]/tbody[1]/tr[1]/th[1]/span[1]/a[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Email']"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
		
		
		driver.findElement(By.xpath("//input[contains(@class,'default input')]")).sendKeys("iswaryasukin4@gmail.com");
		//driver.findElement(By.xpath("//body[@aria-label='Email Body']")).sendKeys("I have completed the Selenium Challenge 13");
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@class='standardField input']")).sendKeys("I've done Selenium Challenge13");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		
		driver.close();
		

	}

}
