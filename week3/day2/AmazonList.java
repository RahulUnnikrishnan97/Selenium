package week3.day2;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {
	
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    // search for mobiles and click enter
    driver.findElement (By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
    // priint all the mobile prices displayed
    List<WebElement> mobileList = driver.findElements(By.className("a-price-whole"));
    System.out.println("The total number of price list are" +mobileList.size());
    List<String> list = new ArrayList<>();
    for(int i =0; i<mobileList.size(); i++ ) {
    	String text = mobileList.get(i).getText();
    	list.add(text);
    }
    System.out.println(list);
    driver.close();
    //WebElement ele = mobileList.get(2);
	//System.out.println(ele.getText());
}

}
