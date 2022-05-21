package fram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\eclipse-workspace-Jai\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize();
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@src='ads.html']"));
	
	Thread.sleep(3000);
	
	driver.switchTo().frame(frame);

	WebElement banner = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	banner.click();	
	
	driver.switchTo().defaultContent();
	
	WebElement txtdemo = driver.findElement(By.xpath("//font[contains(text(),'THIS IS A DEMO PAGE FOR TESTING')]"));
	System.out.println(txtdemo.getText());	
}
}
