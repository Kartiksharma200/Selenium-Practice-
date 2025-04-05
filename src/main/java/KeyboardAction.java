

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		
		
		Actions act = new Actions(driver);
		//Keyboard Action
		WebElement ele = driver.findElement(By.id("inputText1"));
		ele.sendKeys("The Tittle is : Practice Page Text does not exixt");
		
		//crtl + A
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		
		//driver.close();
	}

}
