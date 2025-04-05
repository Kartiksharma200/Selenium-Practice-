package Assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_signup_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kartik");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sharma");
		
		WebElement date =  driver.findElement(By.xpath("//select[@id='day']"));
		Select sle = new Select(date);
		sle.selectByVisibleText("11");
		
		WebElement months =  driver.findElement(By.xpath("//select[@id='month']"));
		Select sle2 = new Select(months);
		sle2.selectByVisibleText("Jun");
		
		WebElement years =  driver.findElement(By.xpath("//select[@id='year']"));
		Select sle3 = new Select(years);
		sle3.selectByVisibleText("2003");
		
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Jaishreeram");
		
		

	}

}
