package day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\eclipse-workspace-Jai\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	TakesScreenshot screenshot = (TakesScreenshot )driver;
	
	// Temp Location
	
	File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	
	File f = new File ("C:\\Users\\SONY\\Desktop\\Fb\\Facebook.jpeg");
	
	FileUtils.copyFile(screenshotAs, f);
	
	WebElement Create = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
	File screenshotAs1 = Create.getScreenshotAs(OutputType.FILE);
	File f1 = new File ("C:\\Users\\SONY\\Desktop\\Fb\\Create New Account.jpeg");
	
	FileUtils.copyFile(screenshotAs1, f1);
	
	
}
}
