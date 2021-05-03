package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager .chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1/");
	      driver.findElement(By.linkText("Link Ticket")).click();
	      Thread.sleep(2000);
	      driver.quit();

	}

}
