package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		driver.findElement(By.linkText("Show Prompt")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		alert.accept();
//		alert.dismiss();
//		alert.sendKeys(null);
		System.out.println(alert.getText());
		alert.sendKeys("hi");
		alert.accept();
		
		

	}

}
