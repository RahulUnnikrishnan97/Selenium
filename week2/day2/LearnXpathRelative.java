package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpathRelative {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		driver.findElement (By.xpath("//input[@id='username']")).sendKeys ("Demosalesmanager");
		driver.findElement (By.xpath("//input[@id='password']")).sendKeys ("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		driver.findElement (By.xpath("//a[contains(text(),'CRM')]")). click();
		driver.findElement (By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement (By.xpath("//a[contains(text(),'Create')]")).click();
//		driver.findElement (By.id("accountName")).sendKeys("1234567890");
//		WebElement sourceDD = driver.findElement(By.name("industryEnumId"));
//		Select sec = new Select(sourceDD);
//		sec.selectByIndex(2);
		
		
				
		
		
		
		
		//WebDriverWait wait 
		//driver.close();
	}

	}


