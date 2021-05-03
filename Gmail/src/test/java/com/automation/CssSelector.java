package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager .chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.apsrtconline.in/oprs-web/");
//	      driver.findElement(By.cssSelector("input[value='Check Availability']")).click();
	      driver.findElement(By.cssSelector("input[title='Search']")).click();
//	      driver.findElement(By.cssSelector("input[type='button']")).click();
	      Thread.sleep(2000);
	      driver.quit();

	}

}
