package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		example:click
//		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//		driver.switchTo().frame("iframeResult");
//		 WebElement mouse = driver.findElement(By.xpath("//button[text()='Try it']"));
//		 org.openqa.selenium.interactions.Actions action= new Actions(driver);
//		 action.click(mouse).perform();
//		 Thread.sleep(5000);
//		 Alert alert = driver.switchTo().alert();
//		 System.out.println(alert.getText());
//		 alert.sendKeys("hii");
//		 alert.accept();
//		 Thread.sleep(5000);
		
//		EXAMPLE:DOUBLECLICK
//		driver.get("https://api.jquery.com/dblclick/");
//		driver.switchTo().frame(0);
//		WebElement divtag = driver.findElement(By.tagName("div"));
//		Actions actions = new Actions(driver);
//		actions.doubleClick(divtag).perform();
//		Thread.sleep(5000);
		
//		EXAMPLE:DRAG AND DROP
//		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(0);
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement destination = driver.findElement(By.id("droppable"));
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(source, destination).perform();
//		Thread.sleep(5000);
		
//		Example:CLICK AND HOLD ; RELEASE
//		driver.get("https://jqueryui.com/droppable/");
//		driver.switchTo().frame(0);
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement destination = driver.findElement(By.id("droppable"));
//		Actions actions = new Actions(driver);
//		actions.clickAndHold(source).perform();
//		actions.release(destination).perform();
//		Thread.sleep(5000);
//		driver.quit();
		
//Example:DRAGANDDROPBY		
//driver.get("https://jqueryui.com/slider/");
//driver.switchTo().frame(0);
//WebElement num = driver.findElement(By.xpath("//div[@id = 'slider']/span"));
//Actions actions = new Actions(driver);
//actions.dragAndDropBy(num, 200, 0).perform();
//Thread.sleep(5000);
//driver.quit();
		
//		Example:MOVE TO ELEMENT
//		driver.get("https://www.dtdc.in/");	
//		driver.findElement(By.id("closebutton")).click();
//		WebElement value = driver.findElement(By.linkText("Tracking"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(value).perform();
//		Thread.sleep(5000);
//		driver.quit();
		
//		Example:CONTEXTCLICK
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		WebElement value = driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions actions = new Actions(driver);
//		actions.contextClick(value).perform();
//		Thread.sleep(5000);
//		driver.quit();
		
		
//		Example:KEYBOARD
//		driver.get("https://www.goibibo.com/");
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(5000);
//		actions.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(5000);
//		driver.quit();
//		
		
		driver.get("https://www.apsrtconline.in/oprs-web/");
		WebElement destination = driver.findElement(By.id("fromPlaceName"));
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

	}

}
