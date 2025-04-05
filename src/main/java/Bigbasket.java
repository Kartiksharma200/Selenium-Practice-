import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		WebElement banana = driver.findElement(By.xpath("//img[@title='fresho! Banana - Robusta 1 kg']"));
		banana.click();
		Thread.sleep(2000);
		
		
		WebElement Addtocart = driver.findElement(By.xpath("//button[@class='Button-sc-1dr2sn8-0 CTA___StyledButton-sc-yj3ixq-5 kYQsWi bYACar']"));
		Addtocart.click();
	}

}
