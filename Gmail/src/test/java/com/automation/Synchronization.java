package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
//		IMPLICT
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://my.microfocus.com/");
//		driver.findElement(By.partialLinkText("Login")).click();
//		driver.findElement(By.id("username")).sendKeys("sindhu");
//		Thread.sleep(5000);
//		driver.quit();
		
//		EXPLICT
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://my.microfocus.com/");
//		driver.findElement(By.partialLinkText("Login")).click();
//		Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, 400);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
//		driver.findElement(By.id("username")).sendKeys("sindhu");
//		Thread.sleep(5000);
//		driver.quit();
		
//		VISIBILITY
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://fast.com/");
//		WebDriverWait wait = new WebDriverWait(driver, 400);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("show-more-details-link")));
//		driver.findElement(By.id("show-more-details-link")).click();
//		Thread.sleep(5000);
//		
//		
//		driver.quit();
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://fast.com/");
//		WebDriverWait wait = new WebDriverWait(driver, 400);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("show-more-details-link")));
//		driver.findElement(By.id("show-more-details-link")).click();
//		Thread.sleep(5000);
//		driver.quit();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
