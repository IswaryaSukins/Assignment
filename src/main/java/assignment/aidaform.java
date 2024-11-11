package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class aidaform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://my.aidaform.com/signup");
	    driver.findElement(By.name("nickname")).sendKeys("IswaryaSukin");
	    driver.findElement(By.name("email")).sendKeys("iswarya98842@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Sukin@246");
	    driver.findElement(By.name("confirm")).sendKeys("Sukin@246");
	    WebElement agree = driver.findElement(By.xpath("//span[text()='I have read and agree to the AidaForm ']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", agree);

	    WebElement submit = driver.findElement(By.xpath("//button[text()='Create My Free Account']"));
	    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	    executor1.executeScript("arguments[0].click();", submit);
	    driver.close();

	}

}
