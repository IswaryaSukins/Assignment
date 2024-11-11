package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetDiseaseAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://petdiseasealerts.org/");
	    driver.findElement(By.xpath("//a[text()='Stories']")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}

}
