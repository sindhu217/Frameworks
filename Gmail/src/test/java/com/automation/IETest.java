package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IETest {

	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();
		 WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");

	}

}
