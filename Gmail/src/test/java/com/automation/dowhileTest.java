package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dowhileTest {
	public static void main(String[] args) {
		String input = "edge";
		System.out.println("enter");
		do {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
			driver.quit();
		}
		while(input.equals("ff"));
			System.out.println("end");

		
	}

}
