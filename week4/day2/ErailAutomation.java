package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailAutomation {
	
	public static void main(String[] args) {
		
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id ("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id ("txtStationTo")).sendKeys("MDU");
		WebElement sortOnDateCheckbox = driver.findElement(By.id("chkSelectDateOnly"));
		if (sortOnDateCheckbox.isSelected()) {
			sortOnDateCheckbox.click();
		}
		List<WebElement> trainNameElements = driver.findElements(By.xpath("//a[text() = 'Click here to sort on Train Name']/following:: table/tbody/tr/td[2]"));
		
		
		
		
				
		
		
	}
}

