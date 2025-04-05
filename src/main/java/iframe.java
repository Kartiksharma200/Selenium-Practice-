import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		//Go to the frame 2
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]")));
		//write an text in the frame
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Kartik");
		//exist the frame
		driver.switchTo().defaultContent();
		
	}

}
