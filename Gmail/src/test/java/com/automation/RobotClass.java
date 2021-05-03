package com.automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//	driver.get("https://www.naukri.com/");
//	driver.findElement(By.id("wdgt-file-upload")).click();
//	Thread.sleep(5000);
//	Robot robot = new Robot();
//	for(int index=1;index<=3;index++){robot.keyPress(KeyEvent.VK_TAB);     //JUST TO CLOSE WINDOW TAB
//	robot.keyRelease(KeyEvent.VK_TAB);
//	Thread.sleep(5000);
//	}
//	robot.keyPress(KeyEvent.VK_ENTER);
//	robot.keyRelease(KeyEvent.VK_ENTER);
//	Thread.sleep(5000);
	
//	Robot robot = new Robot();
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.keyPress(KeyEvent.VK_V);
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	robot.keyRelease(KeyEvent.VK_V);
//	Thread.sleep(5000);
//	 for(int index=1;index<=2;index++) {
//		 robot.keyPress(KeyEvent.VK_TAB);      //COPY PATH AND EXCUTE PROGRAM
//		 robot.keyRelease(KeyEvent.VK_TAB);
//		 Thread.sleep(5000);
//	 }
//	 robot.keyPress(KeyEvent.VK_ENTER);
//	 robot.keyRelease(KeyEvent.VK_ENTER);
//	 Thread.sleep(5000);
	
//StringSelection selection = new StringSelection("D:\\hhh.txt");
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//	Robot robot = new Robot();
//	robot.keyPress(KeyEvent.VK_CONTROL);
//	robot.keyPress(KeyEvent.VK_V);
//	robot.keyRelease(KeyEvent.VK_CONTROL);
//	robot.keyRelease(KeyEvent.VK_V);
//	Thread.sleep(5000);
//	for(int index=1;index<=2;index++) {       //WRITE PATH ON CODE AND EXCUTE
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		 Thread.sleep(5000);
//	 } 
//	robot.keyPress(KeyEvent.VK_ENTER);
//	 robot.keyRelease(KeyEvent.VK_ENTER);
//	 Thread.sleep(5000);
	
//	driver.get("https://www.selenium.dev/downloads/");
//	driver.findElement(By.linkText("3.141.59")).click();
//	 Thread.sleep(5000);
//	 Robot robot = new Robot();    //DOWNLOAD
//	 robot.keyPress(KeyEvent.VK_LEFT);
//	 robot.keyRelease(KeyEvent.VK_LEFT);
//	 Thread.sleep(5000);
//	 robot.keyPress(KeyEvent.VK_ENTER);
//	 robot.keyRelease(KeyEvent.VK_ENTER);
//	 Thread.sleep(5000);
	driver.quit();
	}
}
