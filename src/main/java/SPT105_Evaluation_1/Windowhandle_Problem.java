package SPT105_Evaluation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		driver.getWindowHandle();
		
		if(driver.getTitle().contains("New Window")){
			System.out.println("successful");
		}else {
			System.out.println("Not successful");
		}
		

	}

}
