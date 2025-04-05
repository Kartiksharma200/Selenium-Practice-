

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Booktoscrape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		//Visit url
		driver.get("https://books.toscrape.com/index.html");
		
		//Maximize the screen size
		driver.manage().window().maximize();
		
		WebElement tittle = driver.findElement(By.xpath("//a[normalize-space()='Books to Scrape']"));
		tittle.click();
		
		//Verify that tittle is matched
		String title = driver.getTitle();
		if(title.equals("Books to Scrape")) {
			System.out.println("Tittle is Matched");
		}else {
			System.out.println("Tittle is not matched");
		}
		
		//Go to the next page
		driver.findElement(By.xpath("//a[normalize-space()='next']")).click();
		
		//To Add book in cart
		driver.findElement(By.xpath("//li[1]//article[1]//div[2]//form[1]//button[1]")).click();
		
		

	}

}
