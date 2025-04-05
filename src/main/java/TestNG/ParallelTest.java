package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	
	WebDriver driver;
	
	
	@Parameters({"browser"})
	@Test(priority = 0)
	void openUrl(String browser) throws InterruptedException {
		
		switch(browser.toLowerCase())  // IT WILL BE ALL THE NAME IN XML BE IN LOWER CASE
		{
		case "chrome": driver = new ChromeDriver();
		break;
		case "edge" : driver = new EdgeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
		
		default: System.out.println("Invalid Browser Name");
		return;
		}
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);		
	}
	
	@Test(priority = 2)
	void logout() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();	
	}

}
