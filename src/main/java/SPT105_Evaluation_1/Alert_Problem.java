package SPT105_Evaluation_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Problem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		WebElement ale = driver.findElement(By.xpath("//button[@id='alertButton']"));
		ale.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.getText();
		System.out.println(alert.getText());
		
		if(alert.getText().equals("You clicked a button")) {
			System.out.println("Text Matched");
		}else {
			System.out.println("Text not Matched");
		}
		alert.accept();


	}

}
