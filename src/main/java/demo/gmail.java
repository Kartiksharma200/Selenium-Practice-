package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?ifkv=AVdkyDmkyrkeGrnhlmKMdoc8W8qRHBDPuPUFiMTyTX_u50Nf4h7A3U7f6Vpzh9S71vEr1W0Uo7aFXA&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S741597582%3A1738236675928351&ddm=1");
		
		
		
	   // WebElement createbtn = driver.findElement(By.xpath("//a[@href='https://accounts.google.com/signin'][1]"));
	    //createbtn.click();
	    
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kartik123@gmail.com");
	}

}
