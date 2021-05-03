package com.automation;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	driver.switchTo().frame("iframeResult");
	 WebElement ListDrop = driver.findElement(By.id("cars"));
	  Select select = new Select(ListDrop);
//	  System.out.println(select.isMultiple());
	  select.selectByIndex(0);
	  select.selectByVisibleText("Opel");
	  select.selectByValue("audi"); 
//	Thread.sleep(2000);
//	select.deselectAll();
//	select.deselectByIndex(2);
//	select.deselectByVisibleText("Volvo");
//	select.deselectByValue("audi");
//	System.out.println(select.getOptions().size());
//	System.out.println(select.getAllSelectedOptions().size());
//java.util.List<WebElement> list = select.getOptions();
java.util.List<WebElement> list = select.getAllSelectedOptions();
for(WebElement element :list) {
	System.out.println(element.getText());
}
	}

}
