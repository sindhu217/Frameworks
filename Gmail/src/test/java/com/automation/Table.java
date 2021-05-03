package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		FINDING NUMBER OF TABLES
//		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
//		System.out.println(driver.findElements(By.xpath("//table")).size());
//		System.out.println(driver.findElements(By.tagName("table")).size());
//		Thread.sleep(5000);
//        driver.quit();
		
//		FING NUMBER OF ROWS
//		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
//		System.out.println(driver.findElements(By.xpath("//table[@id = 'example']//tr")).size());
		
//		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
//		System.out.println(driver.findElements(By.xpath("(//table[@id = 'example']//tr)[1]//th")).size());
		
//		GETTING TEXT FROM TABLE
//		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
//		WebElement table = driver.findElement(By.xpath("//table[@id = 'example']"));
//		System.out.println(table.getText());
		
//		FINDING TEXT BY ROW
//		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
//		WebElement table = driver.findElement(By.xpath("(//table[@id = 'example']//tr)[5]"));
//		System.out.println(table.getText());
//		  FINDING ELEMENT ROW CELL
//		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
//		WebElement cell = driver.findElement(By.xpath("((//table[@id = 'example']//tr)[2]//td)[2]"));
//		System.out.println(cell.getText());
		
//		CALENDER TABLE
		
//		 driver.get("https://www.tsrtconline.in/oprs-web/");
//		 Thread.sleep(5000);
//		 driver.findElement(By.id("txtJourneyDate")).click();
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("(//a[text() ='14'])[2]")).click();
		 Thread.sleep(5000);
		 driver.quit();
		 
	}

}
