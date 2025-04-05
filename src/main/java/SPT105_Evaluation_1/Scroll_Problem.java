package SPT105_Evaluation_1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Problem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll height of the Page and in pixel
		js.executeScript("window.scrollBy(0,1200)", "");		
		//Scroll to bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		//to intial page postion
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				
		System.out.println(js.executeScript("return window.pageYOffset"));
		System.out.println("Succesful");
				

	}

}
