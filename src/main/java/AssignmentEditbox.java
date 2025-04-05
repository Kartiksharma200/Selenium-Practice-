import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentEditbox {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//To vist the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//screen size maximum 
		
		driver.manage().window().maximize();
		
		//click on the Radio button
		
		driver.findElement(By.xpath("//input[@class='radioButton']")).click();
		
		//suggestion class example
		
		WebElement cls = driver.findElement(By.id("autocomplete"));
		cls.click();
		cls.sendKeys("India");
		
		//Drop down
		
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		
		Select select = new Select(drop);
		select.selectByVisibleText("Option2");
		
		
		//Check Box
		
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement ele : checkBox) {
			ele.click();
		}
		
		

		
		
		
	}

}
