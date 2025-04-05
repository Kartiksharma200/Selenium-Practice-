package SPT105_Evaluation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Problem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		WebElement text = driver.findElement(By.id("sampleHeading"));
		if(text.equals("This is a sample page")) {
			System.out.println("Text matched");
		}else {
			System.out.println("Text not matched");
		}
		
	}

}
