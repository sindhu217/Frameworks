package com.automation;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Windows {
public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
String expectedTitle = "CrossBrowserTesting App";
driver.get("https://smartbear.com/product/testcomplete/overview/");
String mainWindowID = driver.getWindowHandle();
driver.findElement(By.partialLinkText("Login")).click();
driver.findElement(By.linkText("CrossBrowserTesting")).click();
Set<String> windowHandles = driver.getWindowHandles();


System.out.println("Number of Windows/Browsers:" + windowHandles.size());
for (String windowID : windowHandles) {
driver.switchTo().window(windowID);
String actualTitle = driver.getTitle();
if (actualTitle.equals(expectedTitle)) {
break;
}
}
driver.findElement(By.id("inputEmail")).sendKeys("SINDHU");
Thread.sleep(1000);
driver.close();
Thread.sleep(1000);
driver.switchTo().window(mainWindowID);
driver.close();
}
}