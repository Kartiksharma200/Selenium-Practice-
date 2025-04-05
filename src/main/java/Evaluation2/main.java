package Evaluation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
	public class FirstScript {
		
		public void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://automationteststore.com/");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[@href='https://automationteststore.com/index.php?rt=product/category&path=68']")).click();
			
		}

	}

}
