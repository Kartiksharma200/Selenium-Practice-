

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_first {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/elements");
		
		//Locators
		
//		WebElement ele = driver.findElement(By.name("username"));
//		Thread.sleep(3000);
//		ele.click();
//		
		WebElement ele = driver.findElement(By.id("item-0"));
		Thread.sleep(4000);
		ele.click();
		
	}

}
