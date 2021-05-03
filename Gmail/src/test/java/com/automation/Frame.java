package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		example:1
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
//		driver.switchTo().frame("iframeResult");
//		 WebElement element = driver.findElement(By.id("cars"));
//		 Select select = new Select(element);
//		 select.selectByIndex(0);
   driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
   driver.switchTo().frame(0);
   driver.findElement(By.linkText("org.openqa.selenium")).click();
   driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.linkText("TakesScreenshot")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	driver.findElement(By.linkText("ChromeDriver")).click();
	driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.quit();
		
	}

}
