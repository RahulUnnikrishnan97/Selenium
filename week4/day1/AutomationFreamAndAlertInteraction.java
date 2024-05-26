package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFreamAndAlertInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		driver.switchTo().alert().accept();
		String ConfirmText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(ConfirmText);
		
		
	}
	
}
