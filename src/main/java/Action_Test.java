import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
        
		Actions action = new Actions(driver);
		
		WebElement desktop = driver.findElement(By.cssSelector(".nav-link.dropdown-toggle[href='https://demo.opencart.com/en-gb/catalog/desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='Mac (1)']"));
		
		action.moveToElement(desktop).build().perform();
		
	}

}
