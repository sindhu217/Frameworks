package com.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocaterTest {

	public static void main(String[] args) throws InterruptedException {
      WebDriverManager .chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.apsrtconline.in/oprs-web/");
//     driver.findElement(By.id("searchBtn")).click();
//     driver.findElement(By.name("searchBtn")).click();
//      driver.findElement(By.className("chkavailabilityBtn")).click();
     Thread.sleep(2000);
     driver.quit();

	}

}
