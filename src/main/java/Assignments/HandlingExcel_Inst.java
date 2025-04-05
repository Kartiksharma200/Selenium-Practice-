package Assignments;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingExcel_Inst {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.instagram.com/accounts/login/?hl=en");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	//READING DATA FROME THE FILE
		//FileInputStream file = new FileInputStream("C:\\Users\\10000\\eclipse-workspace\\Selenium-Test\\Test Data\\Instagram Assignment.xlsx");
		FileInputStream file = new FileInputStream("C:\\Users\\10000\\Downloads\\Instagram Assignment.xlsx");
        Workbook bok = WorkbookFactory.create(file);
        String username = bok.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
        String password = bok.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
        
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
        driver.findElement(By.cssSelector("[aria-label='Password']")).sendKeys(password);
        
        driver.findElement(By.cssSelector("button[type='submit'] div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
        
        
        WebElement error = driver.findElement(By.xpath("//div[@class='xkmlbd1 xvs91rp xd4r4e8 x1anpbxc x1m39q7l xyorhqc x540dpk x2b8uid']"));
        if(error.isDisplayed()) {
        	System.out.println("<-------Login Failed-------->");
        }else {
        	System.out.println("<--------Login Successful--------->");
        }
        
        Thread.sleep(3000);
        driver.quit();
	}

}
