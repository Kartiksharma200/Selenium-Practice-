import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		//Scroll height of the Page and in pixel
		//js.executeScript("window.scrollBy(0,1200)", "");
		
		
		
		//Scroll to bottom
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//Thread.sleep(3000);
		//to intial page postion
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//System.out.println(js.executeScript("return window.pageYOffset"));
		
		
		//Scroll to the particular Element
		WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='News']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		//Zoom out and In
		

	}

}
