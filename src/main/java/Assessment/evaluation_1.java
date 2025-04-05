package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class evaluation_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		//WebElement tittle = driver.findElement(By.id("Layer_1"));
		if(driver.getTitle().contains("Selenium")) {
			System.out.println("Tittle was matched");
		}else {
			System.out.println("Tittle was not matched");
		}
		
		
		WebElement dowload = driver.findElement(By.xpath("//span[normalize-space()='Downloads']"));
		dowload.click();
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/downloads/")) {
			System.out.println("Url is Correct");
		}else {
			System.out.println("Url is Not correct");
		}

	}

}
