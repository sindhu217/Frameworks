package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class ifelseTest {
	public static void main(String[] args) { 
		WebDriver driver = null;
		String input = "edge";
		System.out.println("start");
		if(input.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			
		}else {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
		driver.quit();
		System.out.println("end");
		
	}

}
