package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonScrollExample {
	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement conditionsLink = driver.findElement(By.linkText("Conditions of Use & Sale"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(conditionsLink).perform();
		String conditionsText = conditionsLink.getText();
		System.out.println("Conditions of use and sale is" +conditionsText);
		
		
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        File destinationFile = new File("screenshot.png");
//        FileUtils.copyFile(screenshotFile, destinationFile);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Snaps/Webpage.jpg");
		FileUtils.copyFile(src,destination);
        
        // Close the browser
        driver.quit();
		
		
		
	}

}
