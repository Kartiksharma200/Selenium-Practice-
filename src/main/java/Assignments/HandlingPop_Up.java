package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPop_Up {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
		
		//Handle First Pop Up
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//Handle Second Pop Up
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Handle Third Pop Up
		driver.findElement(By.id("promptBox")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		

	}

}
