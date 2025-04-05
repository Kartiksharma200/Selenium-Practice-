package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMethods {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	void openApp() throws InterruptedException {
		driver.manage().window().maximize();
			
	}
	
	@BeforeMethod
	void login() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	void verifyLogo() {
//		String str = driver.
		WebElement logo = driver.findElement(By.cssSelector("img[alt='client brand banner']"));
//		Boolean val =logo.isDisplayed();//true or false
//		if(!val) {
//			System.out.println("Test failed");
//		}else {
//			System.out.println("Test Passed");
//		}
		Assert.assertTrue(logo.isDisplayed());
		
	}
	
	@Test
	void verifyURL() {
			
		String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String accUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expUrl, accUrl);
		
		
	}
	
	
	
	@Test
	void dashboard() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Dashboard']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
	}
	
	@AfterMethod
	void logout() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
	}
	
	@AfterClass
	void afterLogout() throws InterruptedException {
		Assert.assertTrue(driver.getCurrentUrl().contains("auth/login"));
		
			
	}

}