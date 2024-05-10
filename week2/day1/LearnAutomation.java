package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class LearnAutomation {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		driver.findElement (By.id("username")).sendKeys ("Demosalesmanager");
		driver.findElement (By.id("password")).sendKeys ("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement (By.linkText("CRM/SFA")). click();
		driver.findElement (By.linkText("Accounts")).click();
		driver.findElement (By.linkText("Create Account")).click();
		driver.findElement (By.id("accountName")).sendKeys("1234567890");
		WebElement sourceDD = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(2);
		
		
				
		
		
		
		
		//WebDriverWait wait 
		//driver.close();
	}

}
