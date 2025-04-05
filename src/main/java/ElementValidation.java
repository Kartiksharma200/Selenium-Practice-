import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
//		Verify tittle
		String title = driver.getTitle();
		if(title.equals("Practice Page")) {
			System.out.println("Tittle is " + title);
		}else {
			System.out.println("Tittle is not matched " + title);
		}
		
// get the attribute of the locator
        WebElement web = driver.findElement(By.xpath("//button[@id='openwindow']"));
        String attr = web.getAttribute("id");
        System.out.println(attr);
        
//Checking the text was matched or not
        WebElement text = driver.findElement(By.xpath("//legend[normalize-space()='Element Displayed Example']"));
        
//        String eletext = text.getText("Element Displayed Example");
//        if(eletext.contains("Element Displayed Example")) {
//        	
//        }
	}

}
