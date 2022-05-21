package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\eclipse-workspace-Jai\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement User = driver.findElement(By.id("email"));
		WebElement Pass = driver.findElement(By.name("pass"));
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(User,Keys.SHIFT).sendKeys("Greens");
		actions.keyUp(User,Keys.SHIFT).perform();
		
		actions.keyDown(Pass,Keys.SHIFT).sendKeys("Hello");
		actions.keyUp(Pass,Keys.SHIFT).perform();
		
		
		
		
}
}
