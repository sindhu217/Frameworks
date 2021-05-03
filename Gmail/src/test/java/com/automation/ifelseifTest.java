package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ifelseifTest {
	public static void main(String[] args) {
		WebDriver driver = null;
		String input ="edge";
		 System.out.println("start");
		 if(input.equals("chrome")) {
			WebDriverManager.chromedriver().setup() ;
			driver = new ChromeDriver();
		 }else if(input.equals("ie")) {
			 WebDriverManager.iedriver().setup() ;
				driver = new InternetExplorerDriver();
		 }else if(input.equals("edge")) {
			 WebDriverManager.edgedriver().setup() ;
				driver = new EdgeDriver();
	}else {
		System.out.println("invalid");
	}
		 driver.manage().window().maximize();
		 driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
		 driver.quit();
		 System.out.println("end");
	}

}
