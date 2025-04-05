package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//DRAG AND DROP
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.xpath("//img[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']")));
		a.build().perform();
		
		Thread.sleep(2000);
		
		a.dragAndDrop(driver.findElement(By.xpath("//img[@id='draggable']")),driver.findElement(By.xpath("//div[@id='dropzone2']")));
		a.build().perform();

	}

}
//FILE UPLOAD ASSIGNMENT

//package Assignments;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class file_Upload {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		//System.setProperty("webdriver.chrome.driver", "E:\\");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.automationtesting.in/FileUpload.html");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("E:\\fileupload\\Selenium Notes.pdf");
//		
//
//	}
//
//}

