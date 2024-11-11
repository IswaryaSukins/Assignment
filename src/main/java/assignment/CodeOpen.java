package assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://codepen.io/unknownUser7/pen/ZEdGLbq");
	    
	    driver.switchTo().frame("result");
	    driver.findElement(By.id("username")).sendKeys("user");
	    driver.findElement(By.id("password")).sendKeys("pass");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    
	    Thread.sleep(1000);
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    String text = alert.getText();
	    System.out.println(text);
	    alert.accept();
	    
	    String text2 = driver.findElement(By.xpath("//h1[text()='Welcome!']")).getText();
	    System.out.println(text2);
	    
	    if(text2.contains("Welcome")){
	    	System.out.println("Verified");
	    }else {
	    	System.out.println("Not Verified");
	    }
	    	
	    }
	}


