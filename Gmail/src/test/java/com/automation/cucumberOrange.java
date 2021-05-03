package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucumberOrange {
	WebDriver driver = null;
	@Before
	public void openBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	   
	}
	
	@BeforeStep
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");                     //here used table to not hardcode username and password
		driver.findElement(By.id("btnLogin")).click();  
	}


	
	@Then("successfully login into application")
	public void successfully_login_into_application() {
		WebElement wecome = driver.findElement(By.id("welcome"));
		Assert.assertNotNull(wecome); 
	}
	@Then("successfully login into  and edit application")
	public void successfully_login_into_and_edit_application() {
	    System.out.println("edit emplyoee");
	}
	@Then("successfully login into  and delete application")
	public void successfully_login_into_and_delete_application() {
		System.out.println("delete emplyoee");
	}

	@AfterStep
	public void signoff()  throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();  
	}

	@After
	public void logout() {
		driver.quit();
	}

}
