package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "E:\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("E:\\fileupload\\Selenium Notes.pdf");
		

	}

}
