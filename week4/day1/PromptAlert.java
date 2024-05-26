package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PromptAlert {
	
	public static void main(String[] args) throws InterruptedException { 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//span[@class = 'ui-button-text ui-c'])[6]")).click();
		
		Alert promptalert = driver.switchTo().alert(); 
		
		String message = "Hello, Leafground";
		promptalert.sendKeys("AlertHandling");
		Thread.sleep(3000);
		
		promptalert.dismiss(); 
		
		// verify String text 
		String text = driver.findElement(By.id("confirm_result")).getText(); 
		System.out.println (text);
		
		if (text.equalsIgnoreCase("User cancelled the prompt")) {
			
			System.out.println("Alert Dismissed" +text);
		}
		else
		{
			System.out.println("User accepted" +text);
		}
		}
	}


