import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom_js {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//To zoom in window
		js.executeScript("document.body.style.zoom='150%'");
	}

}
