package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextField {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager .chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1/");
	      driver.findElement(By.linkText("Link Ticket")).click();
	      WebElement fromPlace = driver.findElement(By.id("fromPlaceName"));
//	      System.out.println(driver.findElement(By.id("fromPlaceName")).isDisplayed());
//	      System.out.println(driver.findElement(By.id("fromPlaceName")).isEnabled());
	      fromPlace.sendKeys("AP");
	      System.out.println(fromPlace.getAttribute("value"));
	      Thread.sleep(2000);
	      fromPlace.clear();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[text()='N G PADU OGL - ONGOLE - ADONI']")).click();
	      System.out.println(driver.findElement(By.xpath("//a[text()='N G PADU OGL - ONGOLE - ADONI']")).isEnabled());
	      Thread.sleep(2000);
	      driver.quit();

		
	}

}
