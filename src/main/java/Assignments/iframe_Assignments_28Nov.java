package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Assignments_28Nov {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://v1.training-support.net/selenium/iframes");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']")));
		driver.findElement(By.xpath("//button[@id='actionButton']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']")));
		driver.findElement(By.xpath("//button[@id='actionButton']")).click();
		driver.switchTo().defaultContent();

	}

}
