package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/iframe-practice-page/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(200,0)", "");
		driver.switchTo().frame("iframe1");
		System.out.println("frame1 clicked");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Nivetha");

		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Madhan");
		

		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.switchTo().frame("iframe2");

		List<WebElement> tabs = driver.findElements(By.cssSelector(".ui-tabs-anchor"));
		for (WebElement tab : tabs) {
			tab.click();
			String tabText = tab.getText();
			System.out.println(tabText);
			Thread.sleep(2000);
			//Test commit
			

		}
		
		driver.switchTo().defaultContent();

		driver.quit();
	}

}
