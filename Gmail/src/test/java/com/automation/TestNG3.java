package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG3 {
	WebDriver driver= null;
	@Parameters({"browser"})
	@BeforeTest
	public void mainBrowser(@Optional("chrome")String input)  throws Exception{
		
		switch (input) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 break;
		}
		
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	}
	@Test(dataProvider = "getData")
	public void login(String login,String password ) throws Exception {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(login);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		String actualValue=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();     //ASSERTED VALIDIATION TO CARTVALUES
		String exceptedValue="1";
		Assert.assertEquals(actualValue, exceptedValue);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name ="getData")	
	public Object[][] getData(){
		Object[][] data= {
				{"standard_user","secret_sauce"}
		};
		return data;
	}	
	
	@AfterTest
	public void closeBrowser() throws Exception{
	Thread.sleep(5000);
	driver.quit();
	}
	
	
	

	

}
