import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
	}

}
