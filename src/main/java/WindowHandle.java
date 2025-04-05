import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//maximize the window size
        driver.manage().window().maximize();
        //Launching the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
     //   Thread.sleep(3000);
     //   driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        
        
     //   Thread.sleep(3000);
        
//        	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
//        	driver.switchTo().defaultContent();
//        	
        //driver.close();
        String intialwindow = driver.getWindowHandle();
        System.out.println(intialwindow);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        
        String firstwindow = driver.getWindowHandle();
        System.out.println(firstwindow);
        
        Set<String> windowset = driver.getWindowHandles();
        
        //Iterator
        
        Iterator<String> itr = windowset.iterator();
        
        //next()
        String id1 = itr.next();   //first tab id
        String id2 = itr.next();   //second tab id
        
        System.out.println(id1  + "      " + id2);
       
       Thread.sleep(3000);
        
        
        driver.switchTo().window(id2); // Switch to second tab
        
        //To print an web tittle
        Thread.sleep(2000);
      //  System.out.println(driver.getTitle());
        
        
        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
        
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB); //WindowType.window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        

	}

}
