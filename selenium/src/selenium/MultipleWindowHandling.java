package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {
	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException {

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		
		
		
		
		System.out.println("First button");
		WebElement clickElement = driver.findElement(By.id("button1"));
		clickElement.click();
		Set<String> AllWindowHandles = driver.getWindowHandles();
		String window1 = (String) AllWindowHandles.toArray()[0];
		String window2 = (String) AllWindowHandles.toArray()[1];
		
		driver.switchTo().window(window2);
		gettingURL();
		driver.switchTo().window(window1);
		Thread.sleep(5000);
		
		System.out.println("Second button");
		WebElement clickElement1 = driver.findElement(By.cssSelector("button[onclick='newMsgWin()']"));
		clickElement1.click();
		driver.switchTo().window(window2);
		gettingURL();
		driver.switchTo().window(window1);
		Thread.sleep(5000);
		
		System.out.println("Third button");
		WebElement clickElement2 = driver.findElement(By.cssSelector("button[onclick='newBrwTab()']"));
		clickElement2.click();
		driver.switchTo().window(window2);
		gettingURL();
		driver.switchTo().window(window1);
		
		closingWindow();
		driver.quit();
	}

	public static void gettingURL() {
		String str = driver.getCurrentUrl();
		System.out.println(str);

	}

	public static void closingWindow() {
		driver.close();
	}
}
