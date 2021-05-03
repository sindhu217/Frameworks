package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ifTest {
	public static void main(String[] args) {
		
		String input = "chrome";
		System.out.println("start");
		  if(input.equals("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
			  
		  }
		  System.out.println("end");
	}

}
