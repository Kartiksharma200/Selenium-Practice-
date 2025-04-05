package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_radio_checkbox {
	
	WebDriver driver = new ChromeDriver();
	
	@Test(priority = 0)
	void openUrl() {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	@Test(priority = 1)
	void radio() {
		WebElement btn  = driver.findElement(By.xpath("//input[@value='radio2']"));
		btn.click();
		
	}
	
	@Test(priority = 2)
	void checkbox() {
		List <WebElement> box = driver.findElements(By.xpath("//input[@type ='checkbox']"));
		//WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		for(WebElement ele : box) {
			ele.click();
		}
		
	}

}
