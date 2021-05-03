package com.automation;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		JAVASCRIPT ONCLICK
//		driver.get("https://www.tsrtconline.in/oprs-web/");
//		 Thread.sleep(5000);
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeAsyncScript("validateBookingSearch()");
		
//		JAVASCRIPT SCROLL HIDDEN PART
//		driver.get("https://www.selenium.dev/");
//		 Thread.sleep(5000);
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("document.getElementsByName('submit')[0].scrollIntoView() ");
//		
		driver.get("https://www.thepancard.com/newpancard.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementsByName('DOB')[0].style.border = '4px solid green'");
		
		 Thread.sleep(5000);
		 driver.quit();

	}

}
