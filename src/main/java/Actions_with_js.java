import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_with_js {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//JavaScript Executor
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//JavascriptExecutor js = driver;
		
		
		//sendKeys
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kartik");
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Kartik')", name);
		
		//click
		WebElement click = driver.findElement(By.cssSelector("button[name='start']"));
		js.executeScript("arguments[0].click()", click);

	}

}
