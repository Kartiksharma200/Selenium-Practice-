import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus_Test {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Roorkee");
		
		driver.findElement(By.xpath("//div[@class='destination input-box']")).sendKeys("New Delhi");
		
		driver.findElement(By.xpath("//div[@class=\"rdc-login\"]")).click();
		
		
		
	}

}
