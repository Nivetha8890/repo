package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
	public static String url = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_";
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url + "alert");
		// Alert Box

		switchFrame();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		// Confirm Box

		driver.get(url + "confirm");
		switchFrame();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		// Prompt Box
		driver.get(url + "prompt");
		switchFrame();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Nivi");
		driver.switchTo().alert().accept();
		driver.quit();

	}

	public static void switchFrame() {
		WebElement iframeElement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
	}
}
